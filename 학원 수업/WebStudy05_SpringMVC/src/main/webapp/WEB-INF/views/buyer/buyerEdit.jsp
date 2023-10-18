<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<form action="<c:url value='/buyer/P10101' />" method="post">

	<input type="text" name="_method" value="put" />
	
	<input type="submit" value="PUT 요청 전송" />
</form>