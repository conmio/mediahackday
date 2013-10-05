package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {

    def headlineRepository
    def index() {

        List<Headline> headlines =  headlineRepository.getHeadlines()
        println request.isLoggedIn

        log.info("headlines: " + headlines.size())
        render(view: "/pages/index", model: [headlines: headlines])

    }
}
