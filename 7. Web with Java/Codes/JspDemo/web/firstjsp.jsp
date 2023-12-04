<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First JSP Page</h1>
        <%--<jsp:forward page="secondjsp.jsp"/>--%>
        <%--<jsp:include page="secondjsp.jsp"/>--%>
        
        <jsp:include page="secondjsp.jsp">
            <jsp:param name="inst" value="CDAC"/>
        </jsp:include>
    </body>
</html>
