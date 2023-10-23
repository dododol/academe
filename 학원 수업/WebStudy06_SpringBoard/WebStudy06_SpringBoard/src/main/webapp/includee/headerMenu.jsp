<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap w-100 p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="<c:url value='/'/>">Company305</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <ul class="nav px-3 col">
    <li class="nav-item text-nowrap">
      <a class="nav-link text-white" href="<c:url value='/board' />">자유게시판</a>
    </li>
    <li class="nav-item text-nowrap">
      <a class="nav-link text-white" href="?lang=en">영문</a>
    </li>
    <li class="nav-item text-nowrap">
      <a class="nav-link text-white" href="?lang=ko">한글</a>
    </li>
  </ul>
</nav>