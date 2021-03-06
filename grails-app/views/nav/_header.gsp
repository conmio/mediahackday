<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Rolling News</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/settings">Settings</a>
                </li>
                <li>
                    <g:render template="/nav/sign_in_button"/>
                </li>
            </ul>
                <p class="navbar-text pull-right" id="userNameHolder"  data-logedin="${request.isLoggedIn}">
                    Signed in as <a href="#" class="navbar-link"></a>
                </p>
        </div>
    </div>
</div>