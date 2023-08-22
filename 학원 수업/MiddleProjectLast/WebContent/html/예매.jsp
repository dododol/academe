<%@page import="kr.or.ddit.middle.vo.MatchVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>예매</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/예매.css">
	<link rel="shortcut icon" href="<%=request.getContextPath() %>/resources/images/미니.png">
</head>

<body>
<% 
List<MatchVO> list = (List<MatchVO>)request.getAttribute("matchList");


%>
<div class="upnav">
<img src="<%=request.getContextPath() %>/resources/images/로고.png">
<ul class="snip1143">
         <li><a href="<%=request.getContextPath() %>/ticket.do" data-hover="예매하기">예매하기</a></li>
         <li><a href="<%=request.getContextPath() %>/ticketCheck.do" data-hover="예매내역 확인/취소">예매내역 확인/취소</a></li>
</ul>
	</div>
<form class="first" method="get" action="<%=request.getContextPath() %>/">
<table>
<thead>
<tr id="thtr">
<th id="th1">경기일시</th>
<th id="th2">경기명</th>
<th id="th3">경기장</th>
<th id="th4">티켓예매</th>
</tr>	
</thead>

<% 
for(MatchVO vo : list){
%>	
	<tbody>
		<tr id="1st">
		<td id="gamedate"><div id="gdate1"><%=vo.getM_date() %></div>
		     <div id="gdate2">(<%=vo.getM_day() %>)<%=vo.getM_time() %></div></td>
		<td id="gamename"><div id="logo1"><img src="<%=request.getContextPath()%>/resources/images/로고.png"></div><span id="verse">VS</span><div id="logo2"><img src="<%=request.getContextPath()%>/<%=vo.getA_image()%>"></div> 
			<div id="hometeam">DDIT 언더독스</div> <span id="verse2">VS</span> <div id="awayteam"><%=vo.getA_name() %></div></td>
		<td id="gameplace"><div id="placename">언더독스 파크</div></td>
		<td id="tiketbutton"><input type="submit" id="tiketgo" value="예매하기"></td>
		</tr>
		
	
	</tbody>
	
<%	
}
%>
	
	
</table>	
</form>
</body>
</html>
