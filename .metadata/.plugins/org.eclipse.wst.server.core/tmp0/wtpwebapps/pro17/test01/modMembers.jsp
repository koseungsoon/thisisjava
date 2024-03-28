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
화면수정페이지
<form method="post" action="http://localhost:8080/pro17/mem/modMember.do?id=${id}">
		<h1 style="text-align: center">회원 수정</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">아이디</td>
				<td width="400"><input type="text" name="id" disabled="disabled" value="${memInfo.id}" ></td>
			</tr>
			<tr>
				<td width="200"><p align="right">비밀번호</td>
				<td width="400"><input type="password" name="pwd" ></td>
			</tr>
			<tr>
				<td width="200"><p align="right" >이름</td>
				<td width="400"><p>
						<input type="text" name="name" ></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이메일</td>
				<td width="400"><p>
						<input type="text" name="email" ></td>
			</tr>
			<tr>
				<td width="200"><p>&nbsp;</p></td>
				<td width="400"><input type="submit" value="수정하기"> <input
					type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
</body>
</html>