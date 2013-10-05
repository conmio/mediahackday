package com.mediahackday.common

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import grails.plugin.cache.Cacheable


class HttpService {

    static transactional = false

    HttpService() {
    }


    @Cacheable(value="feeds", key="#url")
    Object request(String url, String type = "post", Map<String, String> params = [:]) {
        try {
            def ret = null
            log.info "Executing request to $type:$url with Params ${params.dump()}"
            def http = new HTTPBuilder(url)
            Method method = type != "post" ? Method.GET : Method.POST
            if(params.head && params.head instanceof Map){
                log.info "Adding Head"
                http.headers = params.head
            }
            return http.request(method, params.contentType ?: ContentType.ANY) { res ->


                response.success = { resp, data ->
                    log.info "Succesfully requested Data from " + url
                    return data
                }

                response.failure = { resp ->
                    log.error("Request to $url was a failure " + resp)
                    return null
                }
            }

        } catch (Exception e) {
            log.error("Could not retrive url. " + e.message);
        }


    }
}
