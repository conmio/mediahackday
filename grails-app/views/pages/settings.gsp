<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>

    <g:if test="${params.Save}">Settings Saved!</g:if>
    <g:form controller="main" action="settings">
        <section id="settingsModule">
            <g:render template="/settings/set_up_panel"/>
        </section>
        <g:link controller="main"> <g:submitButton name="Cancel" type="button" class="js-button-setup btn btn-s btn-danger"/></g:link>
        <g:submitButton name="Save" type="submit" class="js-button-setup btn btn-s btn-success"/>
    </g:form>

</body>
</html>