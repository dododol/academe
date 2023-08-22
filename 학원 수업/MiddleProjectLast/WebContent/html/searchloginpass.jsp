<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="../resources/css/searchpass.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath() %>/resources/js/jquery-3.7.0.min.js" type="text/javascript"></script>
<script>

</script>
<body>

<form action="<%=request.getContextPath()%>/mail.do">
<div class="all">
<div class="left">	
<p>비밀번호 찾기</p>
<br>
<input type="text" placeholder="ID를 입력하세요" id="userID" name="userID" class="user">	
<input type="text" placeholder="이름을 입력하세요" id="userNAME" name="userNAME" class="user">
<input type="text" placeholder="주민등록번호를 입력하세요 (-포함)" id="userNUM" name="userNUM" class="user">
<button type="submit" value="ID 찾기" id="idbt" class="btn-hover color-11">비밀번호찾기</button>
</div>
<div class="right">
<img src="../resources/images/로고.png" class="sajin">
<span class="title">비밀번호를<br>잊어버리셨습니까?</span><br>
<span class="bonmun">비밀번호는 회원가입시<br>입력하신 이메일로 발송됩니다.</span>	
</div>
</div>
</form>	
</body>
</html>