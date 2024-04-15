<%@page import="com.exam.myapp.member.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 연습</h1>
	<h2>CORE</h2>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!-- jstl core 태그 라이브러리의 태그들을 c: 접두어를 붙여서 사용 -->
	<h3>속성저장 및 삭제</h3>
	<%
		//아래 회원 객체의 포인트 값이 출력되도록 구현
// 		MemberVo v = new MemberVo();
// 		pageContext.setAttribute("vo", v);
// 		request
// 		session
// 		application
	%>
	<c:set scope="page" var="vo" value="<%=new MemberVo() %>"></c:set>
<!-- 	scope에 지정한 xxxScope에 
		var에 지정한 이름의 속성으로 value에 지정한 값을 저장 -->
	회원의 포인트 : <!-- ${vo.getMemPoint()} --> ${vo.memPoint}
	
	<c:set target="${vo}" property="memPoint" value="${123}" />
	<!-- target에 지정한 객체의 property에 지정한 이름의 속성에 -->
	<!-- value에 지정한 값을 저장 -->
	회원의 포인트 : ${vo.memPoint} <br> 
	
	<c:remove scope="page" var="vo"/>
	<!-- scope에 지정한 xxxScope에서
	 	var에 지정한 이름의 속성 값을 삭제 -->
	회원의 포인트 : ${vo.memPoint} <br> 

	<h3>조건문, 반복문</h3>
	<%
		int n = 123;
		//n값이 100보타 크면 "큰수" 출력
// 		if(n>100) {
// 			out.println("큰수");
// 		}
		
		//n값이 300보다 크면 "최우수", 200보타 크면 "우수",
		//200 이하면 "양호"라고 출력
// 		if(n>300) {
// 			out.println("최우수");
// 		}else if(n>200) {
// 			out.println("우수");
// 		}else {
// 			out.println("양호");
// 		}
	%>
	<c:set scope="page" var="no" value="${123}" />
	<c:if test="${no>100}">큰수</c:if>
	<!-- test에 지정한 값이 true인 경우에만, 태그의 내용을 출력 -->
	<c:choose>
		<c:when test="${no>300}">최우수</c:when>
		<c:when test="${no>200}">우수</c:when>
		<c:otherwise>양호</c:otherwise>
	</c:choose>
		<!-- test 값이 true인 첫번째 when 태그의 내용을 출력 -->
		<!-- test 값이 true인 when 태그가 없으면 otherwise 태그의 내용을 출력 -->
	<%
		// 1부터 10까지 for문을 이용하여 출력
// 		for(int i=1; i<=10; i++) {
// 			out.println(i);
// 		}
		String[] arr = new String[]{"A", "B", "C"};
		// 배열 arr의 요소들을 순서대로 출력
// 		for(int i=0; i<arr.length; i++){
// 			out.println(arr[i]);
// 		}
// 		for ( String s : arr) {
// 			out.println(s);
// 		}
	%>
	<c:forEach var="i" begin="1" end="10" step="1">[${i}]</c:forEach>
	<c:set scope="page" var="pa" value='<%=new String[]{"A", "B", "C"} %>'></c:set>
	<c:forEach var="s" items="${pa}">[${s}]</c:forEach>
	<ul>
		<c:forEach var="s" items="${pa}" varStatus="st">
			<li> 
			${s} ==	${st.current} 현재값,
			${st.index} 몇 번째 반복인지(0부터),
			${st.count} 몇 번째 반복인지(1부터),
			${st.first} 첫 번째 반복인지 여부,
			${st.last} 마지막 반복인지 여부,
			${st.begin} 태크의 begin 속성값,
			${st.end} 태크의 end 속성값,
			${st.step} 태크의 step 속성값,
			</li>
		</c:forEach>
	</ul>
	<c:forTokens var="t" items="a,b:c,d" delims=",:">[${t}]</c:forTokens>
<!-- 	items에 지정한 문자열을 delims에 지정한 문자 기준으로 잘라서 -->
<!-- 	만든 문자열 배열의 요소들을 하나씩 var에 지정한 변수(속성)에 -->
<!-- 	대입하면서 반복 출력 -->
	<h3>속성값출력</h3>
	<%pageContext.setAttribute("str", "<h1>야채피자</h1>"); %>
	EL을 이용한 출력 : ${str} <br>
	JSTL을 이용한 출력 : <c:out value="${str}"></c:out> <br>
<!-- 	출력할 내용 중 HTML태그를, 태그로 인식되지 않도록 출력 -->
	&lt;br&gt;은 줄바꿈을 의미합니다.
	
	<h3>주소처리</h3>
	<a href="menu.jsp">메뉴JSP파일로이동</a>
	<a href="<%=request.getContextPath() %>/menu.jsp">메뉴JSP파일로이동</a>
	<a href="${pageContext.request.contextPath}/menu.jsp">메뉴JSP파일로이동</a>
	<c:set scope="application" var="cp" value="${pageContext.request.contextPath}" />
	<a href="${cp}/menu.jsp">메뉴JSP파일로이동</a>
	<a href="<c:url value="/menu.jsp" />">메뉴JSP파일로 이동</a>
	<!-- c:url 태그는 경로가 /로 시작하면 컨텍스트패스를 자동 추가 -->
	
<%-- 	<% response.sendRedirect(request.getContextPath()+"/menu.jsp"); %> --%>
<%-- 	<c:redirect url="/menu.jsp" /> --%>
	
	다른 JSP 파일의 내용(소스코드)을 이곳에 복사한 후, 
	하나의 JSP(서블릿) 파일로서 실행
	<%@ include file="/menu.jsp" %>
	다른 JSP(또는 서블릿)을 실행한 후, 그 결과(출력내용)을 이곳에 포함
	<jsp:include page="/menu.jsp" />
	jsp:include와 유사한 방식이지만, 다른 웹앱(사이트)도 포함 가능
	<c:import url="/menu.jsp" />
	
	<c:import url="http://google.com" />
	
	<c:url value="/menu.jsp">
    	<c:param name="x">1</c:param>
    	<c:param name="y">2</c:param>
   	</c:url>
   
      <h3>예외 처리</h3>
	<%
//      try{
//         int x = 5/0;
//      } catch (Exception e){
//         out.print(e.getMessage());
//      }
	%>
	<c:catch var="e">
		<%int x = 5/0; %>		
	</c:catch>
	발생한 예외 : ${e.message}
	
   
   
	
</body>
</body>
</html>










