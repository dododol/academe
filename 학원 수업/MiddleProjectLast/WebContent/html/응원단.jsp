<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>응원</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/응원단.css">
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
	<script src="../resources/js/slide.js"></script>


<script>
$(function(){
	$(".player").on('click',function(){
		
		people = "";
		people =$(this).text();
			
		location.href="<%=request.getContextPath() %>/playerInfo.do?name=" + people;
	})


	$(".player1").on('click',function(){
		
		people = "";
		people =$(this).text();
			
		location.href="<%=request.getContextPath() %>/playerInfo1.do?name=" + people;
	})


	$(".player2").on('click',function(){
		
		people = "";
		people =$(this).text();
			
		location.href="<%=request.getContextPath() %>/playerInfo2.do?name=" + people;
	})


	$(".player3").on('click',function(){
		
		people = "";
		people =$(this).text();
			
		location.href="<%=request.getContextPath() %>/playerInfo3.do?name=" + people;
	})

})

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
      <li><a href="#" id="ma">UNDER DOGS</a> 
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
	 <li><a href="<%=request.getContextPath()%>/html/응원단.jsp" id="g7">응원단</a></li>	
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
		
<% 
if(loginId == null){
%>		
	  <li><a href="<%=request.getContextPath()%>/html/main.jsp" onclick="alert('로그인 후 이용하세요')">TICKET</a>
		</li>
		
<%	
}else{
%>
	  <li><a target="_blank" href="<%=request.getContextPath() %>/ticket.do" id="ma">TICKET</a>
		</li>
<%	
}
%>		
		
	   <li><a href="<%=request.getContextPath() %>/liveGame.do" id="ma">LIVE GAME</a>
		</li>
    </ul>	
  </div>
</nav>
	<section id="mid">
     <div class="gudan">	  
     <ul id="an">	 
	 <li><a href="<%=request.getContextPath()%>/html/코칭스탭.jsp" id="g2">코칭스텝</a></li>
	 <li><a href="#" class="player">투수</a></li>
	 <li><a href="#" class="player1">포수</a></li>
	 <li><a href="#" class="player2">내야수</a></li>
	 <li><a href="#" class="player3">외야수</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/응원단.jsp" id="g7">응원단</a></li>	
     </ul>
    

	<div class="imgBoxDiv">
      <div class="imgDiv"><img src="<%=request.getContextPath()%>/resources/images/김연정.png"></div>
      <div class="imgDescDiv"><p>이름 : 김연정 (리더)<br><br>생년월일 : 1990.11.23</p></div>
     </div>
		 
	<div class="imgBoxDiv2">
      <div class="imgDiv2"><img src="<%=request.getContextPath()%>/resources/images/박세아.png"></div>
      <div class="imgDescDiv2"><p>이름 : 박세아 (센터)<br><br>생년월일 : 1998.05.28</p></div>
     </div>	 
		 
		 <div class="imgBoxDiv3">
      <div class="imgDiv3"><img src="<%=request.getContextPath()%>/resources/images/우수한.png"></div>
      <div class="imgDescDiv3"><p>이름 : 우수한 (비담)<br><br>생년월일 : 2001.11.09</p></div>
     </div>	
		 
		 <div class="imgBoxDiv4">
      <div class="imgDiv4"><img src="<%=request.getContextPath()%>/resources/images/이미래.png"></div>
      <div class="imgDescDiv4"><p>이름 : 이미래 (군기반장)<br><br>생년월일 : 1990.09.15</p></div>
     </div>
		 
	<div class="imgBoxDiv5">
      <div class="imgDiv5"><img src="<%=request.getContextPath()%>/resources/images/최석화.png"></div>
      <div class="imgDescDiv5"><p>이름 : 최석화 (막내)<br><br>생년월일 : 2002.12.27</p></div>
     </div>	 
		 
		 <div class="imgBoxDiv6">
      <div class="imgDiv6"><img src="<%=request.getContextPath()%>/resources/images/하지원.png"></div>
      <div class="imgDescDiv6"><p>이름 : 하지원 (짤부자)<br><br>생년월일 : 2002.02.22</p></div>
     </div>	
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