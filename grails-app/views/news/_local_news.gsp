<div class="news-header">
    <h1>Local News</h1>
</div>
<div class="news-list">
    <g:each var="article" in="${(List<Article>) headlines}">
        <div class="news-item">
            <div class="news-item-thumb">
                <img src="${article.images?.medium}" class="img-thumbnail" alt="Article Thumbnail Here">
            </div>
            <div class="news-item-title">
                ${article.headline?.toString()}
            </div>
            <div class="news-item-summary">
                <p> ${article.summary?.toString()}</p>
            </div>
        </div>
    </g:each>
</div>