<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="KO">
<head>
<meta charset="UTF-8">
<title>DDIT UNDER DOGS</title>
<link rel="stylesheet" href="../resources/css/main.css">
<link rel="shortcut icon" href="../resources/images/미니.png">
<script type="text/javascript" src="../resources/js/jquery-3.7.0.min.js"></script>
	<script src="../resources/js/slide.js"></script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script>
$(function(){
	$("#tusu").on('click',function(){
		
		people = "";
		people =$(this).text();
			
		location.href="<%=request.getContextPath() %>/playerInfo.do?name=" + people;
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
<div>
<nav id="hed">
<div class="main">
	<ul>
      <li></i><a href="main.jsp" id="ma">UNDER DOGS</a> 
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
	 <li><a href="#" onclick="tusu" id="tusu">투수</a></li>
	 <li><a href="포수소개.jsp">포수</a></li>
	 <li><a href="내야수.jsp">내야수</a></li>
	 <li><a href="외야수.jsp">외야수</a></li>
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
	</div>
		<section id="mid">
			<video src="../resources/images/최강1조완성.mp4" muted autoplay loop></video>
		<div id="index_01">
        <div i
d="header1">좌우 슬라이딩</div>
        <div id="slide1">
            <ul>
                <li><a href="#"><img src="../resources/images/슬라이드쇼/1 (1).png" alt="슬라이드1"></a></li>
                <li><a href="#"><img src="../resources/images/슬라이드쇼/1 (2).png"></a></li>
                <li><a href="#"><img src="../resources/images/슬라이드쇼/1 (3).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (4).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (5).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (6).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (7).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (8).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (9).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (10).png"></a></li>
				<li><a href="#"><img src="../resources/images/슬라이드쇼/1 (11).png"></a></li>
            </ul>
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