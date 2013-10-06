<div>
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>
    <p class="lead"><a href="https://chrome.google.com/webstore/detail/eaionflokngfnfajffellemikplifmhh">Get chrome extension for live updates here!</a></p>
</div>

<g:render template="/settings/set_up_panel"/>

<g:form controller="login" action="signup">
    <g:submitButton name="Save" type="submit" class="js-button-setup btn btn-lg btn-success"/>
    <g:submitButton name="Postpone" type="submit" class="js-button-setup btn btn-lg btn-primary"/>
</g:form>
