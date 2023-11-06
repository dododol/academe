<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /lprod/createPost
	   요청파라미터 : {lprodGu=P701,lprodNm=호스팅}
	   요청방식 : post
    -->
	<form action="/lprod/createPost" method="post">
		<p><input type="text" name="lprodGu" placeholder="상품분류코드" /></p>
		<p><input type="text" name="lprodNm" placeholder="상품분류명" /></p>
		<p><input type="submit" value="등록"> </p>
	</form>

</body>
</html>