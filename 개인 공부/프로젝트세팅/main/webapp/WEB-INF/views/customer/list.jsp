<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div>
			<h3>고객 목록</h3>
		</div>
		
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>고객번호</th>
						<th>고객명</th>
						<th>주소</th>
						<th>전화번호</th>
						<th>관리</th>
					</tr>
				</thead>
				
				<tbody>
					<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">검색된 고객이 없습니다</td>
						</tr>
					</c:if>
					
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.custid}</td>
							<td>${item.name}</td>
							<td>${item.address}</td>
							<td>${item.phone}</td>
							<td>
								<a href="delete/${item.custid}">삭제</a>
								<a href="update/${item.custid}">변경</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<div><a href="add">등록</a></div>
			<div><a href="..">이전</a></div>
		</div>
	</div>
</body>
</html>