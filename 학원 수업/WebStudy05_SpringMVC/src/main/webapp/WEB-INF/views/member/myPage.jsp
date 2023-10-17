<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:if test="${not empty message }">
	<script>
		alert("${message}");
	</script>
</c:if>    
    
	<table class="table table-bordered">
		<tr>
			<th><label for="memId"><spring:message code="member.memId"/></th>
			<td>${member.memId }</td>
		</tr>
		<tr>
			<th><label for="memPass"><spring:message code="member.memPass"/></label></th>
			<td>${member.memPass }</td>
		</tr>
		<tr>
			<th><label for="memImage"><spring:message code="member.memImage"/></label></th>
			<td>	
				<img src="data:image/*;base64,${member.memImgBase64 }"/>
			</td>
		</tr>
		<tr>
			<th><label for="memName"><spring:message code="member.memName"/></label></th>
			<td>${member.memName }</td>
		</tr>
		<tr>
			<th><label for="memRegno1"><spring:message code="member.memRegno1"/></label></th>
			<td>${member.memRegno1 }</td>
		</tr>
		<tr>
			<th><label for="memRegno2"><spring:message code="member.memRegno2"/></label></th>
			<td>${member.memRegno2 }</td>
		</tr>
		<tr>
			<th><label for="memBir"><spring:message code="member.memBir"/></label></th>
			<td>${member.memBir }</td>
		</tr>
		<tr>
			<th><label for="memZip"><spring:message code="member.memZip"/></label></th>
			<td>${member.memZip }</td>
		</tr>
		<tr>
			<th><label for="memAdd1"><spring:message code="member.memAdd1"/></label></th>
			<td>${member.memAdd1 }</td>
		</tr>
		<tr>
			<th><label for="memAdd2"><spring:message code="member.memAdd2"/></label></th>
			<td>${member.memAdd2 }</td>
		</tr>
		<tr>
			<th><label for="memHometel"><spring:message code="member.memHometel"/></label></th>
			<td>${member.memHometel }</td>
		</tr>
		<tr>
			<th><label for="memComtel"><spring:message code="member.memComtel"/></label></th>
			<td>${member.memComtel }</td>
		</tr>
		<tr>
			<th><label for="memHp"><spring:message code="member.memHp"/></label></th>
			<td>${member.memHp }</td>
		</tr>
		<tr>
			<th><label for="memMail"><spring:message code="member.memMail"/></label></th>
			<td>${member.memMail }</td>
		</tr>
		<tr>
			<th><label for="memJob"><spring:message code="member.memJob"/></label></th>
			<td>${member.memJob }</td>
		</tr>
		<tr>
			<th><label for="memLike"><spring:message code="member.memLike"/></label></th>
			<td>${member.memLike }</td>
		</tr>
		<tr>
			<th><label for="memMemorial"><spring:message code="member.memMemorial"/></label></th>
			<td>${member.memMemorial }</td>
		</tr>
		<tr>
			<th><label for="memMemorialday"><spring:message code="member.memMemorialday"/></label></th>
			<td>${member.memMemorialday }</td>
		</tr>
		<tr>
			<th><label for="memMileage"><spring:message code="member.memMileage"/></label></th>
			<td>${member.memMileage }</td>
		</tr>
		<tr>
			<th><label for="memDelete"><spring:message code="member.memDelete"/></label></th>
			<td>${member.memDelete }</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="${pageContext.request.contextPath }/member/memberUpdate.do" class="btn btn-primary">수정</a>
				<a data-bs-toggle="modal" data-bs-target="#exampleModal" class="btn btn-danger">탈퇴</a>
			</td>
		</tr>
	</table>
	<table class="table table-bordered">
		<thead class="table-dark">
			<tr>
				<th>상품명</th>
				<th>상품분류</th>
				<th>제조사이름</th>
				<th>구매일자</th>
				<th>구매수량</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="cartSet" value="${member.cartSet }"/>
			<c:choose>
				<c:when test="${not empty cartSet }">
					<c:forEach items="${cartSet }" var="cart">
						<c:set var="prod" value="${cart.prod }" />
						<c:url value="/prod/prodView.do" var="prodViewURL">
							<c:param name="what" value="${prod.prodId }" />
						</c:url>
						<tr>
							<td><a href="${prodViewURL }">${prod.prodName }</a></td>
							<td>${prod.lprod.lprodNm }</td>
							<td>${prod.buyer.buyerName }</td>
							<td>${cart.cartDate }</td>
							<td>${cart.cartQty }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">구매 정보 없음.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	
	<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action='<c:url value="/member/memberDelete.do" />' method="post">
	      <div class="modal-body">
	        <input type="password" name="password" class="form-control" />
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="submit" class="btn btn-primary">Save changes</button>
	      </div>
      </form>
    </div>
  </div>
</div>
	
<script>
	$(exampleModal).on("hidden.bs.modal", function(){
		$(this).find("form")[0].reset();
	});
</script>	
	
	
	
	
	
	
	
	
	
	
