<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
//data : BookVO bookVO
// mav.addObject("data", bookVO);
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
<title>상세</title>
</head>
<body>
<h1>상세</h1>
<!-- 
요청URI : /lprod/updatePost
요청파라미터 : {"lprodGu":"P501","lprodId":"11","lprodNm":"가구류"}
요청방식 : post
 -->
<form id="frm" name="frm" action="/lprod/updatePost" method="post">
	<!-- 폼데이터 -->
	<!-- data : LprodVO lprodVO -->
	<input type="hidden" name="lprodGu" value="${data.lprodGu}"  />
	<p>상품분류번호 : <input type="text" name="lprodId" class="formdata" value="${data.lprodId}" readonly /></p>
	<p>상품분류명 : <input type="text" name="lprodNm" class="formdata" value="${data.lprodNm}" readonly /></p>
	<!-- 일반모드 시작 -->
	<p id="p1">
		<input type="button" id="edit" value="수정" />
		<input type="button" id="delete" value="삭제" />
		<input type="button" id="list" value="목록" />
	</p>
	<!-- 일반모드 끝 -->
	<!-- 수정모드 시작 -->
	<p id="p2" style="display:none;">
		<input type="submit" id="confirm" value="확인" />
		<input type="button" id="cancel" value="취소" />
	</p>
	<!-- 수정모드 끝 -->
</form>
<script type="text/javascript">
//document 내의 모든 요소들이 로딩이 완료된 후에 실행
$(function(){
	console.log("개똥이");
	//수정 버튼 클릭 -> 수정모드로 전환
	$("#edit").on("click",function(){
		$("#p1").css("display","none");//css->style="display:none;"
		$("#p2").css("display","block");//css->style="display:block"
		$(".formdata").removeAttr("readonly");//removeAttr : remove Attribute : 속성을 제거
		
		$("form").attr("action","/lprod/updatePost");
	});
	//취소 버튼 클릭
	$("#cancel").on("click",function(){
		//주소표시줄 : /detail?lprodGu=1
		//param : lprodGu=1
		//param.lprodGu : 1
		location.href="/lprod/detail?lprodGu=${param.lprodGu}";
	});
	
	//삭제 버튼 클릭
	//DELETE FROM BOOK
	//WHERE  BOOK_ID = 1
	//<input type="button" id="delete" value="삭제" />
	$("#delete").on("click",function(){
		//<form id="frm" name="frm" action="/lprod/deletePost" method="post">
		$("form").attr("action","/lprod/deletePost");
						
		let result = confirm("삭제하시겠습니까?");
		
		console.log("result : " + result);
		
		//true : 1, false : 0
		if(result > 0){//true(1)
			$("form").submit();
		}else{
			alert("삭제가 취소되었습니다.");
		}
	});
});
</script>
</body>
</html>


