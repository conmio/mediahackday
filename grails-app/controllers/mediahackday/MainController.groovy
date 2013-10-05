package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {
    def channelService
    static defaultAction = "index"


    def index() {
        List<Headline> headlines =  channelService.getChannelHeadlines()
        println request.isLoggedIn

        render(view: "/pages/index", model: [headlines: headlines])

    }
}
