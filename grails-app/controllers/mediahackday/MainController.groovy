package mediahackday

import com.conmio.mediahackday.headline.Headline

class MainController {
    def httpService
    static defaultAction = "index"


    def index() {

        List<Headline> headlines =  httpService.getHeadlinesData()
        // render view: "/index"
        println("headlines: " + headlines.size())
        render(view: "/index", model: [headlines: headlines])
    }
}
