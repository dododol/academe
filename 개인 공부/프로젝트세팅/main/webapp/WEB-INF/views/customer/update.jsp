<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div>
			<h3>고객정보 변경</h3>
		</div>
		
		<div>
			<form method="post">
				<div>
					<div><label>고객번호:</label></div>
					<div><input type="number" name="custid" value="${item.custid}" readonly></div>
				</div>
				
				<div>
					<div><label>고객명:</label></div>
					<div><input type="text" name="name" value="${item.name}"></div>
				</div>
				
				<div>
					<div><label>주소:</label></div>
					<div><input type="text" name="address" value="${item.address}"></div>
				</div>
				
				<div>
					<div><label>전화번호:</label></div>
					<div><input type="text" name="phone" value="${item.phone}"></div>
				</div>
				
				<div>
					<div><button>변경</button></div>
					<div><a href="../list"><button type="button">취소</button></a></div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>