<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 로그인이여~

<table border="1" width="50%" align="center" >

   <tr align="center">
      <td>아이디</td>
      <td>비밀번호</td>
   </tr>
   <tr align="center">
      <td>${userID}</td>
      <td>${passwd}</td>
   </tr>
</table>
</body>
</html>