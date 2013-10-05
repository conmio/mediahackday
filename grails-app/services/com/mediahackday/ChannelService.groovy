package com.mediahackday

import com.conmio.mediahackday.headline.Headline

class ChannelService {
    static transactional = false

    def afp4WService

    List<Headline> getChannelHeadlines() {

        println "Getting Channels"
        return afp4WService.getArticles()
    }

    List<Headline> getChannelHeadlines(String channelID) {
        println "Getting Channels"
        return afp4WService.getArticles(channelID)
    }


}
