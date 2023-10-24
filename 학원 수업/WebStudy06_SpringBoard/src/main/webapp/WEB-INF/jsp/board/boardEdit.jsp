<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>	
<script src="<c:url value='/resources/js/ckeditor/ckeditor.js' />"></script>

<form:form modelAttribute="targetBoard" method="post" enctype="multipart/form-data">
<input type="hidden" name="_method" value="put">
<table class="table table-bordered">
	<tr>
		<th><label for="boTitle"><spring:message code="board.boTitle" /></label></th>
		<td>
			<form:input type="text" path="boTitle" class="form-control"
				 />
			<form:errors path="boTitle" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<th><label for="boWriter"><spring:message code="board.boWriter" /></label></th>
		<td>
			<form:input type="text" path="boWriter" class="form-control"
				 />
			<form:errors path="boWriter" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<th><label for="boIp"><spring:message code="board.boIp" /></label></th>
		<td>
			<input type="text" name="boIp" class="form-control" 
				value="${pageContext.request.remoteAddr }" readonly />
			<form:errors path="boIp" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<th><label for="boMail"><spring:message code="board.boMail" /></label></th>
		<td>
			<form:input type="email" path="boMail" class="form-control" />
			<form:errors path="boMail" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<th><label for="boPass"><spring:message code="board.boPass" /></label></th>
		<td>
			<input type="password" name="boPass" class="form-control" />
			<form:errors path="boPass" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<th><label for="bofile"><spring:message code="board.bofile" /></label></th>
		<td>
			<input type="file" name="boFile"/>
			<input type="file" name="boFile"/>
			<input type="file" name="boFile"/>
		</td>
	</tr>
	<tr>
		<th><label for="boContent"><spring:message code="board.boContent" /></label></th>
		<td>
			<form:textarea path="boContent" />
			<form:errors path="boContent" element="span" cssClass="error" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장" class="btn btn-primary" />
			<input type="reset" value="취소"  class="btn btn-warning"/>
		</td>
	</tr>
</table>
</form:form>
<script>
	CKEDITOR.replace("boContent", {
		filebrowserImageUploadUrl:"<c:url value='/board/image?type=image'/>"
	});
</script>









