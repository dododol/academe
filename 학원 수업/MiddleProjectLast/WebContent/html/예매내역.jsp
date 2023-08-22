<%@page import="kr.or.ddit.middle.controller.TicketCheck"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.middle.vo.TicketVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>예매내역</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/예매내역.css">
	<link rel="shortcut icon" href="<%=request.getContextPath() %>/resources/images/미니.png">
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-3.7.0.min.js"></script>

<!-- <script>
 $(function(){
	$(document).on("click","#tiketcancel",function(){
		result=$(this).confirm("예매 취소를 정말로 하시겠습니까?");

        if(result){
        	$(this).submit();
        }
	});<
 });
</script> -->
</head>
<%
	List<TicketVO> ticketList = (List<TicketVO>)request.getAttribute("getTicket");

%>
<body>
<div class="upnav">
<img src="<%=request.getContextPath() %>/resources/images/로고.png">
<ul class="snip1143">
    <li><a href="<%=request.getContextPath() %>/ticket.do" data-hover="예매하기">예매하기</a></li>
         <li><a href="<%=request.getContextPath() %>/ticketCheck.do" data-hover="예매내역 확인/취소">예매내역 확인/취소</a></li>
</ul>
	</div>
<table>
<thead>
<tr id="thtr">
<th id="th1">티켓번호</th>
<th id="th2">경기일시</th>
<th id="th3">예매내용(대결팀, 장소, 구간, 좌석번호, 총금액)</th>
<th id="th4">예매상태</th>
<th id="th5">예매취소</th>
</tr>	
</thead>
	<tbody>

	
<% 
    for (TicketVO ticket : ticketList) {
    	if(ticket.getB_stat().equals("완료")){
%>	
		
 <tr class="tiketlist">
        <td id="tiketnum"><div id="tnum" name="tnum"><%= ticket.getB_no()%></div></td>
        <td id="listgamedate"><div id="listgdate1"><%=ticket.getM_date().substring(0,11)%></div>
             <div id="listgdate2">18:30</div></td>
        <td id="listgamename">
            <div id="all">
                <div id="hometeam">DDIT 언더독스</div>
                <div id="verse">VS</div>
                <div id="awayteam"><%=ticket.getA_name() %></div>
                <div id="gameplase">언더독스 파크</div>
                <div id="section" name="section"><%=ticket.getS_section() %>-</div>
                <div id="num" name="num"><%=ticket.getB_seat() %>번</div>
                <div id="allpay"><%=ticket.getB_price() %>원</div>
            </div>
        </td>
        <td id="tiketsangte"><div id="sangte" name="sangte"><%=ticket.getB_stat()%></div></td>    
        <td id="cancel">
            <form method="get" action="<%=request.getContextPath()%>/cancelTicket.do">
                <input type="hidden" name="b_no" value="<%=ticket.getB_no()%>">
                <input type="submit" id="tiketcancel" value="취소하기">
            </form>
        </td>
<%
    	}else{
%>   	
	<tr class="tiketlist">
        <td id="tiketnum"><div id="tnum" name="tnum"><%= ticket.getB_no()%></div></td>
        <td id="listgamedate"><div id="listgdate1"><%=ticket.getM_date().substring(0,11)%></div>
             <div id="listgdate2">18:30</div></td>
        <td id="listgamename">
            <div id="all">
                <div id="hometeam">DDIT 언더독스</div>
                <div id="verse">VS</div>
                <div id="awayteam"><%=ticket.getA_name() %></div>
                <div id="gameplase">언더독스 파크</div>
                <div id="siteinfo"></div>
                <div id="allpay"><%=ticket.getB_price() %>원</div>
            </div>
        </td>
        <td id="tiketsangte"><div id="sangte" name="sangte"><%=ticket.getB_stat() %></div></td>    
        <td id="cancel">
            <form method="get" action="#">
                <input type="hidden" name="b_no" value="<%= ticket.getB_no() %>">
            </form>
        </td>
	<% 
    	}
}
%>		
	</tbody>
	
</table>	
</body>
</html>
