package mediahackday

import groovyx.net.http.ContentType
import org.quartz.impl.JobExecutionContextImpl



class UserStatusCheckJob {
    def httpService

    static triggers = {}

    def execute(context) {
        /*
        POST /gcm_for_chrome/v1/messages
Host: www.googleapis.com
Content-Type: application/json
Authorization: Bearer 1/fFBGRNJru1FQd44AzqT3Zg

{
  'channelId': '08144192009958038014/aaaaaaaaaabbbbbbbbbbcccccccccc',
  'subchannelId': '0',
  'payload': 'Thanks for installing my app!'
}

                  */
        if (context) {

            log.info "SENDING bullshit"
            httpService.nonCachedRequest("https://www.googleapis.com/gcm_for_chrome/v1/messages",
                    "post", [ 'Authorization': context.mergedJobDataMap.feed.token_type + " " + context.mergedJobDataMap.feed.access_token,
                            'contentType': ContentType.JSON,
                            'query': ['subchannelId': '0', 'payload': 'Mikkelin Kikkeli', 'channelId': '14087124618181189138/eaionflokngfnfajffellemikplifmhh']

                    ])
        }
    }
}
