<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*" %>
    
    <jsp:useBean id="memberVO" class="sec01.ex01.MemberVO"></jsp:useBean>
    <jsp:setProperty property="*" name="memberVO" />
    
    <%-- <jsp:setProperty property="id" name="memberVO" param="id"/>
    <jsp:setProperty property="pwd" name="memberVO" param="pwd"/>
    <jsp:setProperty property="name" name="memberVO" param="name"/>
    <jsp:setProperty property="email" name="memberVO" param="email"/> --%>
    
    <%
    /* String id=request.getParameter("id");
    String pwd=request.getParameter("pwd");
    String name=request.getParameter("name");
    String email=request.getParameter("email"); */ 
    
    
   /* MemberVO memberVO= new MemberVO(id, pwd, name, email); */
   MemberDAO dao=new MemberDAO();
   
   dao.addMember(memberVO);
   
   List<MemberVO> memberLists=dao.listMembers();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <table align="center"  width="100%">
	 <tr align="center" bgcolor="#99ccff">
	      <td width="7%" >아이디</td>
	      <td width="7%">비밀번호</td>
	      <td width="5%" >이름</td>
	      <td width="11%" >이메일</td>
	      <td width="5%" >가입일</td>
	   </tr>
	   
	   <tr>
	   <td><jsp:getProperty property="id" name="memberVO"/></td> <td><jsp:getProperty property="pwd" name="memberVO"/></td> <td><jsp:getProperty property="name" name="memberVO"/></td> <td><jsp:getProperty property="email" name="memberVO"/></td>
	   </tr>
	<%-- <%
	   if(memberLists.size()==0){
	%>
	  <tr>
	      <td colspan="5">
	        <p align="center"><b><span style="font-size:9pt;">
	                      등록된 회원이  없습니다.</span></b></p>
	      </td>
	  </tr>
	<%
	}else{
	   for( int i = 0; i < memberLists.size(); i++ ) {
	       MemberVO bean = (MemberVO) memberLists.get(i);
	%>
	   <tr align="center">
	       <td><%=bean.getId() %></td>
	       <td><%=bean.getPwd() %></td>
	       <td><%=bean.getName() %></td>
	       <td><%=bean.getEmail() %></td>
	       <td><%=bean.getJoinDate() %></td>
	   </tr>
	<%
	      } // end for
	
	   } // end if
	%> --%>
	   <tr height="1" bgcolor="#99ccff">
	      <td colspan="5"></td>
	   </tr>
	</table>


</body>
</html>