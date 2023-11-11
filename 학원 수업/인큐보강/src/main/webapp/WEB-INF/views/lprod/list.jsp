<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>상품 분류 목록</h2>
<!-- 폼태그 -->
<!-- 
요청URI : /lprod/list2?gubun=lprodGu&keyword=P101
요청파라미터 : gubun=&keyword=
요청방식 : get
 -->
<h3>gubun : ${param.gubun}</h3>
<h3>keyword : ${param.keyword}</h3>
<form id="frm" name="frm" action="/lprod/list4" method="get">
	<!-- 폼데이터 -->
	<div class="input-group input-group-sm">
		<select name="gubun" class="form-control">
			<option value="">선택하세요</option>
			<option value="lprodGu"
				<c:if test="${param.gubun=='lprodGu'}">selected</c:if>>상품분류코드</option>
			<option value="lprodNm"
				<c:if test="${param.gubun=='lprodNm'}">selected</c:if>>상품분류명</option>
		</select> <input type="text" name="keyword" class="form-control"
			value="${param.keyword}" placeholder="검색어를 입력해주세요"> <span
			class="input-group-append">
			<button type="submit" class="btn btn-info btn-flat">검색</button>
		</span>
	</div>
	<hr />


	<div class="card">
		<div class="card-header">
			<h3 class="card-title">상품 분류 목록</h3>
		</div>
		<div class="card-body">
			<!-- model.addAttribute("data", data) -->
			<p>${data}</p>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th style="width: 10%;">#</th>
						<th style="width: 25%;">삼품분류 아이디</th>
						<th style="width: 25%;">상품분류 코드</th>
						<th style="width: 40%">상품분류 명</th>
					</tr>
				</thead>
				<tbody>
					<!-- data : List<LprodVO> -->
					<c:forEach var="lprodVO" items="${data}" varStatus="stat">
						<tr>
							<td>${stat.count }</td>
							<td>${lprodVO.lprodId }</td>
							<td>${lprodVO.lprodGu }</td>
							<td>${lprodVO.lprodNm }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="card-footer clearfix">
			<ul class="pagination pagination-sm m-0 float-right">
				<li class="page-item"><a class="page-link" href="#">«</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">»</a></li>
			</ul>
		</div>
	</div>
</form>