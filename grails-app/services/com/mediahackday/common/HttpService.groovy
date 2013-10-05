package com.mediahackday.common

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*


class HttpService {

    static transactional = false

    HttpService() {
    }

    Object request(String url, String type = "post", Map<String, String> params = [:]) {


        try {
            def ret = null
            def http = new HTTPBuilder(url)


            Method method = type != "post" ? Method.GET : Method.POST
            return http.request(method,params.contentType?: ContentType.ANY) { res ->
                response.success = { resp, data ->
                    return data
                }

                response.failure = {
                    log.error("Request to $url was a failure")
                    return null
                }


            }

        } catch (Exception e) {
            log.error("Could not retrive url. " + e.message);
        }

        /*
            // initialze a new builder and give a default URL
            def http = new HTTPBuilder( 'http://www.google.com/search' )

            http.request(GET,TEXT) { req ->
              uri.path = '/mail/help/tasks/' // overrides any path in the default URL
              headers.'User-Agent' = 'Mozilla/5.0'

              response.success = { resp, reader ->
                assert resp.status == 200
                println "My response handler got response: ${resp.statusLine}"
                println "Response length: ${resp.headers.'Content-Length'}"
                System.out << reader // print response reader
              }

              // called only for a 404 (not found) status code:
              response.'404' = { resp ->
                println 'Not found'
              }
            }


         */


    }
}
