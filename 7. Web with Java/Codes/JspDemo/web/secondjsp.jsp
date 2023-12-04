<%-- 
    Document   : secondjsp
    Created on : 25-Nov-2023, 1:36:05 pm
    Author     : patil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Second JSP page</h1>
        <%
            String instName = request.getParameter("inst")
        %>
    </body>
</html>
