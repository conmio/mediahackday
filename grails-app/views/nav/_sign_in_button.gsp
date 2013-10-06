<g:if test="${request.isLoggedIn}">
    <a href="/logout">Sign Out</a>
</g:if>
<g:else>
    <a href="/login">Sign In</a>
</g:else>