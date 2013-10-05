<div>
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>

</div>

<div class="col">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4>Set Up</h4>
        </div>

        <div class="panel-body">
            <g:form controller="login" action="signup">
                <div class="list-group">
                    <div class="list-group-item">
                        <div class="dropdown">
                            <div class="dropdown-toggle" data-toggle="dropdown">Channles</div>
                            <div class="dropdown-menu">
                                <div><a href="#">News Channel</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="list-group-item">
                        <div class="dropdown">
                            <div class="dropdown-toggle" data-toggle="dropdown">Notifications</div>
                            <div class="dropdown-menu">
                                <div><a href="#">Turn off</a></div>
                            </div>
                        </div>
                    </div>
                </div>
                <g:submitButton name="Postpone" type="submit" class="js-button-setup btn btn-s btn-primary"/>
            </g:form>
        </div>
    </div>
</div>