<div>
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>

</div>

<g:render template="/settings/set_up_panel"/>

<g:form controller="login" action="signup">
    <g:submitButton name="Submit" type="submit" class="js-button-setup btn btn-s btn-success"/>
    <g:submitButton name="Postpone" type="submit" class="js-button-setup btn btn-s btn-primary"/>
</g:form>
