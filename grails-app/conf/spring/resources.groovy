import com.mediahackday.article.Afp4WService
import com.mediahackday.article.Afp4WService

// Place your Spring DSL code here
beans = {
    authenticationService{bean->
        bean.autowire = 'byName'
        bean.parent = ref("mockupAuthenticationService")

    }
    articleRepository() {bean ->
            bean.autowire = 'byName'
    }

    /*
    headlineRepository(Afp4WService) {bean ->
            bean.autowire = 'byName'
    }
    */

}
