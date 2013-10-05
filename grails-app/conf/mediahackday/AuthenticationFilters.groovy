package mediahackday

class AuthenticationFilters {

    def authenticationService
    def filters = {
        loginCheck(controller: '*', action: '*', controllerExclude: 'login') {
            before = {
                if(authenticationService.authenticate(session)){
                    log.info "Logging user on"
                }else{
                    redirect(controller:'login')
                }
            }

        }
    }
}
