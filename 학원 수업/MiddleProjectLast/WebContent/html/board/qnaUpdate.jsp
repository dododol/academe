<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="kr.or.ddit.middle.vo.QnaVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="KO">
<head>
<meta charset="UTF-8">
<title>DDIT UNDER DOGS - 팬게시판</title>
<link href="<%=request.getContextPath()%>/resources/css/게시판작성및수정.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<script type="text/javascript">
$(function(){
	$("#listBtn").on("click", function(){
		location.href="<%=request.getContextPath()%>/board/qnaList.do";
	});

		var addBtn = $("#addBtn");
		var frm = $("#frm");
		
		
		addBtn.on("click", function(){
			var title = $("#qna_title").val();
			
			if(title == ""){
				alert("제목을 입력해주세요.");
				return false;
			}
			
			frm.submit();
		});	
	
		
		
		$(".player").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath() %>/playerInfo.do?name=" + people;
		   });
		   
		   $(".player1").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath() %>/playerInfo1.do?name=" + people;
		   });
		   
		
		   $(".player2").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath() %>/playerInfo2.do?name=" + people;
		   });
		   
		   $(".player3").on('click',function(){
			      
			      people = "";
			      people =$(this).text();
			         
			      location.href="<%=request.getContextPath() %>/playerInfo3.do?name=" + people;
		   });
});

</script>

</head>

<body>
	<%
	LoginVO loginId = (LoginVO)session.getAttribute("loginSign");
	%>
	
	<% 
if(loginId == null){
%>	
	<header>
	<a id="imga" href="main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
	   <li class="log"><a href="sign.jsp" id="ma">로그인/회원가입</a>
		</li>
			<li class="log"><a href="sign.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
		</li>
	<!--  	<li class="log">ㅇㅇㅇ님 반갑습니다</li>  -->
	</ul>
	</div>
	</header>
<%	
}else if(loginId.getMem_id().equals("admin")){
%>	
	<header>
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
		<li class="log"><a href="<%=request.getContextPath() %>/adminManager.do" id="ma"><i class="fa fa-user"></i> 예매 내역 조회</a> <br>
		<li class="log"><a href="<%=request.getContextPath() %>/adminManager.do" id="ma"><i class="fa fa-user"></i> 매출 조회</a> <br>
		<li class="log"><a href="<%=request.getContextPath() %>/adminManager.do" id="ma"><i class="fa fa-user"></i> 고객 조회</a> <br>
	   
		</li>
			<li class="log"><a href="<%=request.getContextPath()%>/logout.do" id="logout" method="get">로그아웃</a>
		</li>
	  	<li class="log"><%=loginId.getMem_name() %>님 반갑습니다.</li>  
	</ul>
	</div>
	</header>
	
	
	
<%	
}else{
%>	
	<header>
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
	   <li class="log"><a href="<%=request.getContextPath()%>/logout.do" id="logout" method="get">로그아웃</a>
		</li>
			<li class="log"><a href="<%=request.getContextPath()%>/html/mypage/mypagepw.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
		</li>
	  	<li class="log"><%=loginId.getMem_name() %>님 반갑습니다.</li>  
	</ul>
	</div>
	</header>
<%	
}
%>
<div>
<nav id="hed">
<div class="main">
	<ul>
      <li></i><a href="<%=request.getContextPath()%>/html/main.jsp" id="ma">UNDER DOGS</a> 
	<div class="an2">	  
     <ul id="an">	 
     <li><a href="<%=request.getContextPath()%>/html/구단소개.jsp" id="ma2">구단소개</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/히스토리.jsp">Histroy</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/언더독스파크.jsp">언더독스 파크</a></li>
     </ul>
		</div>
		</li>
	   <li><a href="#" id="ma">PLAYERS</a>
		<div class="an2">
		   <ul id="an">		 
	 <li><a href="<%=request.getContextPath()%>/html/코칭스탭.jsp" id="g2">코칭스텝</a></li>
	 <li><a href="#" class="player">투수</a></li>
	 <li><a href="#" class="player1">포수</a></li>
	 <li><a href="#" class="player2">내야수</a></li>
	 <li><a href="#" class="player3">외야수</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/응원단.jsp" id="g7">응원단</a>		
     </ul>
	      </div>
		</li>
		   <li><a href="#" id="ma">FAN</a>
			   <div class="an2">
		<ul id="an">
     <li><a href="<%=request.getContextPath()%>/board/noticelist.do" id="g1">구단소식</a></li>
	 <li><a href="<%=request.getContextPath()%>/board/fanboardlist.do" id="g2">팬게시판</a></li>
	 <li><a href="<%=request.getContextPath()%>/board/qnaList.do">문의사항</a></li>
     </ul>
			   </div>
		</li>
      <li><a href="<%=request.getContextPath() %>/matchInfo.do" id="ma">GAME</a>
		</li>
	  <li><a target="_blank" href="<%=request.getContextPath() %>/ticket.do" id="ma">TICKET</a>
		</li>
	   <li><a href="<%=request.getContextPath() %>/liveGame.do" id="ma">LIVE GAME</a>
		</li>
    </ul>	
	</div>
</nav>
<%--작성 시작부분 --%>

<%
QnaVO qnaVo = (QnaVO)request.getAttribute("UpdateQnaVO");
%> 

<section>
<form id="qnaForm" action="<%=request.getContextPath() %>/board/qnaUpdateView.do" method="post" >
<input type="hidden" name="qna_no" value="<%=qnaVo.getQ_no()%>">

<div class="all">
<div class="topwrite"><span class="topwrite2">팬여러분들의 소리를 듣습니다</span></div>
<div class="fantb">
<table class="fanwrtb">
<tbody>
	<tr>
		<td class="title">제목</td>
		<td class="title">
			<input type="text" name="qna_title" id="qna_title" value="<%=qnaVo.getQ_title()%>">
		</td>
	</tr>
	
	<tr>
		<td class="title">작성자</td>
		<td class="title"><input type="text" name="qna_writer" id="qna_writer" value="<%=qnaVo.getMem_id()%>" readonly="readonly"></td>
	</tr>
	
	<tr>
		<td class="title">비밀번호</td>
		<td class="title"><input type="text" id="qna_pass" name="qna_pass" value="<%=qnaVo.getQ_pass()%>"></td>
	</tr>
	
	<tr>
		<td class="title">내용</td>
		<td class="title"><textarea rows="20" cols="60" id="qna_content" name="qna_content"><%=qnaVo.getQ_content()%></textarea></td>
	</tr>
	</tbody>
</table>
</div>

			<input class="fanbtn" type="submit" id="addBtn" value="수정완료"> 
			<input class="fanbtn" type="reset" value="초기화">
			<input class="fanbtn" type="button" id="listBtn" value="목록으로 가기">


</div>
</form>
</section>

 
      
    


	<footer id="foor">
			<div id="fut">
<h1>DDIT UNERDOGS</h1>
<p><br>
  <i class="fa fa-building"></i> 대전광역시 중구 계룡로 846, 3층 | <i class="fa fa-user"></i> 대표이사 이재혁 | <i class="fa fa-building-o"></i> 사업자등록번호 : 123-10-92344<br>
	<br>
  <i class="fa fa-phone"></i> TEL : 043-003-2034 | <i class="fa fa-phone-square"></i> FAX : 042-394-2929 </p>
			</div>
<a id="top" href ="#" title="top"> <SPAN><i class="fa fa-angle-double-up"></i> TOP</SPAN> </a>
</footer>
</body>
</html>