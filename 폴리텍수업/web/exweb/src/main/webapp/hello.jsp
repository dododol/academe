<%@page import="com.exam.myapp.member.MemberVo"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- JSP주석 --%>
<!-- HTML 주석 (웹사이트에서 비밀번호 다 보임.) -->
<%-- JSP 구성요소
	- 디렉티브 : <%@ 디렉티브명 속성명="속성값" %>
		page(현재JSP파일에대한설정), include(다른JSP파일포함), taglib
	- 스크립트요소
		스크립트릿 : <% 서블릿의service메서드내부에들어갈자바코드 %>
			JSP 파일을 실행할 때마다 한번씩 반복 실행할 자바 코드
		선언부 : <%! 서블릿의service메서드외부에들어갈자바코드 %>
			JSP 파일 최초 실행시, 한번만 실행할 자바 코드
		표현식 : <%= 실행결과를 현재위치에 출력할 자바코드%>
			if, for등 복잡한 자바구문은 사용할 수 없고, 
			하나의 값으로 평가되는 자바표현식만 사용가능
		주석 
	- 액션태그 : <jsp:액션명></jsp:액션명>
		자주 사용하는 자바코드를 대체하는 태그
	- EL (Expression Language) : ${자바코드}
		표현식과 유사한 역할
	- 커스텀태그 : 자바코드를 대체하는 태그를 직접 정의하여 사용
		JSTL(JSP Standard Tag Library) : 일반적으로 자주 사용하는
			자바코드를 커스텀 태그로 구현하여 제공하는 라이브러리
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELLO</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h2>스크립트요소</h2>
	<%
// 		JSP기본객체 : 스크립트릿에서 별도의 변수선언 없이 사용가능한 객체들
// 		request(요청객체), response(응답객체), session(세션객체), application(서블릿컨텍스트객체)
// 		out(응답객체의출력스트림),  config(ServletConfig객체)
// 		pageContext(현재 JSP파일에대한 모든 정보를 저장한 객체)
// 		page(현재JSP), exception(발생한예외)
		out.print( session == request.getSession());
		out.print( application == getServletContext());
		out.print( config == getServletConfig());
		//pageContext에는 현재 JSP파일 내에서만 사용가능한 데이터 저장
		pageContext.setAttribute("pa","pv");
		out.print( pageContext.getAttribute("pa") );
		//pageContext에는 다른 JSP기본객체들이 저장되어 있음
		out.print( request == pageContext.getRequest());
		out.print( response == pageContext.getResponse());
		out.print( session == pageContext.getSession());
		out.print( application == pageContext.getServletContext());
	%>
	<br>
	<%! int global = 0; //전역변수(필드,멤버변수)%>
	<% int local = 0; //지역변수%>
	<% global++; local++; %>
	global : <% out.print(global); %> <%=global %> <br>
	local : <% out.print(local); %> <%=local %> <br>
	<h2>EL</h2>
	${123}, ${"문자열1"}, ${"문자열2"}, ${true}, ${false}, ${3+4} <br>
	<%
		pageContext.setAttribute("pa", 12);
		request.setAttribute("ra", 34);
		session.setAttribute("sa", 56);
		application.setAttribute("aa", 78);
	%>
	EL에서 xxx객체에 저장한 속성값을 xxxScope.속성명으로 읽기 가능 <br>
	xxxScope을 생략하고 속성명만 사용하면,
	pageScope > requestScope > sessionScope > applicationScope 순서대로
	<%=pageContext.getAttribute("pa") %>,${pageScope.pa},${pageScope["pa"]},${pa} <br>
	<%=request.getAttribute("ra") %> ${requestScope.ra},${requestScope["ra"]},${ra}<br>
	<%=session.getAttribute("sa") %> ${sessionScope.sa},${sessionScope["sa"]},${sa}<br>
	<%=application.getAttribute("aa") %> ${applicationScope.aa},${applicationScope["aa"]},${aa}<br>
	EL에서 xxx라고 쓰면, xxx는 자바 변수이름이 아니라,
	pageContext, request, session, application(ServletContext)에
	저장한 속성이름 <br>
	EL에서 null값은 오류를 발생시키지 않고, 아무런 출력도 하지 않음 : 
	${foo}, ${foo.equals("bar")},
<%-- <%=foo%> --%>
	<%=pageContext.getAttribute("foo") %>
<%-- 	<%=pageContext.getAttribute("foo").equals("bar") %> --%>
	<br>
	<%
		String s ="야채피자";
		pageContext.setAttribute("ps", s);
		int[] arr = {3,6,9};
		pageContext.setAttribute("pa", arr);
		ArrayList list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(9);
		pageContext.setAttribute("pl", list);
		HashMap map = new HashMap();
		map.put("k1", "v1");
		map.put("k2", "v2");
		pageContext.setAttribute("pm", map);
		MemberVo vo = new MemberVo();
		vo.setMemId("a001");
		pageContext.setAttribute("pv", vo);
	%>
	<%=s %>, ${ps } <br>
	배열 arr의 1번칸의 값 : <%=arr[1] %>, ${pa[1]} <br>
	리스트 list의 1번칸의 값 : <%=list.get(1) %>, ${pl.get(1)}, ${pl[1]}<br>
	맵 map에 "k2"라는 이름으로 저장된 값 : <%=map.get("k2") %>, ${pm.get("k2")}, ${pm.k2}, ${pm["k2"]}<br>
	객체 vo의 getXxx() 속성값 : <%=vo.getMemId() %>, ${pv.getMemId()}, ${pv.memId}, ${pv["memId"]} <br>
	EL기본객체<br>
	파라미터값 : <%=request.getParameter("x") %>, ${param.x}, ${param["x"]} <br>
<%-- 	파라미터값이 2개 이상 : <%=request.getParameterValues("x")[0] %>, ${paramValues.x[0]}, ${paramValues["x"][0]} <br> --%>
	요청헤더값 : <%=request.getHeader("Host")%>, ${header.Host}, ${header["Host"]} <br>
	요청헤더값 : <%=request.getHeader("User-Agent")%>, ${header["User-Agent"]} <br>
	요청헤더값이 2개이상 : headerValues.요청헤더이름 사용
	쿠키값 : <%=request.getCookies()[0].getName() %>,
		<%=request.getCookies()[0].getValue() %>,
		${cookie.JSESSIONID.name}, ${cookie.JSESSIONID.value},
		${cookie["JSESSIONID"].name}, ${cookie["JSESSIONID"].value} <br>
	서블릿컨텍스트 초기화파라미터값 : 
		<%=application.getInitParameter("cn") %>, 
		${initParam.cn}, ${initParam["cn"]} <br>
	EL에서 JSP기본객체를 사용하고 싶은 경우,
		pageContext에서 꺼내어 사용
		<%=request.getContextPath()%>, 
		${pageContext.getRequest().getContextPath()},
		${pageContext.request.contextPath}<br>
</body>
</html>











