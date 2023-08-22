<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="kr.or.ddit.middle.vo.NoticeVO"%>
<%@page import="kr.or.ddit.middle.vo.FileInfoVO"%>
<%@page import="kr.or.ddit.middle.vo.FanBoardVO"%>
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
	NoticeVO noVo=(NoticeVO) request.getAttribute("detail");
	
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
		location.href = "<%=request.getContextPath()%>/board/noticelist.do";
	});
	
	udtBtn.on("click", function(){
		frm.attr("action", "<%=request.getContextPath()%>/board/noticeUpdate.do?nono=<%=noVo.getN_no()%>");
		frm.attr("method", "post");
		frm.submit();
	});
	
	delBtn.on("click", function(){
		if(confirm("정말 삭제하시겠습니까?")){
			frm.submit();
		}
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
<div>
<nav id="hed">
<div class="main">
	<ul>
      <li></i><a href="<%=request.getContextPath() %>/html/main.jsp" id="ma">UNDER DOGS</a> 
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
		  <div class="fanname2"> <span class="fanname">구단소식</span></div>
		  <div class="fantitle"> <span><%=noVo.getN_title()%></span></div>
		     <div class="fantop">
		  <span id="fanid" class="faninfo"> 작성자 </span> <span class="faninfo2"><%=noVo.getMem_id() %></span>
		  <span class ="gubun">|</span>
		  <span id="fandate" class="faninfo"> 작성일 </span> <span class="faninfo2"> <%=noVo.getN_date() %></span>
		  <span class ="gubun">|</span>
		   <span id="hitnum" class="faninfo">조회수</span> <span class="faninfo2"> <%=noVo.getN_hit() %></span>
		  </div>
		  
		  
		         <div id="detailcontent"><span id="con"><%=noVo.getN_content()%></span></div>
		  </div>
		        <br><br>
		        <div id="detailFileList">
		        
		         <table class="table" id="filetb">
		         <thead>
		         <tr>
		         	<th class="fileth">파일명</th>
		       		<th class="fileth">업로드날짜</th>
		            <th class="fileth">파일크기</th>
		         </tr>
		        
		         </thead>
		         <tbody>
		         <%
		         List<FileInfoVO> fileList = (List<FileInfoVO>)request.getAttribute("fileList");
		         if(fileList==null || fileList.size()==0 ){
		         %>
		        <tr>
		         <td colspan="3" id="nullfile">등록하신 파일목록이 없습니다.</td>
		         </tr>
		         
		         <%
		         }else{
		         for(FileInfoVO fileVO1 : fileList) {
		         %>
		         
		         <tr>
		         	<td class="filetd" ><%=fileVO1.getOrigin_file_name() %></td>
		       		<td class="filetd"><%=fileVO1.getFile_date()%></td>
		            <td class="filetd"><%=fileVO1.getFile_size()%></td>
		         </tr>  
		         
		    <% 
		   	 }
		   }
		    %>
		    
		         </tbody>
		         </table>
		        
		        </div>
		        <br><br>
		    
	    </div><br>
	    <div class="btnlist">
	    <input type="button" id="listBtn" value="목록으로 가기" class="fanbtn">
	     <%
	    	if(loginId.getMem_id().equals(noVo.getMem_id())|| loginId.getMem_id().equals("admin")) {
	     %>
		     <input type="button" id="updateBtn" value="수정" class="fanbtn">
		    <input type="button" id="deleteBtn" value="삭제" class="fanbtn">
		    </div>
		<%    
		}
	    %>
	</div>
	
	<form action="<%=request.getContextPath()%>/board/noticeDelete.do" method="post" id="frm">
	<input type="hidden" name="nono" value="<%=noVo.getN_no()%>"/>
	</form>
      
      
      
<!--       <div>
					<div >
						<div>
							<div >
								<div >
									<h4 >팬게시글 작성</h4>
									<p>
										DDIT UNDERDOGS !
										<code>언더독스에게 해주고싶은말을 작성해주세요.</code>
									</p>
									<form  action="/board/insert.do" method="post" id="frm">
										<div class="form-group">
											<input type="text" id="title" name="b_title" placeholder="제목을 입력해주세요.">
										</div>
										<div class="form-group">
											<textarea  id="content" rows="10" name="b_content" placeholder="내용을 입력해주세요."></textarea>
										</div>
										<div >
											<button type="button"  id="addBtn">등록</button>
											<button type="button" onclick="javascript:location.href='/board/list.do'">목록</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div> -->
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