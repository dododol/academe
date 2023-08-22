<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
	<link rel="stylesheet" href="../resources/css/언더독스파크.css">
<link rel="shortcut icon" href="../resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script>
$(function(){
		
	$(".player").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo.do?name=" + people;
	   })

	});
	
	$(function(){
	   $(".player1").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo1.do?name=" + people;
	   })

	});
	
	$(function(){
	   $(".player2").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo2.do?name=" + people;
	   })

	});
	
	$(function(){
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
HttpSession sessionLog = request.getSession();


LoginVO loginId = (LoginVO)sessionLog.getAttribute("loginSign");

%>
<% 
if(loginId == null){
%>   
   <header>
   <a id="imga" href="<%=request.getContextPath() %>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
      <div id="log1">
      <ul>   
      <li class="log"><a href="sign.jsp" id="ma">로그인/회원가입</a>
      </li>
         <li class="log"><a href="sign.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
      </li>
   <!--     <li class="log">ㅇㅇㅇ님 반갑습니다</li>  -->
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
      <li class="log"><a href="<%=request.getContextPath() %>/adminManager.do" id="ma"><i class="fa fa-user"></i>관리자 페이지</a>
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
<nav id="hed">
<div class="main">
	<ul>
      <li></i><a href="#" id="ma">UNDER DOGS</a> 
	<div class="an2">	  
     <ul id="an">	 
     <li><a href="구단소개.jsp" id="ma2">구단소개</a></li>
	 <li><a href="히스토리.jsp">Histroy</a></li>
	 <li><a href="언더독스파크.jsp">언더독스 파크</a></li>
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
	 <li><a href="#">응원단</a></li>		
     </ul>
	      </div>
		</li>
      <li><a href="#" id="ma">FAN</a>
			   <div class="an2">
		<ul id="an">
        <li><a href="<%=request.getContextPath()%>/board/noticelist.do">구단소식</a></li>
		<li><a href="<%=request.getContextPath()%>/board/fanboardlist.do">팬게시판</a></li>
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
	<section id="mid">
     <div class="gudan">	  
     <ul id="an">	 
     <li><a href="구단소개.jsp" id="g1">구단소개</a></li>
	 <li><a href="히스토리.jsp" id="g2">Histroy</a></li>
	 <li><a href="언더독스파크.jsp" id="g3">언더독스 파크</a></li>
     </ul>
	 <img src="../resources/images/구간별.png" id="his">
    </div>
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