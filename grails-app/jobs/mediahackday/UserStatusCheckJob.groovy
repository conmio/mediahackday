package mediahackday

import groovyx.net.http.ContentType
import org.quartz.impl.JobExecutionContextImpl
import java.util.Random



class UserStatusCheckJob {
    def httpService

    static triggers = {}

    List<String> channels = ["14087124618181189138/eaionflokngfnfajffellemikplifmhh"]

    def addSub(String chan){
        channels.add(chan)
    }
    def execute(context) {

        if (context) {

            channels.eachWithIndex { channel, ind ->
                String message = "Hi, user number $ind there are a # new stories for you under \n ChannelName. Sent at: " + new Date().toString()

                log.info "Sending Message $message"

                httpService.nonCachedRequest("https://www.googleapis.com/gcm_for_chrome/v1/messages",
                        "post", ['noEncode': true,
                                'header': ['Authorization': context.mergedJobDataMap.feed.token_type + " " + context.mergedJobDataMap.feed.access_token],
                                'contentType': ContentType.JSON,
                                'query': ['subchannelId': '0',
                                        'payload': message,
                                        'channelId': channel]

                        ])
            }
        }
    }
}
