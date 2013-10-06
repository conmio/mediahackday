package com.mediahackday.article

import com.conmio.mediahackday.article.Article
import com.mediahackday.ArticleService

import java.text.SimpleDateFormat

class StoryfulService implements  ArticleService {
    static transactional = false

    def grailsApplication
    def httpService


    Article getArticle(def articleJson) {
        Article article = new Article()

        article.headline = articleJson.get("title_clean")
        article.byline = ""
        article.summary = articleJson?.summary
        article.location = articleJson?.location
        article.shortUrl = articleJson.get("short_url")
        article.pubDate  = new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ss'Z'").parse(articleJson?.published_at)
        article.profileImageUrl = articleJson?.lead_image?.variants?.standard?.toString()

        return article
    }

    def getArticles(){
        getArticles("")
    }


    def getArticles(String channelId) {
        List<Article> articleList = []
        String apiUrl

        if (channelId == "") {
            apiUrl = grailsApplication.config.storyful.api.stories.url
        }
        else {
            apiUrl = grailsApplication.config.storyful.api.base.url + grailsApplication.config.storyful.api.channel.url.mapping.get(channelId)
        }


        log.info "Storyful retrival from" + apiUrl

        try {
            def resp = httpService.request(apiUrl, "POST", ["per_page": "10"])

            articleList = resp?.stories?.collect{ item -> getArticle(item) }

        }
        catch (e) {
            log.error("Could not retrieve Articles, " + e.message)
        }

        return articleList[0..Math.min(9, articleList.size())]
    }
}
