<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /products/createPost
	   요청파라미터 : {prodId=P10101,lprodGu=P101,lprodNm=모니터20인치}
	   요청방식 : post
    -->
	<form action="/products/createPost" method="post">
		<p><input type="text" name="prodId" placeholder="상품코드" /></p>
		<p><input type="text" name="lprodGu" placeholder="상품분류코드" /></p>
		<p><input type="text" name="prodNm" placeholder="상품명" /></p>
		<p><input type="submit" value="등록"> </p>
	</form>

</body>
</html>