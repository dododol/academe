<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
table {
    text-align: center;
}
</style>

<p>성적관리</p>

<c:set var="subName" value="${list[0].subName}" />
<h4>수강생 리스트 | ${subName}</h4>

<table class="table table-bordered">
    <thead>
        <tr>
            <th>학번</th>
            <th>학생이름</th>
            <th>총점</th>
            <th>학점</th>
        </tr>
    </thead>
    <tbody>
        <c:if test="${empty list}">
            <tr>
                <td colspan="5">수강학생이 없습니다.</td>
            </tr>
        </c:if>
        <c:if test="${not empty list}">
            <c:forEach items="${list}" var="student">
                <tr>
                    <td>${student.stdNo}</td>
                    <td>${student.stdName}</td>
                    <td>
<%--                         <c:choose> --%>
<%--                             <c:when test="${student.clsScore == 0}"> --%>
<!--                                 미등록 -->
<%--                             </c:when> --%>
<%--                             <c:otherwise> --%>
<%--                                 <span id="score_${student.stdNo}">${student.clsScore}</span> --%>
<%--                             </c:otherwise> --%>
<%--                         </c:choose> --%>
						<input type="number" value="${student.clsScore }">
						<input type="button" id="updateBtn" value="등록">
                    </td>
                    <td>
                        <c:choose>
                            <c:when test="${student.clsScore == 0}">
                                -
                            </c:when>
                            <c:otherwise>
                                <c:out value="${student.clsScore >= 96 ? 'A+' :
                                    student.clsScore >= 90 ? 'A0' :
                                    student.clsScore >= 85 ? 'B+' :
                                    student.clsScore >= 80 ? 'B0' :
                                    student.clsScore >= 75 ? 'C+' :
                                    student.clsScore >= 70 ? 'C0' :
                                    student.clsScore >= 65 ? 'D+' :
                                    student.clsScore >= 60 ? 'D0' : 'F'}" />
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
    </tbody>
</table>
