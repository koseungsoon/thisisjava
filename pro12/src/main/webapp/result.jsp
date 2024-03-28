<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
String id=request.getParameter("user_id");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hi
<%= id%>
<hr>
<% out.print(id); %>
<hr>
${1}
<hr>
${"hello"}
<hr>
${"안녕" }
<hr>
진리표1
${true and true}
${true and false}
${false and true}
${false and false}
<hr>
진리표2

${true or true}
${true or false}
${false or true}
${false or false}


</body>
</html>