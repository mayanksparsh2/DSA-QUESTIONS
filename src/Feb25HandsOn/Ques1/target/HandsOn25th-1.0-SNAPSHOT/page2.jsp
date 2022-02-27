<%--
  Created by IntelliJ IDEA.
  User: mayanksparsh
  Date: 27/02/22
  Time: 2:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Servlet Page2 Ques1 </title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<%
    String id = request.getParameter("empId");
%>

<div class="center-block">
    <form style="display: block;" action="page3.jsp">
        Welcome User with id :    <%= id %> <br>
        Your Name: <input class="center-block" type="text" name="name"><br>
        <input class="center-block" type="submit" value="Goto Page 3">
    </form>
</div>
</body>
</html>
