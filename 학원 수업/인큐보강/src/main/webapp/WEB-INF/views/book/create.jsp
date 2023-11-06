<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>도서 등록</title>
</head>
<body>
<h3>도서 등록</h3>
<!-- 뷰(View) : 화면을 담당
	크롬(Client) -> 요청(/create) -> 톰켓(Server)(create()메소드와 매핑. View에 create.jsp를 포워딩)
	       <-응답(create_jsp.java, create_jsp.class, HTML) <-
	웹 브라우저(크롬)에서 렌더링 : 브라우저가 읽어서 해석
	 -->
<!-- 폼페이지
요청URI : /create
요청방식 : post
요청파라미터(HTTP파라미터) : 서버로 전달되는 키:값. {title:개똥이모험,category:소설,price:12000}

post방식은 요청파라미터가 주소창에 보이지 않음. 주소창의 변화 없이 데이터만 서버로 전달할 수 있음

int 타입의 허용 범위 : -2,147,483,648 ~ 2,147,483,647
 -->
 <form action="/create" method="post">
	<!-- 폼데이터 -->
	<p>제목 : <input type="text" name="title" required /></p>
	<p>카테고리 : <input type="text" name="category" required /></p>
	<!-- maxLengthCheck(this) : 핸들러 함수
	input type이 text일 땐 maxlength를 지정해주면 최대 글자 수를 지정할 수 있으나
	number일 때는 그렇지 않음.그래서 핸들러 함수가 필요함 -->
	<p>가격 : <input type="number" name="price" maxLength="10" required /></p>
	<p>
		<input type="submit" value="저장" />
		<input type="button" value="목록" onclick="javascript:location.href='/list'" />
	</p>
</form>
</body>
</html>


