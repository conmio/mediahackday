package com.conmio.mediahackdayimport com.conmio.mediahackday.headline.Headline/** * Created with IntelliJ IDEA. * User: haren * Date: 10/5/13 * Time: 5:51 PM * To change this template use File | Settings | File Templates. */public interface HeadlineRepository {    List<Headline> getHeadlines()    List<Headline> getHeadlines(String channelId)}