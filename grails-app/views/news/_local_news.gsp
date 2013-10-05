<div class="news-header">
    <h1>Local News</h1>
</div>
<div class="news-list">
    <g:each var="headline" in="${headlines}">
        <div class="news-item">
            <div class="news-item-thumb">
                <img src="https://storyful.s3.amazonaws.com/production/stories/40652/index_small.jpg" class="img-thumbnail" alt="Article Thumbnail Here">
            </div>
            <div class="news-item-title">
                ${headline?.headline?.toString()?.encodeAsHTML()}
            </div>
            <div class="news-item-summary">
                <p>Spaniards took to Twitter on Thursday to protest a visit by German Chancellor Angela Merkel as pressure mounted on Spanish Prime Minister Mariano Rajoy to accept a sovereign bailout. But in the wake of deeply unpopular austerity measures, Spaniards had their own message for Merkel, and made it clear with a hashtag in her own language that trended across Spain on Thursday: <a href="https://twitter.com/#!/search/?q=%23MerkelWirBezahlenNicht&amp;src=hash">#MerkelWirBezahlenNicht</a> which translates as ‘Merkel, we won’t pay.’</p>
            </div>
        </div>
    </g:each>
</div>