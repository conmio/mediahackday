package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {
    def httpService

    static defaultAction = "index"
    def index() {
<<<<<<< HEAD
        log.info "User has arrived to main Controller."
        render view: "/pages/index"
       // render " This is a page."
=======

        List<Headline> headlines =  httpService.getHeadlinesData()
       // render view: "/index"
        println("headlines: " + headlines.size())
        render(view: "/index", model: [headlines: headlines])
>>>>>>> 5a80dc57f55a8e24b8b489d81b4f278214fdefe4
    }
}
