<%@page import="kr.or.ddit.middle.vo.PlayerVO"%>
<%@page import="java.util.List"%>
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
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/slide.js"></script>
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

List<PlayerVO> array = (List<PlayerVO>)request.getAttribute("playerInfo2");

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
<div>
<nav id="hed">
<div class="main">
	<ul>
      <li><a href="<%=request.getContextPath()%>/html/main.jsp" id="ma">UNDER DOGS</a> 
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
	 <li><a href="<%=request.getContextPath()%>/html/응원단.jsp" id="g7">응원단</a></li>			
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
</div>
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
		<div class="tususoge" id="tusu1"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(0).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(0).getP_name() %></p></div>
		<div class="tususoge" id="tusu1-1"><img src="<%=request.getContextPath()%>/<%=array.get(0).getP_img2()%>" data-id="<%=array.get(0).getP_no()%>" name="tusu" class="clsTusu" /></div>
	    </div>
		
		<div class="tusuh">
		<div class="tususoge" id="tusu2"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(1).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(1).getP_name() %></p></div>
		<div class="tususoge" id="tusu2-1"><img src="<%=request.getContextPath()%>/<%=array.get(1).getP_img2()%>" data-id="<%=array.get(1).getP_no()%>" name="tusu" class="clsTusu" /></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu3"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(2).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(2).getP_name() %></p></div>
		<div class="tususoge" id="tusu3-1"><img src="<%=request.getContextPath()%>/<%=array.get(2).getP_img2()%>" data-id="<%=array.get(2).getP_no()%>" name="tusu" class="clsTusu" /></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu4"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(3).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(3).getP_name() %></p></div>
		<div class="tususoge" id="tusu4-1"><img src="<%=request.getContextPath()%>/<%=array.get(3).getP_img2()%>" data-id="<%=array.get(3).getP_no()%>" name="tusu" class="clsTusu" /></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu5"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(4).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(4).getP_name() %></p></div>
		<div class="tususoge" id="tusu5-1"><img src="<%=request.getContextPath()%>/<%=array.get(4).getP_img2()%>" data-id="<%=array.get(4).getP_no()%>" name="tusu" class="clsTusu" /></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu6"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(5).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(5).getP_name() %></p></div>
		<div class="tususoge" id="tusu6-1"><img src="<%=request.getContextPath()%>/<%=array.get(5).getP_img2()%>" data-id="<%=array.get(5).getP_no()%>" name="tusu" class="clsTusu" /></div>
		</div>
			
		<div class="tusuh">
		<div class="tususoge" id="tusu7"><a href="#" class="player3"><img  src="<%=request.getContextPath()%>/<%=array.get(6).getP_img1() %>" name="tusu" onclick="tusu()" ></a><p class="sunsunm"><%=array.get(6).getP_name() %></p></div>
		<div class="tususoge" id="tusu7-1"><img src="<%=request.getContextPath()%>/<%=array.get(6).getP_img2()%>" data-id="<%=array.get(6).getP_no()%>" name="tusu" class="clsTusu" /></div>
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

<script type="text/javascript">

$(function(){
	$(".clsTusu").on("click",function(){
		//class="clsTusu" 이 요소들 중에서 방금 클릭한 바로 그 요소
		//data-id=""1
		let id = $(this).data("id");	//1
		console.log("id : " + id);
		
		location.href="<%=request.getContextPath()%>/naeInfo.do?id="+id;
	});
});
</script>

</body>
</html>