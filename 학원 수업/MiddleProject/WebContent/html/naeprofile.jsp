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
</head>

<body>
<% 
HttpSession sessionLog = request.getSession();


LoginVO loginId = (LoginVO)sessionLog.getAttribute("loginSign");

PlayerVO naeInfo = (PlayerVO)request.getAttribute("naeInfo");


PitcherVO naePitcher = (PitcherVO)request.getAttribute("naePitcher");


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
	<!--  	<li class="log">ㅇㅇㅇ님 반갑습니다</li>   -->
	</ul>
	</div>
	</header>
<%	
}else{
%>	
	<header>
	<a id="imga" href="main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
		<div id="log1">
		<ul>	
	   <li class="log"><a href="<%=request.getContextPath()%>/logout.do" id="logout" method="get">로그아웃</a>
		</li>
			<li class="log"><a href="mypage.jsp" id="ma"><i class="fa fa-user"></i> MY PAGE</a>
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
     <li><a href="#">감독</a></li>
	 <li><a href="#">코치</a></li>
	 <li><a href="투수소개.jsp">투수</a></li>
	 <li><a href="포수소개.jsp">포수</a></li>
	 <li><a href="#">내야수</a></li>
	 <li><a href="#">외야수</a></li>
	 <li><a href="#">응원단</a></li>	
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
     <li><a href="#" id="g1">감독</a></li>
	 <li><a href="#" id="g2">코치</a></li>
	 <li><a href="투수소개.jsp" id="g3">투수</a></li>
	 <li><a href="포수소개.jsp" id="g4">포수</a></li>
	 <li><a href="내야수.jsp" id="g5">내야수</a></li>
	 <li><a href="외야수.jsp" id="g6">외야수</a></li>
	 <li><a href="#" id="g7">응원단</a></li>	 
     </ul>
    </div>
		<div id="photo"><img id="photo1" src="<%=request.getContextPath() %>/<%=naeInfo.getP_img2()%>"></div>
		<div id="name" class="stat"><span class="name"><%=naeInfo.getP_name() %></span></div>
		<div id="num" class="stat"><span class="upstat"><%=naeInfo.getP_no() %></span></div>
		<div id="poji" class="stat"><span class="upstat" id="korean"><%=naeInfo.getP_position() %></span></div>
		<div id="hand" class="stat"><span class="upstat" id="korean"><%=naeInfo.getLr() %></span></div>
		<div id="age" class="stat"><span class="upstat" id="korean"><%=naeInfo.getP_age() %></span></div>
		<div id="date" class="stat"><span class="upstat" id="korean"><%=naeInfo.getP_hdate() %></span></div>
		<div id="era" class="stat"><span class="upstat" id="korean"><%=naePitcher.getEra() %></span></div>
		<div id="win" class="stat"><span class="downstat" id="susja"><%=naePitcher.getWins() %></span></div>
		<div id="pso" class="stat"><span class="downstat" id="susja"><%=naePitcher.getPso() %></span></div>
		<div id="hold" class="stat"><span class="downstat" id="susja"><%=naePitcher.getHold() %></span></div>
		<div id="save" class="stat"><span class="downstat" id="susja"><%=naePitcher.getSaves() %></span></div>
		<div id="ining" class="stat"><span class="downstat" id="susja"><%=naePitcher.getIp() %></span></div>
		<div id="ppb" class="stat"><span class="downstat" id="susja"><%=naePitcher.getPbb() %></span></div>
		<img src="<%=request.getContextPath() %>/resources/images/투수프로필.png"> <br>
		<div id="back1"> <a href="투수소개.jsp" id="tusuback">다른 선수보기</a> </div>
		
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