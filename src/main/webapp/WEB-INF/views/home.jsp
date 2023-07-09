<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
<body>
    <h2>Home page!</h2>
    <% String name = (String) request.getAttribute("name"); %>
    <h3>name is <%= name %></h3>
</body>
</html>
