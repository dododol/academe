<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP : Java Server Page</h1>

<%
 request.setCharacterEncoding("utf-8");
 
 String userName=request.getParameter("name");
 String userAddress=request.getParameter("address");
 String userEmail=request.getParameter("email");
 String userGender=request.getParameter("gender");
 String userArea=request.getParameter("area");
%>
<%= userName %> <br>
<%= userAddress %> <br>
<%= userEmail %> <br>
<%= userGender %> <br>
<%= userArea %> <br>
</body>
</html>