package mediahackday

class AuthenticationFilters {

    def authenticationService
    def filters = {
        loginCheck(controller: '*', action: '*', controllerExclude: 'login') {
            before = {
                if(authenticationService.authenticate(session)){
                    log.info "Logging user on"

                    request.setAttribute("isLoggedIn", true)
                }else{
                    log.info "User has not logged on... "
                    // Inject Parameters.
                    request.setAttribute("isLoggedIn", false)

                    //redirect(controller:'login')
                }
            }
        }
        prexistingLogin(controller: 'login', action:  'login'){
            before = {
                if(authenticationService.authenticate(session)){
                    log.info "User is already logged on. redirecting"

                    request.setAttribute("isLoggedIn",true)
                    redirect(controller: 'main')

                }else{
                    log.info "Yeah the user has not logged in"

                    request.setAttribute("isLoggedIn", false)
                }
            }
        }
    }
}
