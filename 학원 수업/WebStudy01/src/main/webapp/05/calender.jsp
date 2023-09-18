<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력</title>
<style>
    body {
        text-align: center;
        margin: 20px;
    }
    
    h1 {
        color: #333;
    }
    
    h2 {
        margin-bottom: 10px;
        font-size: 24px; 
    }
    
    table {
        border-collapse: collapse;
        margin: 0 auto;
    }
    
    th, td {
        width: 40px; 
        height: 40px; 
        text-align: center;
        border: 1px solid #ccc;
    }
    
</style>
</head>
<body>
    <h1>달력</h1>
    
    <%
    int year = 0;
    int month = 0;

    String yearParam = request.getParameter("year");
    String monthParam = request.getParameter("month");

    if (yearParam != null && monthParam != null) {
        year = Integer.parseInt(yearParam);
        month = Integer.parseInt(monthParam);
    } else {
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR); 
        month = cal.get(Calendar.MONTH) + 1; 
    }
    %>

    <form action="calendar.jsp" method="GET">
        년도: <input type="number" name="year" value="<%= year %>">
        월: <input type="number" name="month" value="<%= month %>">
        <input type="submit" value="달력 보기">
    </form>
    
    <%
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, 1);

    int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

    out.println("<h2>" + year + "년 " + month + "월</h2>");
    out.println("<table>");
    out.println("<tr><th>일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th>토</th></tr>");

    out.println("<tr>");
    for (int i = 1; i < firstDayOfWeek; i++) {
        out.println("<td></td>");
    }

    for (int day = 1; day <= lastDayOfMonth; day++) {
        out.println("<td>" + day + "</td>");
        if ((firstDayOfWeek + day - 1) % 7 == 0) {
            out.println("</tr><tr>");
        }
    }

    int remainingDays = 7 - ((firstDayOfWeek + lastDayOfMonth - 1) % 7);
    for (int i = 0; i < remainingDays; i++) {
        out.println("<td></td>");
    }

    out.println("</tr>");
    out.println("</table>");
    %>

    <p class="month-links">
        <a href="?year=<%= (month == 1) ? year - 1 : year %>&month=<%= (month - 1 > 0) ? month - 1 : 12 %>">이전 달</a> |
        <a href="?year=<%= (month == 12) ? year + 1 : year %>&month=<%= (month + 1 <= 12) ? month + 1 : 1 %>">다음 달</a> 
    </p>
</body>
</html>