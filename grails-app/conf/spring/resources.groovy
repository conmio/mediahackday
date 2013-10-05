import com.conmio.mediahackday.article.InMemArticleRepository
import com.conmio.mediahackday.headline.InMemHeadlineRespository

// Place your Spring DSL code here
beans = {
    authenticationService{bean->
        bean.autowire = 'byName'
        bean.parent = ref("mockupAuthenticationService")

    }
    articleRepository(InMemArticleRepository) {bean ->
            bean.autowire = 'byName'
    }

    headlineRepository(InMemHeadlineRespository) {bean ->
            bean.autowire = 'byName'
    }

}
