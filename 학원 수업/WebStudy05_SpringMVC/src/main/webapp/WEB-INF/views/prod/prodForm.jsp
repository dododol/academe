<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<style>
	th{
		text-align: center;
	}
	td{
		padding-bottom: 2px;
	}
</style>

<form:form modelAttribute="prod" method="post" enctype="multipart/form-data">
	<table class="col-md-6">
		<tr>
			<th><label for="prodName">상품명</label></th>
			<td>
				<form:input type="text" path="prodName" class="form-control"  />
				<form:errors path="prodName" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodLgu">상품분류</label></th>
			<td>
				<form:select path="prodLgu" items="${lprodList }" 
							itemLabel="lprodNm" itemValue="lprodGu" class="form-select"/>
				<form:errors path="prodLgu" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodBuyer">제조사</label></th>
			<td>
				<form:select path="prodBuyer" class="form-select">
					<option value>제조사</option>
					<c:forEach items="${buyerList }" var="buyer">
						<form:option class="${buyer.buyerLgu }" value="${buyer.buyerId }" label="${buyer.buyerName }" />
					</c:forEach>
				</form:select>
				<form:errors path="prodBuyer" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodCost">구매가</label></th>
			<td>
				<form:input type="number" path="prodCost" class="form-control"  />
				<form:errors path="prodCost" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodPrice">판매가</label></th>
			<td>
				<form:input type="number" path="prodPrice" class="form-control"  />
				<form:errors path="prodPrice" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodSale">세일가</label></th>
			<td>
				<form:input type="number" path="prodSale" class="form-control"  />
				<form:errors path="prodSale" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodOutline">요약정보</label></th>
			<td>
				<form:input type="text" path="prodOutline" class="form-control"  />
				<form:errors path="prodOutline" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodDetail">상세정보</label></th>
			<td>
				<form:textarea path="prodDetail" class="form-control"/>
				<form:errors path="prodDetail" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodImg">이미지</label></th>
			<td>
				<input type="file" name="prodImage" id="prodImage" />
				<form:errors path="prodImg" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodTotalstock">총재고</label></th>
			<td>
				<form:input type="number" path="prodTotalstock" class="form-control"  />
				<form:errors path="prodTotalstock" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodInsdate">입고일</label></th>
			<td>
				<form:input type="date" path="prodInsdate" class="form-control" />
				<form:errors path="prodInsdate" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodProperstock">적정재고</label></th>
			<td>
				<form:input type="number" path="prodProperstock" class="form-control"  />
				<form:errors path="prodProperstock" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodSize">크기</label></th>
			<td>
				<form:input type="text" path="prodSize" class="form-control" />
				<form:errors path="prodSize" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodColor">색상</label></th>
			<td>
				<form:input type="text" path="prodColor" class="form-control" />
				<form:errors path="prodColor" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodDelivery">배송방법</label></th>
			<td>
				<form:input type="text" path="prodDelivery" class="form-control" />
				<form:errors path="prodDelivery" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodUnit">단위</label></th>
			<td>
				<form:input type="text" path="prodUnit" class="form-control" />
				<form:errors path="prodUnit" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodQtyin">입고량</label></th>
			<td>
				<form:input type="number" path="prodQtyin" class="form-control" />
				<form:errors path="prodQtyin" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodQtysale">판매량</label></th>
			<td>
				<form:input type="number" path="prodQtysale" class="form-control" />
				<form:errors path="prodQtysale" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<th><label for="prodMileage">마일리지</label></th>
			<td>
				<form:input type="number" path="prodMileage" class="form-control" />
				<form:errors path="prodMileage" element="span" cssClass="error" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div class="row g-2 d-flex justify-content-center mt-1">
					<div class="col-auto">
						<button type="submit" class="btn btn-primary">저장</button>
					</div>
					<div class="col-auto">
						<button type="reset" class="btn btn-warning">취소</button>
					</div>
					<div class="col-auto">	
						<a class="btn btn-secondary" href="<c:url value='/prod/prodList.do'/>">목록으로</a>
					</div>		
				</div>
			</td>
		</tr>
	</table>
</form:form>
<script>
let $prodBuyer = $("select[name=prodBuyer]");
$("select[name=prodLgu]").on("change", function(event){
	let lgu = $(this).val();
	let $options = $prodBuyer.find("option");
	$options.hide();
	$options.filter((i,e)=>i==0).show();
	if(lgu){
		$options.filter(`.\${lgu}`).show();
	}else{
		$options.show();
	}
}).change();
</script>