<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

h1 {
	color : red;
}

table {
	border: 2px solid blue;
}

td {
	width: 300px;
	height: 30px;
	
}

</style>
</head>
<body>

<h1>JSP : Java Server Page</h1>

<%

	request.setCharacterEncoding("UTF-8");

	String userId = request.getParameter("id");
	String userName = request.getParameter("name");
	String userTel = request.getParameter("tel");
	String userArea = request.getParameter("area");		//\r\n 이 포함되어 있다.
	
	//\r\n 은 브라우저에 출력할때는 <br>태그로 변경 한다 - replaceAll()
	
		String area = userArea.replaceAll("\r\n", "<br>");
	
	
	
	
%>

<table border="1">

	<tr>	
		<td class="title">아이디</td>
		<td><%= userId %></td>
	</tr>

	<tr>	
		<td class="title">이름</td>
		<td><%= userName %></td>
	</tr>

	<tr>	
		<td class="title">전화번호</td>
		<td><%= userTel %></td>
	</tr>

	<tr>	
		<td class="title">의견</td>
		<td><%= area %></td>
	</tr>



</table>


</body>
</html>