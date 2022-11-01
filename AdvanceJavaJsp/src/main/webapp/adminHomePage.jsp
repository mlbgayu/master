<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String email = request.getParameter("admin");
	out.print("welcome " + name);
	session.setAttribute("user", name);
	%>

</body>
</html>