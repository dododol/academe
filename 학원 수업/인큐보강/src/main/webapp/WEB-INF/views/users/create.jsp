<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /users/createPost
	   요청파라미터 : {username=a001,password=java,enabled=1}
	   요청방식 : post
    -->
	<form action="/users/createPost" method="post">
		<p><input type="text" name="username" placeholder="사용자" /></p>
		<p><input type="text" name="password" placeholder="비밀번호" /></p>
		<p><input type="text" name="enabled" placeholder="상태" /></p>
		<p><input type="submit" value="등록"> </p>
	</form>

</body>
</html>