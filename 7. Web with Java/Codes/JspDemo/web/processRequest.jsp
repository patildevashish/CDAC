<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Division of Numbers</h1>
        <%
            int n1=Integer.parseInt(request.getParameter("fn"));
            int n2=Integer.parseInt(request.getParameter("sn"));
        %>
        <%= "division = "+(n1/n2) %>
    </body>
</html>
 