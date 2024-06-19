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
<link href="/css/common.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style>
		table{border-collapse: collapse;}
		th{font-weight: bold;}
		th, td{padding: 5px; border: 1px solid #000;}
	</style>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>관리</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="result" items="${resultList}">
			<tr>
				<td><c:out value="${result.crudId}"/></td>
				<td>
					<c:url var="viewUrl" value="/letcrud/select.do">
						<c:param name="crudId" value="${result.crudId}"/>
					</c:url>
					<a href="${viewUrl}"><c:out value="${result.crudSj}"/></a>
				</td>
				<td>${result.userNm}</td>
				<td>${result.frstRegistPnttm}</td>
				<td>
					<c:url var="delUrl" value="/letcrud/delete.do">
						<c:param name="crudId" value="${result.crudId}"/>
					</c:url>
					<a href="${delUrl}" class="btn-del">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<div id="paging_div">
	<ul class="paging_align">
		<c:url var="pageUrl" value="/letcrud/selectList.do?" />
		<c:set var="pagingParam"><c:out value="${pageUrl}"/></c:set>
		<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pagingParam}" />
	</ul>
</div>

<button type="button" id="btn-reg" data-href="/letcrud/letcrudRegist.do">등록하기</button>
<script>
$(document).ready(function(){
	$("#btn-reg").click(function(){
		location.href = $(this).data("href");
	});
	
	$(".btn-del").click(function(){
		if(!confirm("삭제하시겠습니까?")){
			return false;
		}
	});
});
</script>
</body>
</html>



















