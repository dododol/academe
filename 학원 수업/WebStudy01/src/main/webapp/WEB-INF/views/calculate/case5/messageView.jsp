<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   Map<String,String> errors = (Map)request.getAttribute("errors");
   if(errors!=null && !errors.isEmpty()){
      %>
      <div class="error"><%=errors %></div>
      <%
   }
%>