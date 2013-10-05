package mediahackday

import com.conmio.mediahackday.article.Article

class MainController {
    def afp4WService
    def storyfulService

    static defaultAction = "index"


    def index() {
        List<Article> articles = []

        // List temp = storyfulService.getArticles()
        try {
            if(params.channel_id == null || params?.channel_id == "") {
                articles = storyfulService.getArticles()
            }
            else {
                articles = storyfulService.getArticles(params.channel_id)
            }
        }
        catch (e) {
            log.info("Failed to fetch headlines")
        }
        println("!!!!!"+ articles.size())
        render(view: "/pages/index", model: [articles: articles])

    }
}
