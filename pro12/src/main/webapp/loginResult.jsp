<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! 
    int num=5;
    String str="nice";
    
    //함수선언
    String hi(){
    	
    	return "hi5555";
    }
    
    int hi2(){
    	return 7;
    }
    
 String hi3(){
    	
    	return "7";
    }
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String id=request.getParameter("id");
%>

<%= id  %> 님 반갑습니다.
<%= num %>
<%= str %>
<hr>
<%= hi() %>
<hr>
<%= hi2() + 3 %>
<hr>
<%= hi3() + 3 %>
<hr>
<%= Integer.parseInt(hi3())+7 %>
</body>
</html>