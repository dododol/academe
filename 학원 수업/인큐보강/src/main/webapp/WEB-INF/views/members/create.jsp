<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /members/createPost
	   요청파라미터 : {memId=aaaaa,memName=김태형,memHp=123123123}
	   요청방식 : post
    -->
	<form action="/members/createPost" method="post">
		<p><input type="text" name="memId" placeholder="아이디" /></p>
		<p><input type="text" name="memName" placeholder="이름" /></p>
		<p><input type="text" name="memHp" placeholder="번호" /></p>
		<p><input type="submit" value="등록"> </p>
	</form>

</body>
</html>