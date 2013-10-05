class UrlMappings {

	static mappings = {
		"/"(controller: 'main', action:'index')
        "/login"( controller: 'login', action: 'login')
        "/logout"( controller: 'login', action: 'logout')
        "/auth"( controller: 'login', action: 'auth')
        "/signup"(controller: 'login', action: 'signup')
		"500"(view:'/error')
	}
}
