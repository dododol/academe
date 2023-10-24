<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
    
    <h4>주옹이네</h4>
    
    <security:authorize access="isAuthenticated()">
    	<security:authentication property="Principal" var="authMember"/>
    	${authMember } 
    </security:authorize>