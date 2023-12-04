<%-- 
    Document   : login
    Created on : 29-Nov-2023, 12:34:57 pm
    Author     : patil
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("un");
            String password = request.getParameter("pass");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testemp?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","Deva@2204");
                PreparedStatement pst = con.prepareStatement("Select * from Employee where empName = ? and empPass=?");
                    pst.setString(1,user);
                    pst.setString(2,password);
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    out.println("<h3>Login Successful</h3>");
                }
                else{
                    out.println("<h3>Login Unuccessful</h3>");
                }
            }
            
            catch(Exception e){
                out.println(e.getMessage());
            }
        %>
    </body>
</html>
