<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>sign</title>
<link href="../resources/css/sign.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../resources/js/jquery-3.7.0.min.js"></script>
<link rel="shortcut icon" href="../resources/images/미니.png">
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
function sample6_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
            
            } 
 

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample6_postcode').value = data.zonecode;
            document.getElementById("sample6_address").value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("sample6_detailAddress").focus();
        }
    }).open();
}
$(function(){
	 // 아이디 중복검사 이벤트 
	$('#checkid').on('click',function(){
		 // 입력한 id값을 가져온다
		 var inputId = $('#id').val().trim();
		 
		 // 입력 했는지 안했는지 비교
		 if(inputId.length < 1){
			 alert("id를 입력하세요");
			 return false;
		 }
		 
		 // 규칙 문자 만들기
		 idreg = /^[a-zA-Z0-9]{4,8}$/			// 영문, 숫자로 시작하는 4자리~8자리
		 
		 // 규칙과 입력 문자가 맞지 않았다
		 if(!(idreg.test(inputId))){
			 alert("영문, 숫자로 시작하는 4~8자리 입력하세요")
			 return false;
		 } 
		 
		 $.ajax({
			 url : "<%=request.getContextPath()%>/selectById.do",
				type : 'get',
				data : {
					"id" : inputId
				},
				dataType : 'json',
				success : function(res) {
					//		 alert("중복된 ID 입니다.");
					$('#spanid').html(res.sw).css('color', 'red');
				},
				error : function(xhr) {
					alert("상태 : " + xhr.status)
				}
			});
		});

		$('#checkpw').on('click', function() {
			var inputPW = $('#pw').val().trim();
			var inputPWW = $('#pww').val().trim();

			// 입력 했는지 안했는지 비교
			if (inputPW.length < 1) {
				alert("PW를 입력하세요");
				return false;
			}

			// 입력 했는지 안했는지 비교
			if (inputPWW.length < 1) {
				alert("PW를 입력하세요");
				return false;
			}

			// 규칙 문자 만들기
			idreg = /^[a-zA-Z0-9]{4,8}$/ // 영문, 숫자로 시작하는 4자리~8자리

			// 규칙과 입력 문자가 맞지 않았다
			if (!(idreg.test(inputPW))) {
				alert("영문, 숫자로 시작하는 4~8자리 입력하세요")
				return false;
			}

			// 규칙과 입력 문자가 맞지 않았다
			if (!(idreg.test(inputPWW))) {
				alert("영문, 숫자로 시작하는 4~8자리 입력하세요")
				return false;
			}

			code = "";
			if (inputPW == inputPWW) {
				code = alert("비밀번호가 일치합니다.")
			} else {
				code = alert("비밀번호가 일치하지 않습니다.")
			}

		})
	})
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
		HttpSession sessionLog = request.getSession();

	LoginVO loginId = (LoginVO) sessionLog.getAttribute("loginSign");

	int insertMem = (Integer) sessionLog.getAttribute("insertMember");

	//String id = (String)sessionLog.getAttribute("selectById");
	%>
	<header>
		<a id="imga" href="main.jsp"><img
			src="../resources/images/타이틀.png"></a>
		<div id="log1">
			<ul>
				<li class="log"><a href="sign.jsp" id="ma">로그인/회원가입</a></li>
				<li class="log"><a href="mypage.jsp" id="ma">마이페이지<i
						class="fa fa-user"></i></a></li>
			</ul>
		</div>
	</header>
	<div>
		<nav id="hed">
			<div class="main">
				<ul>
					<li></i><a href="#" id="ma">UNDER DOGS</a>
						<div class="an2">
							<ul id="an">
								<li><a href="구단소개.html" id="ma2">구단소개</a></li>
								<li><a href="히스토리.html">Histroy</a></li>
								<li><a href="언더독스파크.html">언더독스 파크</a></li>
							</ul>
						</div></li>
					<li><a href="#" id="ma">PLAYERS</a>
						<div class="an2">
							<ul id="an">
								<li><a href="#">감독</a></li>
								<li><a href="#">코치</a></li>
								<li><a href="#">투수</a></li>
								<li><a href="#">포수</a></li>
								<li><a href="#">내야수</a></li>
								<li><a href="#">외야수</a></li>
								<li><a href="#">응원단</a></li>
								<li><a href="#">STAFF</a></li>
							</ul>
						</div></li>
					<li><a href="#" id="ma">FAN</a>
						<div class="an2">
							<ul id="an">
								<li><a href="#">구단소식</a></li>
								<li><a href="#">팬게시판</a></li>
								<li><a href="#">문의사항</a></li>
							</ul>
						</div></li>
					<li><a href="#" id="ma">GAME</a></li>
					<li><a href="#" id="ma">TICKET</a></li>
					<li><a href="#" id="ma">LIVE GAME</a></li>
				</ul>
			</div>
		</nav>
		<section>
			<div class="login-wrap">
				<div class="login-html">
					<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
						for="tab-1" class="tab">로그인</label> <input id="tab-2" type="radio"
						name="tab" class="sign-up"><label for="tab-2" class="tab">회원가입</label>
					<div class="login-form">
						<div class="sign-in-htm">
							<%
								if (loginId != null) {
							%>
							<form action="<%=request.getContextPath()%>/loginSign.do"
								method="post">
								<div class="group">
									<label for="user" class="label">아이디</label> <input id="user"
										type="text" class="input" name="userid"
										placeholder="ID를 입력하세요">
								</div>
								<div class="group">
									<label for="pass" class="label">비밀번호</label> <input id="pass"
										type="password" class="input" data-type="password"
										name="userpass" placeholder="PW 입력하세요">
								</div>
								<div class="group">
									<input type="submit" class="button" value="로그인">
								</div>
							</form>

							<%
								} else {
							%>
							<form action="<%=request.getContextPath()%>/loginSign.do"
								method="post">
								<div class="group">
									<label for="user" class="label">아이디</label> <input id="user"
										type="text" class="input" name="userid"
										placeholder="ID를 입력하세요">
								</div>
								<div class="group">
									<label for="pass" class="label">비밀번호</label> <input id="pass"
										type="password" class="input" data-type="password"
										name="userpass" placeholder="PW 입력하세요">
								</div>
								<div class="group">
									<input type="submit" class="button" value="로그인">
								</div>
							</form>
							<%
								}
							%>

							<div class="hr"></div>
							<div class="foot-lnk">
								<a href="#forgot">ID/PASSWORD 찾기</a>
							</div>
						</div>
						<form action="<%=request.getContextPath()%>/insertMember.do"
							method="post">
							<div class="sign-up-htm">

								<div class="group">
									<label for="user" class="label">아이디</label> <input id="id"
										type="text" class="input" placeholder="영문, 숫자로 시작하는 4-8글자를 입력"
										name="userID"> <input type="button" id="checkid"
										value="중복확인" class="btn btn-secondary btn-sm"> <span
										id="spanid"></span>
								</div>
								<div class="group">
									<label for="pass" class="label">비밀번호</label> <input id="pw"
										type="password" class="input" name="userPW"
										data-type="password" placeholder="영문, 숫자로 시작하는 4-8글자를 입력">
								</div>
								<div class="group">

									<label for="pass" class="label">비밀번호 확인</label> <input id="pww"
										type="password" class="input" name="userPWW"
										data-type="password" placeholder="영문, 숫자로 시작하는 4-8글자를 입력">
									<input type="button" id="checkpw" value="비밀번호확인"
										class="btn btn-secondary btn-sm"> <span id="spanpw"></span>
								</div>
								<div class="group">
									<label for="pass" class="label">이름</label> <input id="name"
										type="text" class="input" name="userNAME" placeholder="이름 입력">
								</div>
								<div class="group">
									<label for="pass" class="label">주민등록번호</label> <input id="num"
										type="text" class="input" name="userNUM"
										placeholder="-포함해서 입력">
								</div>
								<div class="group">
									<label for="pass" class="label">이메일</label> <input id="mail"
										type="text" class="input" name="userMAIL"
										placeholder="@포함해서 입력">
								</div>
								<div class="group">
									<label for="pass" class="label">연락처</label> <input id="tel"
										type="text" class="input" name="userTEL"
										placeholder="-포함해서 입력">
								</div>
								<div class="group">
									<input type="button" onclick="sample6_execDaumPostcode()"
										value="우편번호 찾기" id="searchpost"
										class="btn btn-secondary btn-sm" ><br> <label
										for="pass" class="label">우편번호</label> <input
										id="sample6_postcode" type="text" class="input"
										placeholder="우편번호" name="userADDRNUM"><br> <input
										type="text" class="input" id="sample6_address"
										placeholder="주소" name="userADDR1"><br> <input type="text"
										class="input" id="sample6_detailAddress" placeholder="상세주소" name="userADDR2"><br>

								</div>

								<div class="group">
									<input type="submit" class="button" value="회원가입"> <span
										id="joinspan"></span>
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
				<br> <i class="fa fa-building"></i> 대전광역시 중구 계룡로 846, 3층 | <i
					class="fa fa-user"></i> 대표이사 이재혁 | <i class="fa fa-building-o"></i>
				사업자등록번호 : 123-10-92344<br> <br> <i class="fa fa-phone"></i>
				TEL : 043-003-2034 | <i class="fa fa-phone-square"></i> FAX :
				042-394-2929
			</p>
		</div>
		<a id="top" href="#" title="top"> <SPAN><i
				class="fa fa-angle-double-up"></i> TOP</SPAN>
		</a>
	</footer>
</body>
</html>

