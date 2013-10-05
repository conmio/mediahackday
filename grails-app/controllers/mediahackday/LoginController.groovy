package mediahackday

class LoginController {

    static defaultAction = "login"
    def login() {
        log.info "Login Controller login"
        render "this is the login"
    }
    def authenticate () {
        log.info "Login Controller authenticating"
        render "this is the auth"
    }

    def logout(){
        log.info "Logging Out"
        render "this is the logout"

    }
}
