<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<table class="table table-border">

		<thead>
			<tr>
				<th>회원명</th>
				<th>휴대폰</th>
				<th>이메일</th>
				<th>생일</th>
				<th>거주지역</th>
				<th>마일리지</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty memberList }">
				<tr>
					<td colspan="5">데이터 없음</td>
				</tr>
			</c:if>
			<c:if test="${not empty memberList }">
				<c:forEach items="${memberList }" var="member">
					<tr data-mem-id = "${member.memId}">
						<td>${member.memName}[${member.prodCount}]</td>
						<td>${member.memHp}</td>
						<td>${member.memMail}</td>
						<td>${member.memBir}</td>
						<td>${member.memAdd1}</td>
						<td>${member.memMileage}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
