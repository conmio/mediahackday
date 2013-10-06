package mediahackday

import groovyx.net.http.ContentType
import org.quartz.impl.JobExecutionContextImpl
import java.util.Random



class UserStatusCheckJob {
    def httpService

    static triggers = {}

    def execute(context) {

        Random rand = new Random()
        int max = 10
        def randomIntegerList = []
        (1..10).each {
            randomIntegerList << rand.nextInt(max+1)
        }
        if (context) {

            httpService.nonCachedRequest("https://www.googleapis.com/gcm_for_chrome/v1/messages",
                    "post", [ 'noEncode' : true,
                            'header': ['Authorization': context.mergedJobDataMap.feed.token_type + " " + context.mergedJobDataMap.feed.access_token],
                            'contentType': ContentType.JSON,
                            'query': ['subchannelId': '0', 'payload': "Hi, there are ${randomIntegerList} new stories for you under ChannelName", 'channelId': '14087124618181189138/eaionflokngfnfajffellemikplifmhh']

                    ])
        }
    }
}
