<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/resources/js/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /cusInfo/createPost
	   요청파라미터 : {cusNo=a001,cusNm=김태형,addr=대전 동구,hp=010-1111-1111}
	   요청방식 : post
    -->
    <!-- model.addAttribute("cusInfoVO", cusInfoVO)
    CusVO{cusNo=a001,cusNm=김태형,addr=대전 동구,hp=010-1111-1111}
     -->
    <p>${cusInfoVO}</p>
	<form action="/cusInfo/createPost" method="post">
		<p><input type="text" class="formdata" name="cusNo" value="${cusInfoVO.cusNo}" placeholder="고객번호" /></p>
		<p><input type="text" class="formdata" name="cusNm" value="${cusInfoVO.cusNm}" placeholder="이름" /></p>
		<p><input type="text" class="formdata" name="addr" value="${cusInfoVO.addr}" placeholder="주소" /></p>
		<p><input type="text" class="formdata" name="hp" value="${cusInfoVO.hp}" placeholder="전화번호" /></p>
		<p><input type="submit" value="등록"> </p>
		
		<!-- 일반모드 시작 -->
	   <p id="p1">
	      <input type="button" id="edit" value="수정" />
	      <input type="button" id="delete" value="삭제" />
	      <input type="button" id="list" value="목록" onclick="javascript:location.href='/cusInfo/list'" />
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
   $(".formdata").attr("readonly","readonly");
   //수정 버튼 클릭 -> 수정모드로 전환
   $("#edit").on("click",function(){
      $("#p1").css("display","none");//css->style="display:none;"
      $("#p2").css("display","block");//css->style="display:block"
      $(".formdata").removeAttr("readonly");//removeAttr : remove Attribute : 속성을 제거
      
      $("form").attr("action","/cusInfo/paramTest10");
   });
   //취소 버튼 클릭
   $("#cancel").on("click",function(){
      //주소표시줄 : /cusInfo/detail?cusNo=a001
      //param : cusNo=a001
      //param.cusNo : a001
      location.href="/cusInfo/detail?cusNo=${param.cusNo}";
   });
   
   //삭제 버튼 클릭
   //DELETE FROM CUS_INFO
   //WHERE  CUS_NO = 1
   //<input type="button" id="delete" value="삭제" />
   $("#delete").on("click",function(){
      //<form id="frm" name="frm" action="/cusInfo/deletePost" method="post">
      $("form").attr("action","/cusInfo/deletePost");
                  
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