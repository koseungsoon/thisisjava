<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorpage.jsp" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아래는 강아지 
<hr>
<%-- <%@ include file ="dog.jsp" %> --%>

<%
String str = "test";
/* int num=Integer.parseInt("1"); */
int num=Integer.parseInt(str);

%>

<hr>
위네는 강아지 사진
</body>
</html>