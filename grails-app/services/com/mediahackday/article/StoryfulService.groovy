package com.mediahackday.article

import com.conmio.mediahackday.article.Article
import com.mediahackday.ArticleService

class StoryfulService implements  ArticleService {
    static transactional = false
    def grailsApplication
    def httpService



    def getArticles(){
        List<Article> articleList = []
        String apiUrl = grailsApplication.config.storyful.api.stories.url

        log.info "Storyful retrival from" + apiUrl

        try {
            def resp = httpService.request(apiUrl, "POST", ["access_token": grailsApplication.config.storyful.api.access.token, "per_page": "10"])

            articleList = resp?.stories?.collect{ item -> new Article(item) }

        }
        catch (e) {
            log.error("Could not retrieve Articles, " + e.message)
        }
        return articleList

    }


    def getArticles(String channelId) {
        List<Article> articleList = []
        String apiUrl = grailsApplication.config.storyful.api.base.url + grailsApplication.config.storyful.api.channel.url.mapping.get(channelId)

        log.info "Storyful retrival from" + apiUrl

        try {
            def resp = httpService.request(apiUrl, "POST", ["access_token": grailsApplication.config.storyful.api.access.token, "per_page": "10"])

            articleList = resp.stories.collect{ item -> new Article(item) }

        }
        catch (e) {
            log.error("Could not retrieve Articles, " + e.message)
        }

        return articleList
    }
}
