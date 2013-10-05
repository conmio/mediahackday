package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {
    def channelService
    def storyfulService

    static defaultAction = "index"


    def index() {
        List<> headlines = []

        List temp = storyfulService.getArticles()
        try {
            if(params.channel_id == null || params?.channel_id == "") {
                headlines =  channelService.getChannelHeadlines()
            }
            else {
                headlines =  channelService.getChannelHeadlines(params.channel_id)
            }
        }
        catch (e) {
            log.info("Failed to fetch headlines")
        }
        // println request.isLoggedIn

        // log.info("headlines: " + headlines.size())
        render(view: "/pages/index", model: [headlines: headlines])

    }
}
