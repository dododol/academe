<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="true"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>로그인/회원가입</title>
<link href="<%=request.getContextPath()%>/resources/css/sign.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/resources/images/미니.png">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>
		$(function(){
			   
			   $('#btn1').on('click',function(){
			      event.preventDefault(); // 폼 제출을 막음
			      
			      var pw = $('#pw').val();
			      var userpw = $('#userpw').val();
			      
			      
			      if(pw==userpw) {
			         alert("비밀번호가 일치합니다. 회원정보수정 페이지로 이동합니다");
			          // 비밀번호 일치 시 페이지 이동
			            window.location.href = '<%=request.getContextPath()%>/mypage.do';
			         
			      }else {
			         alert("비밀번호가 일치하지 않습니다. 다시 입력해주세요.")
			         return false;
			      }
		}); 
		
	});

$(function(){
	
		$(".player").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath()%>/playerInfo.do?name=" + people;
		   })

		});
		
		$(function(){
		   $(".player1").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath()%>/playerInfo1.do?name=" + people;
		   })

		});
		
		$(function(){
		   $(".player2").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath()%>/playerInfo2.do?name=" + people;
		   })

		});
		
		$(function(){
		   $(".player3").on('click',function(){
		      
		      people = "";
		      people =$(this).text();
		         
		      location.href="<%=request.getContextPath()%>/playerInfo3.do?name="+ people;
			});
		});
</script>



<style>
.btn {
	margin: 5px;
	float: right;
}

#searchpost {
	float: right;
}
</style>


</head>

<body>
	<%
		LoginVO loginId = (LoginVO) session.getAttribute("loginSign");
	LoginVO loginInfo = (LoginVO) request.getAttribute("selectAllInfo");

	String pwCheck = (String) request.getAttribute("selectByPw");
	%>




	<%
		if (loginId == null) {
	%>
	<header>
		<a id="imga" href="main.jsp"><img
			src="<%=request.getContextPath()%>/resources/images/타이틀.png"></a>
		<div id="log1">
			<ul>
				<li class="log"><a href="sign.jsp" id="ma">로그인/회원가입</a></li>
				<li class="log"><a href="sign.jsp" id="ma"><i
						class="fa fa-user"></i> MY PAGE</a></li>
				<!--     <li class="log">ㅇㅇㅇ님 반갑습니다</li>  -->
			</ul>
		</div>
	</header>
	<%
		} else {
	%>

	<header>
		<a id="imga" href="main.jsp"><img
			src="<%=request.getContextPath()%>/resources/images/타이틀.png"></a>
		<div id="log1">
			<ul>
				<li class="log"><a
					href="<%=request.getContextPath()%>/logout.do" id="logout">로그아웃</a>
				</li>
				<li class="log"><a
					href="<%=request.getContextPath()%>/html/mypage/mypagepw.jsp"
					id="ma"><i class="fa fa-user"></i> MY PAGE</a></li>
				<li class="log"><%=loginId.getMem_name()%>님 반갑습니다.</li>
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
					<li></i><a href="<%=request.getContextPath()%>/html/main.jsp"
						id="ma">UNDER DOGS</a>
						<div class="an2">
							<ul id="an">
								<li><a href="<%=request.getContextPath()%>/html/구단소개.jsp" id="ma2">구단소개</a></li>
								<li><a href="<%=request.getContextPath()%>/html/히스토리.jsp">Histroy</a></li>
								<li><a href="<%=request.getContextPath()%>/html/언더독스파크.jsp">언더독스 파크</a></li>
							</ul>
						</div></li>
					<li><a href="#" id="ma">PLAYERS</a>
						<div class="an2">
							<ul id="an">
								<li><a href="<%=request.getContextPath()%>/html/코칭스탭.jsp"
									id="g2">코칭스텝</a></li>
								<li><a href="#" class="player">투수</a></li>
								<li><a href="#" class="player1">포수</a></li>
								<li><a href="#" class="player2">내야수</a></li>
								<li><a href="#" class="player3">외야수</a></li>
								<li><a href="<%=request.getContextPath()%>/html/응원단.jsp"
									id="g7">응원단</a>
							</ul>
						</div></li>
					<li><a href="#" id="ma">FAN</a>
						<div class="an2">
							<ul id="an">
								<li><a
									href="<%=request.getContextPath()%>/board/noticelist.do">구단소식</a></li>
								<li><a
									href="<%=request.getContextPath()%>/board/fanboardlist.do">팬게시판</a></li>
								<li><a
									href="<%=request.getContextPath()%>/board/qnaList.do">문의사항</a></li>
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
			   <section>
			 <div class="login-wrap">
			  <div class="login-html">
			   <!-- <input id="tab-1" type="radio" name="tab" class="sign-in" ><label for="tab-1" class="tab">로그인</label> -->
			    <input id="tab-2" type="radio" name="tab" class="sign-up" checked><label
						for="tab-2" class="tab">회원정보 수정</label>
			    <div class="login-form">
			      <%-- <div class="sign-in-htm">
			      
			        <form action="<%=request.getContextPath()%>/loginSign.do" method="post">
			        <div class="group">
			          <label for="user" class="label">아이디</label>
			          <input id="user" type="text" class="input" name="userid" placeholder="ID를 입력하세요" >
			        </div>
			        <div class="group">
			          <label for="pass" class="label">비밀번호</label>
			          <input id="pass" type="password" class="input" data-type="password" name="userpass" placeholder="PW 입력하세요">
			        </div>
			        <div class="group">
			          <input type="submit" class="button" value="로그인">
			        </div>
			         </form>
			         
			         <div class="hr"></div>
			        <div class="foot-lnk">
			          <a href="#forgot">ID/PASSWORD 찾기</a>
			        </div> 
			      </div> --%>
			       
			      <form id="pw1"
							action="<%=request.getContextPath()%>/passConfirm.do"
							method="post">
			      <div class="sign-up-htm">

			        <div class="group">
			          <label for="pass" class="label">비밀번호확인</label>
			          <input id="pw" type="text" class="input" name="userPW"
										data-type="password" placeholder="비밀번호를 입력해주세요.">
			           <input id="userpw" type="hidden"
										value="<%=loginId.getMem_pw()%>">
			        </div>

			       <div class="group">
			         <input id="btn1" type="submit" class="button" value="확인">
			        </div>
			        
			        </div>
			        </form>
			        <div class="hr"></div>
			      </div>
			    </div>
			  </div>
			
	</div>
			   </section>
			   <footer id="foor">
			         <div id="fut">
			<h1>DDIT UNERDOGS</h1>
			<p>
				<br>
			  <i class="fa fa-building"></i> 대전광역시 중구 계룡로 846, 3층 | <i
					class="fa fa-user"></i> 대표이사 이재혁 | <i class="fa fa-building-o"></i> 사업자등록번호 : 123-10-92344<br>
			   <br>
			  <i class="fa fa-phone"></i> TEL : 043-003-2034 | <i
					class="fa fa-phone-square"></i> FAX : 042-394-2929 </p>
			         </div>
			<a id="top" href="#" title="top"> <SPAN><i
				class="fa fa-angle-double-up"></i> TOP</SPAN> </a>
			</footer>
			</body>
			</html>