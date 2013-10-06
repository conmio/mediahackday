package mediahackday

import com.conmio.mediahackday.article.Article

class MainController {
    def afp4WService
    def storyfulService
    def grailsApplication

    static defaultAction = "index"


    def index() {
        List<Article> articles = []

        // List temp = storyfulService.getArticles()
        try {
            if(params.channel_id == null || params?.channel_id == "") {
                articles = afp4WService.getArticles() + storyfulService.getArticles()
                 println("sssss")
            }
            else {
                if (grailsApplication.config.afp4w.api.IPTC.mapping.keySet().contains(params.channel_id)) {
                    println(params.channel_id)
                    articles = afp4WService.getArticles(params.channel_id)
                }
                else {
                    articles = storyfulService.getArticles(params.channel_id)
                    println(params.channel_id)
                }

            }
        }
        catch (e) {
            log.info("Failed to fetch headlines")
        }

        render(view: "/pages/index", model: [articles: articles])

    }

    def settings() {
        render(view: "/pages/settings")
    }
}
