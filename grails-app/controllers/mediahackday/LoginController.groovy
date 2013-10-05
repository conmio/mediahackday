package mediahackday

class LoginController {

    def authenticationService
    static defaultAction = "login"
    def login() {
        log.info "User has arrived at Login"
        render( view: "/pages/login")
    }
    def authenticate () {
        log.info "User Login is being authenticated"
        authenticationService.authenticate( params.username, params.password )// just a very basic test
        render "this is the auth"
    }

    def logout(){

        session.invalidate()
        log.info "User is Logging Out"
        render "this is the logout"

    }

    def signup(){
        log.info "User is Signing Up"
        // Success to sign up or not?



        // Temp
        session.setAttribute("testLogin", true)
        // Success
        redirect(controller: "main")
    }
}
