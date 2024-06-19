<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
<table>
<tr>
<th>제목</th>
<td>${result.crudSj }</td>
</tr>
<tr>
<th>작성자</th>
<td>${result.userNm }</td>
</tr>
<tr>
<th>작성일</th>
<td>${result.frstRegistPnttm }</td>
</tr>
<tr>
<th>내용</th>
<td>${result.crudCn }</td>
</tr>
</table>
<div class="box-btn">
	<c:url var="uptUrl" value="/letcrud/letcrudRegist.do">
		<c:param name="crudId" value="${result.crudId}" />
	</c:url>
	<a href="${uptUrl}">수정</a>
	
	<c:url var="delUrl" value="/letcrud/delete.do">
		<c:param name="crudId" value="${result.crudId}" />
	</c:url>
	<a href="${delUrl}" class="btn-del">삭제</a>
	
	<a href="/letcrud/selectList.do">목록</a>
</div>
<script>
$(document).ready(function(){
	$(".btn-del").click(function(){
		if(!confirm("삭제하시겠습니까?")){
			return false;
		}
	});
});
</script>
</body>
</html>