import com.conmio.mediahackday.article.InMemArticleRepository
import com.conmio.mediahackday.headline.InMemHeadlineRespository

// Place your Spring DSL code here
beans = {
<<<<<<< HEAD
    authenticationService{bean->
        bean.autowire = 'byName'
        bean.parent = ref("mockupAuthenticationService")

    }
=======
    articleRepository(InMemArticleRepository) {bean ->
            bean.autowire = 'byName'
    }

    headlineRepository(InMemHeadlineRespository) {bean ->
            bean.autowire = 'byName'
    }

>>>>>>> 5a80dc57f55a8e24b8b489d81b4f278214fdefe4
}
