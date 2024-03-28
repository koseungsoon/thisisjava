<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%! String name="듀크";
	String getName(){return name;}
%>

<% String user_id=request.getParameter("user_id"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= name %>
<hr>
<%= getName() %>
<hr>
<%=user_id %>

</body>
</html>