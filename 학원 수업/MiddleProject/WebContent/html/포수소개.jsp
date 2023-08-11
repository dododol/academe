<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>포수 소개</title>
<link rel="stylesheet" href="../resources/css/포수소개.css">
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
     <li><a href="##" id="g1">감독</a></li>
	 <li><a href="##" id="g2">코치</a></li>
	 <li><a href="투수소개.jsp" id="g3">투수</a></li>
	 <li><a href="포수소개.jsp" id="g4">포수</a></li>
	 <li><a href="내야수.jsp" id="g5">내야수</a></li>
	 <li><a href="외야수.jsp" id="g6">외야수</a></li>
	 <li><a href="##" id="g7">응원단</a></li>	 
     </ul>
    </div>
		
		<div class="tusuh">
		<div class="tususoge" id="tusu1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑포수김재성.png"></a><p class="sunsunm">김 재 성</p></div>
		<div class="tususoge" id="tusu1-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/포수김재성.png"></a></div>
	    </div>
		
		<div class="tusuh">
		<div class="tususoge" id="tusu2"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑포수김정하.png"></a><p class="sunsunm">김 정 하</p></div>
		<div class="tususoge" id="tusu2-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/포수김정하.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu3"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑포수김태형.png"></a><p class="sunsunm">김 태 형</p></div>
		<div class="tususoge" id="tusu3-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/포수김태형.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu4"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑포수우정범.png"></a><p class="sunsunm">우 정 범</p></div>
		<div class="tususoge" id="tusu4-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/포수우정범.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu5"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑포수최광식.png"></a><p class="sunsunm">최 광 식</p></div>
		<div class="tususoge" id="tusu5-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/포수최광식.png"></a></div>
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