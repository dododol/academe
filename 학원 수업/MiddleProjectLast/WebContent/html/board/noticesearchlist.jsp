<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="kr.or.ddit.middle.vo.NoticeVO"%>
<%@page import="kr.or.ddit.middle.vo.FanBoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="KO">
<head>
<meta charset="UTF-8">
<title>DDIT UNDER DOGS - 팬게시판</title>
<link href="<%=request.getContextPath()%>/resources/css/팬게시판list.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script>
$(function(){
	var write = $("#write");
	
	write.on("click", function(){
		location.href = "<%=request.getContextPath()%>/html/board/noticeForm.jsp";
	});
	
	
	$(".player").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo.do?name=" + people;
	   });
	   
	   $(".player1").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo1.do?name=" + people;
	   });
	   
	
	   $(".player2").on('click',function(){
	      
	      people = "";
	      people =$(this).text();
	         
	      location.href="<%=request.getContextPath() %>/playerInfo2.do?name=" + people;
	   });
	   
	   $(".player3").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath() %>/playerInfo3.do?name=" + people;
	   });
	
});

function proc1() {
	location.href = "<%=request.getContextPath()%>+/board/noticeTitleSearch.do";
}
</script>
</head>

<body>
	<%
	LoginVO loginId = (LoginVO)session.getAttribute("loginSign");
	%>
	
	<% 
if(loginId == null){
%>	
	<header>
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
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
	<a id="imga" href="<%=request.getContextPath()%>/html/main.jsp"><img src = "<%=request.getContextPath() %>/resources/images/타이틀.png"></a>
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
      <li></i><a href="<%=request.getContextPath()%>/html/main.jsp" id="ma">UNDER DOGS</a> 
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
	  <li><a target="_blank" href="<%=request.getContextPath() %>/ticket.do" id="ma">TICKET</a>
		</li>
	   <li><a href="<%=request.getContextPath() %>/liveGame.do" id="ma">LIVE GAME</a>
		</li>
    </ul>	
	</div>
</nav>
<%--게시판 시작부분 --%>
            <section class="article-list table-common con">
            <div class="gudan">	  
     <ul id="an">	 
     <li><a href="<%=request.getContextPath()%>/board/noticelist.do" id="g1">구단소식</a></li>
	 <li><a href="<%=request.getContextPath()%>/board/fanboardlist.do" id="g2">팬게시판</a></li>
	 <li><a href="<%=request.getContextPath()%>/board/qnaList.do">문의사항</a></li>
     </ul> 
     </div><br>
       <div id="tablediv">
		      <form class="d-flex" action="<%=request.getContextPath()%>/board/noticeTitleSearch.do" method="post">
		       
		       			<div class="search">
				<input class="form-controlme-2" type="text" id="sword"
					name="sword" placeholder="검색어를 입력해주세요.">
				<button id="searchbt" class="btn btn-primary" type="submit"><i class="fa fa-search"></i></button>
				</div>
				
				</form>
				
				
                  		<table id="fanBoard">
				<caption id="fanBoardName">구단 소식</caption>
				<thead id="fanthead">
					<tr class="fantr">
						<th class="fanth" id="thNo">번호</th>
						<th class="fanth" id="thSub">제목</th>
						<th class="fanth" id="thWrit">작성자</th>
						<th class="fanth" id="thDate">작성일</th>
						<th class="fanth" id="thHit">조회수</th>
					</tr>
				</thead>
                        <tbody>
                         	<%	
                        		List<NoticeVO> noticeSearchList =(List<NoticeVO>)request.getAttribute("search");
                        		
                        		if(noticeSearchList== null || noticeSearchList.size()==0) {
                        	%>
                        			
	                        	<tr>
	                                <td colspan="5">
	 								<p style="text-align:center;">
	 								조회하실 게시물이 존재하지 않습니다.</p>
	                                </td>
	                            </tr>
	                            
	                             <%
                        		}else{
                        			for(NoticeVO notiVo : noticeSearchList) {
                        		%>	
	                               
	                            <tr class="tdtr">
						<td class="fantd"><%=notiVo.getN_no()%></td>
						<td class="fantd"><a id="tdsub" 
						href="<%=request.getContextPath()%>/board/noticeDetail.do?nono=<%=notiVo.getN_no()%>&noid=<%=notiVo.getMem_id()%>"><%=notiVo.getN_title()%></a></td>
						<td class="fantd" id="tdid"><%=notiVo.getMem_id()%></td>
						<td class="fantd"><%=notiVo.getN_date()%></td>
						<td class="fantd"><%=notiVo.getN_hit()%></td>
					</tr>
                        	 	<%	
                        			}
                        		}
                        		%>
                        </tbody>
                    </table>
 			<%                   
                  			if(loginId.getMem_id().equals("admin")) {
			%>
			
			<input type="button" value="공지사항 작성" id="write">
			
			<%	 
			 }
			%>
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