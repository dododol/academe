<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<style>
table {
	text-align: center;
}
</style>

<p>강의리스트</p>

<c:set var="proName" value="${list[0].proName}" />

<h4>${proName}교수 강의리스트</h4>

<table class="table table-bordered">
<thead>
    <tr>
        <th>개설코드</th>
        <th>강의코드</th>
        <th>강의이름</th>
        <th>강의요일</th>
        <th>강의시간</th>
        <th>강의실</th>
        <th>수강정원</th>
        <th>학점</th>
        <th>성적관리</th>
    </tr>
</thead>
<tbody>
    <c:if test="${empty list}">
        <tr>
            <td colspan="9">강의목록이 비어있습니다.</td>
        </tr>
    </c:if>
    <c:if test="${not empty list}">
        <c:forEach items="${list}" var="lecture">
            <tr>
                <td>${lecture.lecCd }</td>
                <td>${lecture.subCd }</td>
                <td>${lecture.subName }</td>
                <td>
                    <c:choose>
                        <c:when test="${lecture.lecWeek == 1}">월</c:when>
                        <c:when test="${lecture.lecWeek == 2}">화</c:when>
                        <c:when test="${lecture.lecWeek == 3}">수</c:when>
                        <c:when test="${lecture.lecWeek == 4}">목</c:when>
                        <c:when test="${lecture.lecWeek == 5}">금</c:when>
                    </c:choose>
                </td>
                <td>
                ${lecture.lecTime }
                </td>
                <td>${lecture.lecRoom }</td>
                <td>${lecture.lecPerson }</td>
                <td>${lecture.subGrade }</td>
                <td>
                	<a href="${pageContext.request.contextPath}/stuList?lecCd=${lecture.lecCd}" class="btn btn-primary">수강생조회</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
</tbody>
</table>

