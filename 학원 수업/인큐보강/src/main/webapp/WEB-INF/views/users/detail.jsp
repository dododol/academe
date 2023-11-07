<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/resources/js/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<!-- 
	   요청URI : /users/createPost
	   요청파라미터 : {username=a001,password=java,enabled=1}
	   요청방식 : post
    -->
    <!-- model.addAttribute("usersVO", usersVO)
    UsersVO(username=a001,password=java,enabled=1)
     -->
    <p>${usersVO}</p>
	<form action="/users/createPost" method="post">
		<p><input type="text" class="formdata" name="username" value="${usersVO.username}" placeholder="사용자" /></p>
		<p><input type="text" class="formdata" name="password" value="${usersVO.password}" placeholder="비밀번호" /></p>
		<p><input type="text" class="formdata" name="enabled" value="${usersVO.enabled}" placeholder="상태" /></p>
		<p><input type="submit" value="등록"> </p>
		
		<!-- 일반모드 시작 -->
	   <p id="p1">
	      <input type="button" id="edit" value="수정" />
	      <input type="button" id="delete" value="삭제" />
	      <input type="button" id="list" value="목록" onclick="javascript:location.href='/users/list'" />
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
      
      $("form").attr("action","/users/updatePost");
   });
   //취소 버튼 클릭
   $("#cancel").on("click",function(){
      //주소표시줄 : /users/detail?username=a001
      //param : username=1
      //param.username : 1
      location.href="/users/detail?username=${param.username}";
   });
   
   //삭제 버튼 클릭
   //DELETE FROM USERS
   //WHERE  USERNAME = a001
   //<input type="button" id="delete" value="삭제" />
   $("#delete").on("click",function(){
      //<form id="frm" name="frm" action="/users/deletePost" method="post">
      $("form").attr("action","/users/deletePost");
                  
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