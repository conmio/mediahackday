package mediahackday

import com.conmio.mediahackday.headline.Headline

class ChannelService {
    static transactional = false

    def headlineRepository

    List<Headline> getChannelHeadlines() {

        return headlineRepository.getHeadlines()
    }

    List<Headline> getChannelHeadlines(String channelID) {

        return headlineRepository.getHeadlines(channelID)
    }


}
