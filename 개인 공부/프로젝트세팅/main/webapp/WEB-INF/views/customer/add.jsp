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
			<h3>고객 등록</h3>
		</div>
		
		<div>
			<form method="post">
				<div>
					<div><label>고객번호:</label></div>
					<div><input type="number" name="custid"></div>
				</div>
				
				<div>
					<div><label>고객명:</label></div>
					<div><input type="text" name="name"></div>
				</div>
				
				<div>
					<div><label>주소:</label></div>
					<div><input type="text" name="address"></div>
				</div>
				
				<div>
					<div><label>전화번호:</label></div>
					<div><input type="text" name="phone"></div>
				</div>
				
				<div>
					<div><button>등록</button></div>
					<div><a href="list"><button type="button">취소</button></a></div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>