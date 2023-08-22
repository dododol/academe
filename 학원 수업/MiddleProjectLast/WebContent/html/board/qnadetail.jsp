<%@page import="kr.or.ddit.middle.vo.ReplyVO"%>
<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="kr.or.ddit.middle.vo.QnaVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true"%>
<!DOCTYPE html>
<html lang="KO">
<head>
<meta charset="UTF-8">
<title>DDIT UNDER DOGS - 팬게시판</title>
<link href="<%=request.getContextPath()%>/resources/css/게시판상세글.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<%
	QnaVO qVO=(QnaVO)request.getAttribute("qnadetail");
	
	%> 	
<script type="text/javascript">
$(function(){
	var addBtn = $("#addBtn");
	var frm = $("#frm");
	
	
	addBtn.on("click", function(){
		var title = $("#title").val();
		
		if(title == ""){
			alert("제목을 입력해주세요.");
			return false;
		}
		
		frm.submit();
	});
	
	var listBtn = $("#listBtn");
	var udtBtn = $("#updateBtn");
	var delBtn = $("#deleteBtn");
	var frm =$("#frm");
	
	listBtn.on("click", function(){
		location.href = "<%=request.getContextPath()%>/board/qnaList.do";
	});
	
	udtBtn.on("click", function(){
		frm.attr("action", "<%=request.getContextPath()%>/board/qnaUpdate.do?qnano=<%=qVO.getQ_no()%>");
		frm.attr("method", "post");
		frm.submit();
	});
	
	delBtn.on("click", function(){
		if(confirm("정말 삭제하시겠습니까?")){
			frm.submit();
		}
	});
		
	
	$(document).on("click","#replyUpdate",function(){
		
		reContent = $(this).parents("#replyResult").find(".replyContentUpdate").val();
		reNo = $(this).parents("#replyResult").find(".replyNo").val();
		qnano = $(this).parents("#replyResult").find(".qnano").val();
		
		location.href="<%=request.getContextPath()%>/board/updateQnaReply.do?content="+reContent+"&reno="+reNo+"&qnano="+qnano;
	});
	
	
	$(document).on("click","#replyDelete",function(){
		reNo = $(this).parents("#replyResult").find(".replyNo").val();
		qnano = $(this).parents("#replyResult").find(".qnano").val();
		location.href="<%=request.getContextPath()%>/board/deleteQnaReply.do?reno="+reNo+"&qnano="+qnano;
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

<div>
<nav id="hed">
<div class="main">
	<ul>
      <li></i><a href="<%=request.getContextPath()%>/html/main.jsp" id="ma">UNDER DOGS</a> 
	<div class="an2">	  
     <ul id="an">	 
     <li><a href="<%=request.getContextPath()%>/html/구단소개.html" id="ma2">구단소개</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/히스토리.html">Histroy</a></li>
	 <li><a href="<%=request.getContextPath()%>/html/언더독스파크.html">언더독스 파크</a></li>
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
     <li><a href="<%=request.getContextPath()%>/board/noticelist.do" id="g1">구단소식</a></li>
	 <li><a href="<%=request.getContextPath()%>/board/fanboardlist.do" id="g2">팬게시판</a></li>
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
<%--상세보기 시작부분 --%>
	<section class="article-list table-common con">	
      <div class="fanall">
      <div>
	    <div class="fancon">
		  <div class="fanname2"> <span class="fanname">문의 사항</span></div>
		     <div class="fantitle"> <span><%=qVO.getQ_title()%></span></div>
		     <div class="fantop">
		     <span id="fanid" class="faninfo"> 작성자 </span> <span class="faninfo2"><%=qVO.getMem_id() %></span>
		  <span class ="gubun">|</span>
		  <span id="fandate" class="faninfo"> 작성일 </span> <span class="faninfo2"> <%=qVO.getQ_date() %></span>
		  <span class ="gubun">|</span>
		   <span id="hitnum" class="faninfo">조회수</span> <span class="faninfo2"> <%=qVO.getQ_hit() %></span>
		  </div>
		  
		  <div id="detailcontent"><span id="con"><%=qVO.getQ_content()%></span></div>
       </div>
		        <br><br>
		        <div id="detailFileList">		   		    
		    		    
		     <%-- 댓글 시작부분 --%>
		    <%
		    List<ReplyVO> replyList =(List<ReplyVO>)request.getAttribute("replyList");
		    if(replyList==null || replyList.size()==0) {
		    %>
			<p class="rethat">작성한 댓글이 없습니다. 작성해주세요.</p>		    
			
			
			<%
		    }else{
			%>	   
			<div class="reply-body">
			<%
			for(ReplyVO rVO : replyList) {
				
			
			%>
					            
					               <div id="replyResult">
					              <%
								  	if(loginId.getMem_id().equals(rVO.getMem_id())|| loginId.getMem_id().equals("admin")) {
								  %>
								  <div class="thatgl">
								  <input class="replyContentUpdate" name="replyContentUpdate" value="<%=rVO.getRe_content()%>" type="text">
								  <div class="that">
								  <p class="thatglinfo">
						                             <span><%=rVO.getMem_id() %></span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						                              <span><%=rVO.getRe_date() %></span>     
						               </p>
						               </div>			                
						               <input type="button"  value="댓글수정" name="replyUpdate" id="replyUpdate" class="replyinfo">
						               <input type="button"  value="댓글삭제" name="replyDelete" id="replyDelete" class="replyinfo">
						               </div>
 											<input type="hidden" class="qnano" name="qnano" value="<%=qVO.getQ_no()%>"/>
					           				<input type="hidden" value="<%=rVO.getRe_no() %>" class="replyNo" name="replyNo">
						              
					               <%    
									}else {
								    %>
								      <div class="thatgl">
								    <input class="replyContentUpdate" name="replyContentUpdate" 
								          disabled="disabled" value="<%=rVO.getRe_content()%>" type="text">
								          <div class="that">
								  <p class="thatglinfo">
						                             <span><%=rVO.getMem_id() %></span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						                              <span><%=rVO.getRe_date() %></span>     
						               </p>
						                </div>
								    
								    <%
								    }
					              	%>
					          
					        </div>
				<%
				}
		    }
				%>	
				
				
					<form action="<%=request.getContextPath()%>/board/insertQnaReply.do" method="post">
						<div>
						<input type="text" id="replyWrite" name="replyWrite" placeholder="댓글을 입력해주세요">
						
					    </div>
					     <input type="hidden" id="qnano" name="qnano" value="<%=qVO.getQ_no()%>"/>
						<input type="submit" id="replysubmit" value="댓글등록">
					 </form>
					
				
			
		    
		    
		    
	    </div>
	    <br>
	     <input type="button" id="listBtn" value="목록으로 가기" class="fanbtn">
	     <%
	    	if(loginId.getMem_id().equals(qVO.getMem_id())|| loginId.getMem_id().equals("admin")) {
	     %>
	    
		    <input type="button" id="updateBtn" value="수정" class="fanbtn">
		    <input type="button" id="deleteBtn" value="삭제" class="fanbtn">
		    </div>
		<%    
		}
	    %>
	</div>
	
	<form action="<%=request.getContextPath()%>/board/qnaDelete.do" method="post" id="frm">
	<input type="hidden" id="qnano" name="qnano" value="<%=qVO.getQ_no()%>"/>
	</form>
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