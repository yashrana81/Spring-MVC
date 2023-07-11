<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored = "false" %>

<!DOCTYPE html><html>
<body>
    <h2>Info page!</h2>
    <% String name = (String) request.getAttribute("name");
     %>
    <h3>name is <%= name %></h3>
    <h4>roll no is ${roll}</h4>

</body>
</html>
