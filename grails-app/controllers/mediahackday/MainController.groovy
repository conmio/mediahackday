package mediahackday

import com.conmio.mediahackday.article.Article

class MainController {
    def afp4WService
    def storyfulService
    def grailsApplication

    static defaultAction = "index"


    def index() {
        List<Article> articles = []

        try {
            if(params.channel_id == null || params?.channel_id == "") {
                articles.addAll(storyfulService.getArticles())
                articles.addAll(afp4WService.getArticles())
            }
            else {
                if (grailsApplication.config.afp4w.api.IPTC.mapping.keySet().contains(params.channel_id)) {
                    articles = afp4WService.getArticles(params.channel_id)
                }
                else {
                    articles = storyfulService.getArticles(params.channel_id)
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
    def addSub(){
        if(params.channel){
            UserStatusCheckJob.channels.add(params.channel)
        }
        render "Done"
    }
    def local() {
        List<Article> articles = storyfulService.getAllArticles()

        render(view: "/pages/local", model: [articles: articles])
    }
    
}
