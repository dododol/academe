<%@page import="kr.or.ddit.middle.vo.MatchVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="KO">
<head>

<meta charset="UTF-8">
<title>DDIT UNDER DOGS</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/main.css">
<link rel="shortcut icon" href="<%=request.getContextPath() %>/resources/images/미니.png">
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-3.7.0.min.js"></script>
   <script src="<%=request.getContextPath() %>/resources/js/slide.js"></script>
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
// HttpSession sessionLog = request.getSession();


LoginVO loginId = (LoginVO)session.getAttribute("loginSign");
List<MatchVO> ticket = (List<MatchVO>)session.getAttribute("ticket"); 


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
   </div>
   	<button type="button" id="chatbt">
  <img id="chatbot" src="../resources/images/FAQ.png" alt="대체 텍스트" onclick="window.open('index.jsp','window_name','width=1000,height=370,location=no,status=no,scrollbars=yes');" >
</button>
      <section id="mid">
         <video src="<%=request.getContextPath() %>/resources/images/최강1조완성.mp4" muted autoplay loop></video>
      <div id="index_01">
        <div id="header1">좌우 슬라이딩</div>
        <div id="slide1">
            <ul>
                <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (1).png" alt="슬라이드1"></a></li>
                <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (2).png"></a></li>
                <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (3).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (4).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (5).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (6).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (7).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (8).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (9).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (10).png"></a></li>
            <li><a href="#"><img src="<%=request.getContextPath() %>/resources/images/슬라이드쇼/1 (11).png"></a></li>
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