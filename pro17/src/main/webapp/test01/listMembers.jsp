<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*" %>

<%
request.getAttribute("memberLists"); 
%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

<%-- ${memberLists} --%>

<p class="cls1">회원정보</p>
   <table align="center" border="1" >
      <tr align="center" bgcolor="lightgreen">
         <td width="7%" ><b>아이디</b></td>
         <td width="7%" ><b>비밀번호</b></td>
         <td width="7%" ><b>이름</b></td>
         <td width="7%"><b>이메일</b></td>
         <td width="7%" ><b>가입일</b></td>
         <td width="7%" ><b>수정</b></td>
         <td width="7%" ><b>삭제</b></td>
         
   </tr>


<c:choose>
<c:when test="${memberLists !=null }">
	<c:forEach var="mem" items="${memberLists}">
	<tr align="center">
	<td>${mem.id}</td>
	<td>${mem.pwd}</td>
	<td>${mem.name}</td>
	<td>${mem.email}</td>
	<td>${mem.joinDate}</td>
	<td><b><a href="http://localhost:8080/pro17/mem/modMemberForm.do?id=${mem.id}">수정</a></b></td>
	<td><a href="http://localhost:8080/pro17/mem/delMember.do?id=${mem.id }">삭제</a></td>
	</tr>
	</c:forEach>
</c:when> 
</c:choose>
</table>

<a href="http://localhost:8080/pro17/test01/memberForm.jsp">회원가입하기</a>

</body>
</html>