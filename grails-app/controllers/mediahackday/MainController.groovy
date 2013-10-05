package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {

    def httpService
    def index() {

        List<Headline> headlines =  httpService.getHeadlines()
        println request.isLoggedIn

        log.info("headlines: " + headlines.size())
        render(view: "/pages/index", model: [headlines: headlines])

    }
}
