<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 	
<table class="table table-bordered">
	<tr>
		<th><spring:message code="buyer.buyerId" /></th>
		<td>${buyer.buyerId }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerName" /></th>
		<td>${buyer.buyerName }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerLgu" /></th>
		<td>${buyer.buyerLgu }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerBank" /></th>
		<td>${buyer.buyerBank }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerBankno" /></th>
		<td>${buyer.buyerBankno }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerBankname" /></th>
		<td>${buyer.buyerBankname }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerZip" /></th>
		<td>${buyer.buyerZip }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerAdd1" /></th>
		<td>${buyer.buyerAdd1 }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerAdd2" /></th>
		<td>${buyer.buyerAdd2 }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerComtel" /></th>
		<td>${buyer.buyerComtel }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerFax" /></th>
		<td>${buyer.buyerFax }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerMail" /></th>
		<td>${buyer.buyerMail }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerCharger" /></th>
		<td>${buyer.buyerCharger }</td>
	</tr>
	<tr>
		<th><spring:message code="buyer.buyerTelext" /></th>
		<td>${buyer.buyerTelext }</td>
	</tr>
</table>
<h4>생산품목</h4>
<table class="table table-bordered">
	<thead>
		<tr>
			<th><spring:message code="prod.prodName" /></th>
			<th><spring:message code="prod.prodCost" /></th>
			<th><spring:message code="prod.prodPrice" /></th>
			<th><spring:message code="prod.prodMileage" /></th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty buyer.prodList }">
			<tr>
				<td colspan="4">제조 품목 없음.</td>
			</tr>
		</c:if>
		<c:if test="${not empty buyer.prodList }">
			<c:forEach items="${buyer.prodList }" var="prod">
				<tr>
					<td>
						<c:url value="/prod/prodView.do" var="prodViewUrl">
							<c:param name="what" value="${prod.prodId }" />
						</c:url>
						<a href="${prodViewUrl }">${prod.prodName }</a>
					</td>
					<td>${prod.prodCost }</td>
					<td>${prod.prodPrice }</td>
					<td>${prod.prodMileage }</td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
</table>
