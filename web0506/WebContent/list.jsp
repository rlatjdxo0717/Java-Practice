<%@page import="shop.MemberDB"%>
<%@page import="shop.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	MemberDB db = new MemberDB(); //객체생성
	ArrayList<MemberVO> list = db.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i = 0; i < list.size(); i++) {
	MemberVO bag2 = list.get(i);
%>

<%= bag2.getId() %>,
<%= bag2.getPw() %>, 
    <!-- db연결4.jsp?id=apple -->
<a href="db연결4.jsp?id=<%= bag2.getId() %>"> <%= bag2.getName() %> </a>, 
<%= bag2.getTel() %><br>
<hr>
<% } %>
</body>
</html>





