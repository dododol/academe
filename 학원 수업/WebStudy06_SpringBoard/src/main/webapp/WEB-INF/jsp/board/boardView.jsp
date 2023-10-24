<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>	
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<table class="table table-bordered">
	<tr>
		<th><label for="boNo"><spring:message code="board.boNo" /></label></th>
		<td>${board.boNo }</td>
	</tr>
	<tr>
		<th><label for="boTitle"><spring:message code="board.boTitle" /></label></th>
		<td>${board.boTitle }</td>
	</tr>
	<tr>
		<th><label for="boWriter"><spring:message code="board.boWriter" /></label></th>
		<td>${board.boWriter }</td>
	</tr>
	<tr>
		<th><label for="boIp"><spring:message code="board.boIp" /></label></th>
		<td>${board.boIp }</td>
	</tr>
	<tr>
		<th><label for="boMail"><spring:message code="board.boMail" /></label></th>
		<td>${board.boMail }</td>
	</tr>
	<tr>
		<th><label for="boPass"><spring:message code="board.boPass" /></label></th>
		<td>${board.boPass }</td>
	</tr>
	<tr>
		<th><label for="bofile"><spring:message code="board.bofile" /></label></th>
		<td>
			<c:if test="${not empty board.attatchList }">
				<c:forEach items="${board.attatchList }" var="atch">
					<c:url value="/board/${boNo }/boFile/${atch.attNo }" var="downloadUrl" />
					<a href="${downloadUrl }" 
						title="${atch.attFancysize },${atch.attDownload }명 다운">
						${atch.attFilename }
					</a>
				</c:forEach>
			</c:if>
		</td>
	</tr>
	<tr>
		<th><label for="boContent"><spring:message code="board.boContent" /></label></th>
		<td>${board.boContent }</td>
	</tr>
	<tr>
		<th><label for="boDate"><spring:message code="board.boDate" /></label></th>
		<td>${board.boDate }</td>
	</tr>
	<tr>
		<th><label for="boHit"><spring:message code="board.boHit" /></label></th>
		<td>${board.boHit }</td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="<c:url value='/board/${boNo}/edit' />" class="btn btn-warning">글수정</a>
			<a href="javascript:;" onclick="deleteFunction();" class="btn btn-danger">글삭제</a>
		</td>
	</tr>
</table>
<form id="deleteForm" method="post" action="<c:url value='/board/${boNo }' />">
	<input type="text" name="_method" value="delete">
	<input type="password" name="boPass" />
	<security:csrfInput/>
</form>
<script>
	function deleteFunction(){
		let password = prompt("비밀번호 입력 : ");
		if(password){
			deleteForm.boPass.value = password;
			deleteForm.requestSubmit();
		}
	}
</script>