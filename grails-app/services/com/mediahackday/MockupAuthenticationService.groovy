package com.mediahackday

import javax.servlet.http.HttpSession

class MockupAuthenticationService implements AuthenticationService {
    static transactional = false
    boolean authenticate(String username, String hash){

        log.info "Authentication via username and hash "
        return true;
    }

    boolean authenticate(HttpSession session) {
        log.info "Authentication via session"

    }

}
