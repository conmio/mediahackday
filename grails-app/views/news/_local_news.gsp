<%@ page import="com.conmio.mediahackday.article.Article" %>
<div class="news-header">
    <h1>Local News</h1>
</div>
<div class="news-list">
    <g:each var="article" in="${(List<Article>) articles}">
        <g:if test="${article.shortUrl && article.shortUrl != ""}">
            <a href="${article.shortUrl}" class="new-link"/>
        </g:if>
        <div class="news-item">
            <div class="news-item-thumb">
                <img src="${article?.profileImageUrl?: 'https://storyful.s3.amazonaws.com/production/stories/40652/index_small.jpg'}" class="img-thumbnail" alt="Article Thumbnail Here">
            </div>
            <div class="news-item-title">
                ${article.headline?.toString()}
            </div>
            <div class="news-item-summary">
                <p>${article.summary?.toString()}</p>
            </div>
            <div class="">
                <g:formatDate date="${article.pubDate}" format="hh:mm dd-MM-yyyy" />
            </div>
        </div>
        <g:if test="${article.shortUrl && article.shortUrl != ""}">
            </a>
        </g>
        </g:if>

    </g:each>
</div>