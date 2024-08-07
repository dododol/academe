<%@page import="kr.or.ddit.middle.vo.BatterVO"%>
<%@page import="kr.or.ddit.middle.vo.PitcherVO"%>
<%@page import="kr.or.ddit.middle.vo.PlayerVO"%>
<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>외야수 프로필</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/타자프로필.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/resources/images/미니.png">
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

PlayerVO pooInfo = (PlayerVO)request.getAttribute("pooInfo");


BatterVO pooBatter = (BatterVO)request.getAttribute("pooBatter");


%>
<% 
if(loginId == null){
%>
	<header>
	<a id="imga" href="html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
	   <li class="log"><a href="html/sign.jsp" id="ma">로그인/회원가입</a>
		</li>
			<li class="log"><a href="html/sign.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
		</li>
	<!--  	<li class="log">ㅇㅇㅇ님 반갑습니다</li>   -->
	</ul>
	</div>
	</header>
<%	
}else{
%>	
	<header>
	<a id="imga" href="html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
	   <li class="log"><a href="<%=request.getContextPath()%>/logout.do" id="logout" method="get">로그아웃</a>
		</li>
			<li class="log"><a href="html/mypage.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
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
     <li><a href="html/구단소개.jsp" id="ma2">구단소개</a></li>
	 <li><a href="html/히스토리.jsp">Histroy</a></li>
	 <li><a href="html/언더독스파크.jsp">언더독스 파크</a></li>
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
     <li><a href="#">구단소식</a></li>
	 <li><a href="#">팬게시판</a></li>
	 <li><a href="#">문의사항</a></li>
     </ul>
			   </div>
		</li>
      <li><a href="#" id="ma">GAME</a>
		</li>
	  <li><a href="#" id="ma">TICKET</a>
		</li>
      <li><a href="#" id="ma">LIVE GAME</a>
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
    </div>
		<div id="photo"><img id="photo1" src="<%=request.getContextPath() %>/<%=pooInfo.getP_img2()%>"></div>
		<div id="name" class="stat"><span class="name"><%=pooInfo.getP_name() %></span></div>
		<div id="num" class="stat"><span class="upstat"><%=pooInfo.getP_no() %></span></div>
		<div id="poji" class="stat"><span class="upstat" id="korean"><%=pooInfo.getP_position() %></span></div>
		<div id="hand" class="stat"><span class="upstat" id="korean"><%=pooInfo.getLr() %></span></div>
		<div id="age" class="stat"><span class="upstat" id="korean"><%=pooInfo.getP_age() %></span></div>
		<div id="date" class="stat"><span class="upstat" id="korean"><%=pooInfo.getP_hdate() %></span></div>
		<div id="singles" class="stat"><span class="downstat" id="korean"><%=pooBatter.getSingles() %></span></div>
		<div id="doubles" class="stat"><span class="downstat" id="susja"><%=pooBatter.getDoubles() %></span></div>
		<div id="triples" class="stat"><span class="downstat" id="susja"><%=pooBatter.getTriples() %></span></div>
		<div id="strikeouts" class="stat"><span class="downstat" id="susja"><%=pooBatter.getStrikeouts() %></span></div>
		<div id="bb" class="stat"><span class="downstat" id="susja"><%=pooBatter.getBb() %></span></div>
		<div id="hr" class="stat"><span class="downstat" id="susja"><%=pooBatter.getHr() %></span></div>
		
		<img src="<%=request.getContextPath() %>/resources/images/투수프로필.png"> <br>
		<div id="back1"> <a href="javascript:window.history.back();" id="tusuback">다른 선수보기</a> </div>
		
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