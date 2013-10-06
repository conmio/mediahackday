<%@ page import="com.conmio.mediahackday.article.Article" %>
<div class="news-header">
    <h1>News</h1>
</div>
<div class="news-list">
    <g:each var="article" in="${(List<Article>) articles}">
        <g:if test="${article.shortUrl && article.shortUrl != ""}">
            <div class="news-item">
                <div class="news-item-thumb">
                 <g:link url="${article?.shortUrl}" class="news-item-link" target="_blank">
                    <img src="${article?.profileImageUrl?: 'https://storyful.s3.amazonaws.com/production/stories/40652/index_small.jpg'}" class="img-thumbnail" alt="Article Thumbnail Here">
                 </g:link>
                </div>
                <div class="news-item-title">
                    <g:link url="${article?.shortUrl}" class="news-item-link" target="_blank">
                    <span>${article.headline?.toString()}</span>
                    </g:link>
                </div>
                <div class="news-item-timestamp">
                    <span> <g:formatDate date="${article.pubDate}" format="hh:mm dd-MM-yyyy" /></span><br/>
                    <span> <span class="js-location-info" data-location="${article?.location}"></span></span>
                </div>
                <div class="news-item-summary">
                    <span>${article.summary?.toString()}</span>
                </div>
            </div>
        </g:if>
    </g:each>
</div>