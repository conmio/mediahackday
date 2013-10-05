package mediahackday

class AuthenticationFilters {

    def authenticationService
    def filters = {
        loginCheck(controller: '*', action: '*', controllerExclude: 'login') {
            before = {
                if(authenticationService.authenticate(session)){
                    log.info "Logging user on"
                }else{
                    log.info "User has not logged on... "
                    redirect(controller:'login')
                }
            }
        }
        prexistingLogin(controller: 'login', action:  'login'){
            before = {
                if(authenticationService.authenticate(session)){
                    log.info "User is already logged on. redirecting"
                    redirect(controller: 'main')
                }else{
                    log.info "Yeah the user has not logged in"

                }
            }
        }
    }
}
