class UrlMappings {

	static mappings = {
		"/"(controller: 'main', action:'index')
		"/settings"(controller: 'main', action:'settings')
        "/login"( controller: 'login', action: 'login')
        "/logout"( controller: 'login', action: 'logout')
        "/auth"( controller: 'login', action: 'auth')
        "/signup"(controller: 'login', action: 'signup')
        "/local"(controller: 'main', action: 'local')
        "/addsubscriber"(controller: 'main', action:'addSub')
		"500"(view:'/error')
	}
}
