<!DOCTYPE html>
<html>
	<head>
        <meta name="layout" content="main" />
	</head>
	<body>
        <section id="loginModule"><g:render template="/user/login"/></section>
        <section id="setUpModule"><g:render template="/settings/set_up"/></section>

        <g:each var="headline" in="${headlines}">
            <div>${headline.headline}</div>
        </g:each>
	</body>
</html>