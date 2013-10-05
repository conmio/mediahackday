<div>
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>

</div>

<div class="col">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4>Set Up</h4>
        </div>

        <div class="panel-group" id="accordion">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                            Channels
                        </a>
                    </h4>
                </div>

                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                        <g:form controller="login">
                        </g:form>
                        <div class="input-group">
                            <span>Education</span>
                            <span class="input-box">
                                <input type="checkbox">
                            </span>
                        </div><!-- /input-group -->
                        <div class="input-group">
                            <span>Health</span>
                            <span class="input-box">
                                <input type="checkbox">
                            </span>
                        </div><!-- /input-group -->
                        <div class="input-group">
                            <span>Sports</span>
                            <span class="input-box">
                                <input type="checkbox">
                            </span>
                        </div><!-- /input-group -->
                    </div>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
                            Notifications
                        </a>
                    </h4>
                </div>

                <div id="collapseTwo" class="panel-collapse collapse">
                    <div class="panel-body">
                        <div class="input-group">
                            <span>Notifications on/off</span>
                            <span class="input-box">
                                <input type="checkbox">
                            </span>
                        </div><!-- /input-group -->
                        <div class="input-group">
                        <!-- Small button group -->
                        <div class="btn-group">
                            <button class="btn btn-default btn-sm dropdown-toggle" type="button" data-toggle="dropdown">
                                Interval of notification <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <li>
                                    every hour

                                </li>
                            </ul>
                        </div>
                        </div><!-- /input-group -->
                        <g:form controller="login" action="signup">
                        </g:form>
                </div>
            </div>

        </div>
    </div>
</div>
<g:form controller="login" action="signup">
    <g:submitButton name="Postpone" type="submit" class="js-button-setup btn btn-s btn-primary"/>
</g:form>