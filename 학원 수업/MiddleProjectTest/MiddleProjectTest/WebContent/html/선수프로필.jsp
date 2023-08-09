<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>투수 소개</title>
	<link rel="stylesheet" href="../resources/css/선수프로필.css">
<link rel="shortcut icon" href="../resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
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
	<a id="imga" href="main.jsp"><img src = "../resources/images/타이틀.png"></a>
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
	<a id="imga" href="main.jsp"><img src = "../resources/images/타이틀.png"></a>
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
     <li><a href="코칭스탭.jsp">코칭스탭</a></li>
	 <li><a href="투수소개.jsp">투수</a></li>
	 <li><a href="포수소개.jsp">포수</a></li>
	 <li><a href="#">내야수</a></li>
	 <li><a href="#">외야수</a></li>
	 <li><a href="응원단.jsp">응원단</a></li>	
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
     <li><a href="코칭스탭.jsp" id="g1">코칭스탭</a></li>
	 <li><a href="투수소개.jsp" id="g3">투수</a></li>
	 <li><a href="포수소개.jsp" id="g4">포수</a></li>
	 <li><a href="내야수.jsp" id="g5">내야수</a></li>
	 <li><a href="외야수.jsp" id="g6">외야수</a></li>
	 <li><a href="응원단.jsp" id="g7">응원단</a></li>		 
     </ul>
    </div>
		<div id="photo"><img id="photo1" src="../resources/images/투수오경석.png"></div>
		<div id="name" class="stat"><span class="name">오경석</span></div>
		<div id="num" class="stat"><span class="upstat">01</span></div>
		<div id="poji" class="stat"><span class="upstat" id="korean">선발투수</span></div>
		<div id="hand" class="stat"><span class="upstat" id="korean">좌투</span></div>
		<div id="age" class="stat"><span class="upstat" id="korean">30</span></div>
		<div id="date" class="stat"><span class="upstat" id="korean">2023.01.04</span></div>
		<div id="era" class="stat"><span class="upstat" id="korean">3.19</span></div>
		<div id="win" class="stat"><span class="downstat" id="susja">27</span></div>
		<div id="pso" class="stat"><span class="downstat" id="susja">10</span></div>
		<div id="hold" class="stat"><span class="downstat" id="susja">49</span></div>
		<div id="save" class="stat"><span class="downstat" id="susja">37</span></div>
		<div id="ining" class="stat"><span class="downstat" id="susja">14</span></div>
		<div id="ppb" class="stat"><span class="downstat" id="susja">09</span></div>
		<img src="../resources/images/투수프로필.png"> <br>
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