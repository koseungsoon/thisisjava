<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원검색</h1>

<!-- 

1. 이름X 이메일X 검색버튼 누른경우
select * from t_memeber
2. 이름O 이메일X 검색버튼 누른경우
select * from t_member where name like ''
3. 이름X 이메일O 검색버튼 누른경우
select * from t_member where email like ''
4. 이름O 이메일O 검색버튼 누른경우
select * from t_member where name like '' and email like ''

 -->

<form action="http://localhost:8080/pro23/mem4.do">
         <input type ="hidden" name="action" value="searchMember">
   이름 : <input  type="text" name="name" /><br>
   이메일 : <input  type="text" name="email" /><br>
   <input type="submit" value="검색"  />
</form> 

</body>
</html>