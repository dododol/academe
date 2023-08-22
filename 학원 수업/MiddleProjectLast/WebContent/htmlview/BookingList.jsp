<%@page import="kr.or.ddit.middle.vo.BookingVO"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//서블릿에서 저장한 데이터 꺼내기
	
	List<BookingVO> bookingList = (List<BookingVO>)request.getAttribute("allPrice");
	Gson gson = new Gson();
	
	String result = gson.toJson(bookingList);
	
	response.setContentType("application/json; charset=utf-8");
	out.print(result);
	out.flush();
%>