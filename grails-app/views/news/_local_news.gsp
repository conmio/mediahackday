<div class="news-header">
    <h1>Local News</h1>
</div>
<div class="news-list">
    <g:each var="article" in="${articles}">
        <div class="news-item">
            <div class="news-item-thumb">
                <img src="https://storyful.s3.amazonaws.com/production/stories/40652/index_small.jpg" class="img-thumbnail" alt="Article Thumbnail Here">
            </div>
            <div class="news-item-title">
                ${article?.headline?.toString()}
            </div>
            <div class="news-item-summary">
                <p></p>
            </div>
        </div>
    </g:each>
</div>