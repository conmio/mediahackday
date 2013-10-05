package mediahackday

class MainController {

    static defaultAction = "index"
    def index() {
        log.info "User has arrived to main Controller."
        render view: "/pages/index"
       // render " This is a page."
    }
}
