package mediahackday

import com.conmio.mediahackday.headline.Headline
import grails.plugins.rest.client.RestBuilder


class HttpService {
    static transactional = false

    def rest = new RestBuilder()
    def grailsApplication
    def headlineRepository

    def readAFP4W() {


        headlineRepository.getHeadlines()

        //return headlineRepository.get
    }

    def List<Headline> getHeadlinesData() {
        return headlineRepository.getHeadlines()
    }

}
