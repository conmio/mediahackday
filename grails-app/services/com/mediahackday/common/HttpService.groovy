package com.mediahackday.common

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import grails.plugin.cache.Cacheable


class HttpService {

    static transactional = false

    Object nonCachedRequest(String url, String type = "post", Map<String, ?> params = [:]) {
        try {

            log.info "Executing request to $type:$url with Params ${params.dump()}"
            def http = new HTTPBuilder(url)

            Method method = type.toLowerCase() != "post" ? Method.GET : Method.POST


            if (params.header && params.header instanceof Map) {

                http.headers = (Map) params.header
            }


            return http.request(method, params.contentType ?: ContentType.ANY) { res ->


                if (params.query && params.query instanceof Map && method != Method.POST) {

                    uri.query = params.query

                } else if (params.query && params.query instanceof Map && method == Method.POST) {
                    log.info "Body"
                     if(params.noEncode){

                        body = params.query
                     }else{
                        send URLENC, params.query
                     }

                }
                response.success = { resp, data ->
                    log.info "Succesfully requested Data from " + url
                    return data
                }

                response.failure = { resp, data ->
                    log.error("Request to $url was a failure " + data)
                    return null
                }
            }

        }
        catch (HttpResponseException ex) {
            // default failure handler throws an exception:
            println "Unexpected response error: ${ex.statusCode}"
        }
        catch (Exception e) {
            log.error("Could not retrive url. " + e.dump());
        }

    }

    @Cacheable(value = "feeds", key = "#url")
    Object request(String url, String type = "post", Map<String, ?> params = [:]) {
        return nonCachedRequest(url, type, params)

    }
}
