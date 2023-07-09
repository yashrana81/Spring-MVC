<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html>
<body>
    <h2>Info page!</h2>
    <% String name = (String) request.getAttribute("name");
       LocalDateTime time = (LocalDateTime) request.getAttribute("time");
     %>
    <h3>name is <%= name %></h3>
    <h4>time is <%= time.toString() %></h4>
</body>
</html>
