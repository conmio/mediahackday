package com.mediahackday

import javax.servlet.http.HttpSession

interface AuthenticationService {
    boolean authenticate(String username, String hash)
    boolean authenticate(HttpSession session)
}
