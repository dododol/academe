<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/js/bootstrap-5.3.2-dist/css/bootstrap.min.css">
    
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery.serializejson.js"></script>

<c:if test="${not empty message }">
	<script>
		alert("${message}");
	</script>
</c:if> 