<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //입력해서 전송된 데이터를 받아야 한다.
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String tel = request.getParameter("tel");
    
    //db전담하는 부품에서 db에 넣어달라고 할 예정.
   	MemberDB db = new MemberDB();
    db.update(id, pw, tel);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= id %>님의 패스워드가 <%= pw %>, 전화번호가 <%= tel %>로 변경되었습니다. 
</body>
</html>