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
</head>
<body>

<c:set var="step" value="${param.step }" />
<c:if test="${empty step }">
	<c:set var="step" value="2" />
</c:if>

<ul>
	<c:choose>
		<c:when test="${step eq '1'}">
			<li>
				<h3>c:out Tag : &#60;% = ... %&#62;과 유사한 표현식</h3>
				<h4>기본문법 : &#60;c:out value="값"/&#62;</h4>
				
				JSP 1번 : <% out.print("hello~"); %> <br/>
				JSP 2번 : <% String a = "hello~"; %>
						<%=a %> <br/>
				JSTL : <c:out value="hello~" /> <br/>
			</li>
		</c:when>
		<c:when test="${step eq '2'}">
			<li>
				<h3>c:import Tag : jsp 'include'와 유사. 서버 내부 또는 서버 외부의 모든 자원 컨텐츠를 포함하는 추가 기능이 있음</h3>
				<h4>기본문법 : &#60;c:import url="URL주소 값" charEncoding="utf-8"/&#62;</h4>
				
				<c:import url="/temp/jstlImport.do" charEncoding="utf-8" />
				 <c:import url="/temp/selectList.do" charEncoding="utf-8" /> 
			</li>
		</c:when>
		
	</c:choose>
</ul>

</body>
</html>









