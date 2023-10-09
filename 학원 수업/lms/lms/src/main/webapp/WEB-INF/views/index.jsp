<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 컨텍스트패스 옆에 있는 서블릿명으로 서블릿 만든 후 컨트롤러에서 처리할거 처리하고
	WEB-INF/views/lms 안에 jsp파일 만들기 -->
<table border="1">
<tr><td>학생</td></tr>
<tr><td><a href="<%=request.getContextPath()%>/subject">수강신청</a></td></tr>
<tr><td><a href="<%=request.getContextPath()%>/grade">학점조회</a></td></tr>
<tr><td>교수</td></tr>
<tr><td><a href="<%=request.getContextPath()%>/class">강의조회</a></td></tr>
<tr><td><a href="<%=request.getContextPath()%>/myStudent">수강학생조회</a></td></tr>
<tr><td><a href="<%=request.getContextPath()%>/gradeInfo">학점관리</a></td></tr>
<tr><td>교직원</td></tr>
<tr><td><a href="<%=request.getContextPath()%>/professorInfo">교수정보관리</a></td></tr>
<tr><td><a href="<%=request.getContextPath()%>/studentInfo">학생정보관리</a></td></tr>
</table>
</body>
</html>