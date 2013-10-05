// Place your Spring DSL code here
beans = {
    authenticationService{bean->
        bean.autowire = 'byName'
        bean.parent = ref("mockupAuthenticationService")

    }
}
