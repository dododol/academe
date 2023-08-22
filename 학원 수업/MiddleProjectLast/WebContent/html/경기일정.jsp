<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.middle.vo.MatchVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>경기일정</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/경기일정.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-3.7.0.min.js"></script>
</head>
<script>
$(function(){
    $('#beforebt8').click(function(){
	    if($("#julyall").css("display") == "none"){
            $('#julyall').show();
    	}
    });	    
});
$(function(){
    $('#beforebt8').click(function(){
	    if($("#augall").css("display") != "none"){
            $('#augall').hide();
    	}
    });
});
$(function(){
    $('#beforebt7').click(function(){
	    if($("#juneall").css("display") == "none"){
            $('#juneall').show();
    	}
    });	    
});
$(function(){
    $('#beforebt7').click(function(){
	    if($("#julyall").css("display") != "none"){
            $('#julyall').hide();
    	}
    });
});
$(function(){
    $('#beforebt9').click(function(){
	    if($("#augall").css("display") == "none"){
            $('#augall').show();
    	}
    });	    
});
$(function(){
    $('#beforebt9').click(function(){
	    if($("#sepall").css("display") != "none"){
            $('#sepall').hide();
    	}
    });
});
$(function(){
    $('#beforebt6').click(function(){
    	alert('마지막 달입니다');
    });
});
$(function(){
    $('#nextbt6').click(function(){
	    if($("#julyall").css("display") == "none"){
            $('#julyall').show();
    	}
    });	    
});
$(function(){
    $('#nextbt6').click(function(){
	    if($("#juneall").css("display") != "none"){
            $('#juneall').hide();
    	}
    });
});
$(function(){
    $('#nextbt7').click(function(){
	    if($("#augall").css("display") == "none"){
            $('#augall').show();
    	}
    });	    
});
$(function(){
    $('#nextbt7').click(function(){
	    if($("#julyall").css("display") != "none"){
            $('#julyall').hide();
    	}
    });
});
$(function(){
    $('#nextbt8').click(function(){
	    if($("#sepall").css("display") == "none"){
            $('#sepall').show();
    	}
    });	    
});
$(function(){
    $('#nextbt8').click(function(){
	    if($("#augall").css("display") != "none"){
            $('#augall').hide();
    	}
    });
});
$(function(){
    $('#nextbt9').click(function(){
    	alert('10월달 일정은 9월달에 업데이트 예정입니다.');
    });	    
});
</script>

<%
List<MatchVO> matchlist = (List<MatchVO>)request.getAttribute("list");
LoginVO loginId = (LoginVO)session.getAttribute("loginSign");
%>


<body>
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
	<!--  	<li class="log">ㅇㅇㅇ님 반갑습니다</li>  -->
	</ul>
	</div>
	</header>
<%	
}else if(loginId.getMem_id().equals("admin")){
%>	
	<header>
	<a id="imga" href="<%=request.getContextPath() %>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
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
	<a id="imga" href="<%=request.getContextPath() %>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
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





<%-- <form action="<%=request.getContextPath()%>/matchInfo.do" method="get"> --%>
<div id="augall">	
<div class="thirteen">
 <h1>8월 경기일정</h1>
</div>
<div class="btwhich"><button type="button" id="beforebt8" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt8" class="custom-btn btn-2">다음 달 ▶</button></div>
<div class="gamescheduleall"> 
<%
	for(MatchVO match : matchlist){
		if(match.getM_date().substring(5, 7).equals("08")){
%>		
	<div class="gameschedule"><div class="nemo"><%=match.getM_hw() %></div><br><div class="uptext"><span class="hometeam">대덕언더독스</span><span class="verse">VS</span><span class="awayteam"><%=match.getA_name() %></span></div><br>
	<div class="downtext"><span class="gamedate"><%=match.getM_date() %></span><span class="gameday"><%=match.getM_day() %></span><span class="gametime"><%=match.getM_time() %></span><span class="gameicon">➤</span>
	<span class="gameplace"><%=match.getM_loc() %></span></div>
	<div class="score"><span class="scores"><%=match.getM_result() %><br><%=match.getM_score() %></span></div>	
	</div>
<%
		}
}
%>
</div>
</div>
	<!-- 8월 -->
	
<div id="julyall">	
<div class="thirteen">
 <h1>7월 경기일정</h1>
</div>
	<div class="btwhich"><button type="button" id="beforebt7" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt7" class="custom-btn btn-2">다음 달 ▶</button></div>
<div class="gamescheduleall"> 
	<%
	for(MatchVO match : matchlist){
		if(match.getM_date().substring(5, 7).equals("07")){
%>		
	<div class="gameschedule"><div class="nemo"><%=match.getM_hw() %></div><br><div class="uptext"><span class="hometeam">대덕언더독스</span><span class="verse">VS</span><span class="awayteam"><%=match.getA_name() %></span></div><br>
	<div class="downtext"><span class="gamedate"><%=match.getM_date() %></span><span class="gameday"><%=match.getM_day() %></span><span class="gametime"><%=match.getM_time() %></span><span class="gameicon">➤</span>
	<span class="gameplace"><%=match.getM_loc() %></span></div>
	<div class="score"><span class="scores"><%=match.getM_result() %><br><%=match.getM_score() %></span></div>	
	</div>
<%
		}
}
%>

	</div>
</div>	
	<!-- 7월 -->
	
<div id="juneall">	
<div class="thirteen">
 <h1>6월 경기일정</h1>
</div>
	<div class="btwhich"><button type="button" id="beforebt6" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt6" class="custom-btn btn-2">다음 달 ▶</button></div>
<div class="gamescheduleall"> 
	<%
	for(MatchVO match : matchlist){
		if(match.getM_date().substring(5, 7).equals("06")){
%>		
	<div class="gameschedule"><div class="nemo"><%=match.getM_hw() %></div><br><div class="uptext"><span class="hometeam">대덕언더독스</span><span class="verse">VS</span><span class="awayteam"><%=match.getA_name() %></span></div><br>
	<div class="downtext"><span class="gamedate"><%=match.getM_date() %></span><span class="gameday"><%=match.getM_day() %></span><span class="gametime"><%=match.getM_time() %></span><span class="gameicon">➤</span>
	<span class="gameplace"><%=match.getM_loc() %></span></div>
	<div class="score"><span class="scores"><%=match.getM_result() %><br><%=match.getM_score() %></span></div>	
	</div>
<%
		}
}
%>

	</div>
</div>
	
	<!-- 6월 -->
	
<div id="sepall">	
<div class="thirteen">
 <h1>9월 경기일정</h1>
</div>
	<div class="btwhich"><button type="button" id="beforebt9" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt9" class="custom-btn btn-2">다음 달 ▶</button></div>
<div class="gamescheduleall"> 
	<%
	for(MatchVO match : matchlist){
		if(match.getM_date().substring(5, 7).equals("09")){
%>		
	<div class="gameschedule"><div class="nemo"><%=match.getM_hw() %></div><br><div class="uptext"><span class="hometeam">대덕언더독스</span><span class="verse">VS</span><span class="awayteam"><%=match.getA_name() %></span></div><br>
	<div class="downtext"><span class="gamedate"><%=match.getM_date() %></span><span class="gameday"><%=match.getM_day() %></span><span class="gametime"><%=match.getM_time() %></span><span class="gameicon">➤</span>
	<span class="gameplace"><%=match.getM_loc() %></span></div>
	<div class="score"><span class="scores"><%=match.getM_result() %><br><%=match.getM_score() %></span></div>	
	</div>
<%
		}
}
%>
	<!-- 9월 -->
	</div>
</div>			
</section>	
	<footer id="foor">
			<div id="fut">
<h1 id="footh1">DDIT UNERDOGS</h1>
<p><br>
  <i class="fa fa-building"></i> 대전광역시 중구 계룡로 846, 3층 | <i class="fa fa-user"></i> 대표이사 이재혁 | <i class="fa fa-building-o"></i> 사업자등록번호 : 123-10-92344<br>
	<br>
  <i class="fa fa-phone"></i> TEL : 043-003-2034 | <i class="fa fa-phone-square"></i> FAX : 042-394-2929 </p>
			</div>
<a id="top" href ="#" title="top"> <SPAN><i class="fa fa-angle-double-up"></i> TOP</SPAN> </a>
</footer>
</body>
</html>