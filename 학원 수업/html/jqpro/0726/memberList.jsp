<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.mybatis.config.MybatisUtil"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// 요청시 전송데이터 받기 
	
	// db처리 - 결과값 얻기
	// SqlSession 얻어오기
	SqlSession sql = 
			MybatisUtil.getSqlSession();

	// db의 member table에서 select를 수행
	List<MemberVO> list = 
			sql.selectList("member.getAllMember");
	
	
	// 결과값으로 출력 또는 응답데이터 생성-
%>
[

<%
	for(int i = 0; i < list.size(); i++) {
		MemberVO vo = list.get(i);
		if(i > 0) out.print(",");
		
%>		
		{
			"name" : "<%= vo.getMem_name() %>",
			"id"   : "<%= vo.getMem_id() %>",
			"pass" : "<%= vo.getMem_pass() %>",
			"mail" : "<%= vo.getMem_mail() %>",
			"hp"   : "<%= vo.getMem_hp() %>"			
		}
<%	
	}
%>

]
