<div class="jumbotron">
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>

    <div class="col-sm-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h1>Set Up</h1>
            </div>

            <div class="panel-body">
                <g:form controller="login" action="signup">
                    <div class="list-group">
                        <a href="#" class="list-group-item active">
                            Choose news category
                        </a>
                        <a href="#" class="list-group-item">Frequency of notifications</a>
                        <a href="#" class="list-group-item">Opt out of push notifications</a>
                    </div>

                    <g:submitButton name="opt-out" type="submit"
                                    class="js-button-setup btn btn-s btn-primary">Postpone set up</g:submitButton>
                </g:form>
            </div>
        </div>
    </div>
</div>