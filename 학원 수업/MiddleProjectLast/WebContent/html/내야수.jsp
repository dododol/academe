<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>내야수 소개</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/내야수.css">
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
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
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath()%>/resources/images/타이틀.png"></a>
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
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath()%>/resources/images/타이틀.png"></a>
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
      <li></i><a href="<%=request.getContextPath()%>/html/main.jsp" id="ma">UNDER DOGS</a>
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
    </div>
		
		<div class="tusuh">
		<div class="tususoge" id="tusu1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수권도윤.png"></a><p class="sunsunm">권 도 윤</p></div>
		<div class="tususoge" id="tusu1-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수권도윤.png"></a></div>
	    </div>
		
		<div class="tusuh">
		<div class="tususoge" id="tusu2"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수김보영.png"></a><p class="sunsunm">김 보 영</p></div>
		<div class="tususoge" id="tusu2-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수김보영.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu3"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수신범종.png"></a><p class="sunsunm">신 범 종</p></div>
		<div class="tususoge" id="tusu3-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수신범종.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu4"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수신수연.png"></a><p class="sunsunm">신 수 연</p></div>
		<div class="tususoge" id="tusu4-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수신수연.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu5"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수이건창.png"></a><p class="sunsunm">이 건 창</p></div>
		<div class="tususoge" id="tusu5-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수이건창.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu6"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수전수진.png"></a><p class="sunsunm">전 수 진</p></div>
		<div class="tususoge" id="tusu6-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수전수진.png"></a></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu7"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/흑내야수조현준.png"></a><p class="sunsunm">조 현 준</p></div>
		<div class="tususoge" id="tusu7-1"><a href="타자프로필.jsp" class="tusu"><img src="../resources/images/내야수조현준.png"></a></div>
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