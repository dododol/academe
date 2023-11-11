<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /cusInfo/createPost
	   요청파라미터 : {cusNo=a001,cusNm=김태형,addr=대전 동구,hp=010-1111-1111}
	   요청방식 : post
    -->
	<form action="/cusInfo/createPost" method="post">
		<p><input type="text" name="cusNo" placeholder="사원번호" /></p>
		<p><input type="text" name="cusNm" placeholder="이름" /></p>
		<p><input type="text" name="addr" placeholder="주소" /></p>
		<p><input type="text" name="hp" placeholder="전화번호" /></p>
		<p><input type="submit" value="등록"> </p>
	</form>

</body>
</html>