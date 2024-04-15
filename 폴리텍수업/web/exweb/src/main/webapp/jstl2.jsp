<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL</h1>
	<h2>국제화/포맷팅</h2>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<h3>자바 날짜시간 객체와 문자열 상호변환</h3>
	<% pageContext.setAttribute("d", new Date() ); %>
	현재시간 : ${d}
	<fmt:formatDate value="${d}" pattern="yyyy/MM/dd HH:mm:ss "/> <br>
	<fmt:formatDate value="${d}" pattern="yyyy/MM/dd HH시 mm분 ss초"/> <br>
<!-- 	value에 지정한 Date객체를 pattern에 지정한 형식의 문자열로 변환 -->
<!-- 	pattern 값은 자바의 SimpleDateFormat 클래스의 패턴과 동일 -->
	<fmt:parseDate value="2024/01/02 13:24:56" pattern="yyyy/MM/dd HH:mm:ss" var="d2" />
<!-- value에 지정한 문자열을 pattern에 지정한 형식으로 해석하여 Date객체로 변환 -->
	${d2} <br>
	
	<fmt:formatDate value="${d}" dateStyle="full" timeStyle="full" type="both"/> <br>
<!-- 	type 속성에 date, time, both 사용가능 -->
<!-- 	dateStyle,timeStyle 속성에 default, short, medium, long, full 사용가능 -->

	<fmt:setTimeZone value="GMT-5" />
<!-- 이후의 모든 formatDate,parseDate 태그들이 사용할 기본시간대 지정 -->
	<fmt:formatDate value="${d}" pattern="yyyy/MM/dd HH:mm:ss "/> <br>
<!-- 시간대는 자바의 TimeZone 클래스가 지원하는 "대륙/도시" 문자열 또는 -->
<!-- GMT+9 와 같은 커스텀 문자열 사용 가능	 -->

	<fmt:setTimeZone value="GMT+5" var="z" scope="page" />
	<fmt:formatDate value="${d}" pattern="yyyy/MM/dd HH:mm:ss "/> <br>
	<fmt:formatDate timeZone="${z}" value="${d}" pattern="yyyy/MM/dd HH:mm:ss "/> <br>
	
	<fmt:timeZone value="GMT+0">
		<!-- timeZone 캐그 내부에만 적용할 시간대 설정 -->
		<fmt:formatDate value="${d}" pattern="yyyy/MM/dd HH:mm:ss "/> <br>	
	</fmt:timeZone>
	
	<h3>숫자와 문자열의 상호변환</h3>
	<% pageContext.setAttribute("n", 12345.67); %>
	${n} <br>
	<!-- 숫자를 문자열로 변환 -->
	<fmt:formatNumber value="${n}" pattern="###,###.###" /> <br>
	<fmt:formatNumber value="${n}" pattern="000,000.000" /> <br>
	<fmt:formatNumber value="${n}" pattern="#,###.#" /> <br>
	<fmt:formatNumber value="${n}" pattern="0,000.0" /> <br>
	<fmt:formatNumber value="${n}" type="number" /> <br>
	<fmt:formatNumber value="${n}" type="percent" /> <br>
	<fmt:formatNumber value="${n}" type="currency"  /> <br>
	<!-- 문자열을 숫자로 변환 -->
	<fmt:parseNumber value="12,345.67" pattern="###,###.###" var="n2" />
	${n2}<br>
	
	<h3>JSTL 국제화 태그들이 사용할 로케일 지정</h3>
<%-- 	<fmt:setLocale value="en_US" /> --%>
	로케일은 "언어_국가", "언어-국가", "언어", "국가" 형태로 지정
	언어는 ISO 639-1, 국가는 ISO 3166-1 alpha-2 에 지정된 코드 사용
	자바의 Locale 클래스와 설정 방식 동일
	로케일 미지정시, Accept-Language 요청헤더 값 사용
	<fmt:formatNumber value="${n}" type="currency"  /> <br>
	
	<h3>프로퍼티 파일에 저장되어 있는 값을 출력</h3>
	<fmt:setBundle basename="msg" />
<!-- 	이후에 나오는 message 태그들이 사용할 메시지 번들을 설정 -->
<!-- 	프로퍼티 파일이 "클래스패스/폴더명/번들명_언어_국가.properties"이면 -->
<!-- 	basename에 "폴더명.번들명"라고 지정 -->
	<fmt:message key="str" />
	
</body>
</html>















