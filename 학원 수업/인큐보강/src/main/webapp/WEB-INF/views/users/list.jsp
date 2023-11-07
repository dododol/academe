<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 상태</title>
</head>
<body>
<!-- p.98 -->
	<h1>회원 상태</h1>
	<p>
		<!-- action속성 및 값이 생략 시, 현재 URI(/list)를 재요청. 
		method는 GET(form 태그의 기본 HTTP 메소드는 GET임) -->
		<form>
			<input type="text" placeholder="검색어를 입력하세요" name="keyword"
				value="${keyword}" />
			<input type="submit" value="검색" />
		</form>
	</p>
	<table border="1">
		<thead>
			<tr>
				<th>사용자</th>
				<th>비밀번호</th>
				<th>상태</th>
			</tr>
		</thead>
		<tbody>
		<!-- 
		forEach 태그? 배열(String[], int[][]), Collection(List, Set) 또는 
		Map(HashTable, HashMap, SortedMap)에 저장되어 있는 값들을 
		순차적으로 처리할 때 사용함. 자바의 for, do~while을 대신해서 사용함
		var : 변수
		items : 아이템(배열, Collection, Map)
		varStatus : 루프 정보를 담은 객체 활용
			- index : 루프 실행 시 현재 인덱스(0부터 시작)
			- count : 실행 회수(1부터 시작. 보통 행번호 출력)
		 -->
		 <!-- data : mav.addObject("data", data); 
		 			list<MembersVO>
		 -->
		 <!-- row : usersVO 1행 -->
		<c:forEach var="usersVO" items="${data}" varStatus="stat">
			<tr>
				<td>${stat.count}</td>
				<td><a href="/users/detail?username=${usersVO.username}">${usersVO.username}</a></td>
				<td>${usersVO.password}</td>
				<td>${usersVO.enabled}></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<p>
		<a href="/users/create">회원 등록</a>
	</p>
</body>
</html>







