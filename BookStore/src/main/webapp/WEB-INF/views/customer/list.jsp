<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer::list</title>
	</head>
	<body>
		<h3>고객목록</h3>
		<a href="/BookStore/">처음으로</a>
		<a href="/BookStore/customer/register">고객등록</a>
		
		<table border="1">
			<tr>
				<th>고객번호</th>
				<th>고객명</th>
				<th>주소</th>
				<th>휴대폰</th>
				<th>관리</th>
			</tr>
			
			<c:forEach var="cust" items="${custs}">
				<tr>
					<td>${cust.custId}</td>
					<td>${cust.name}</td>
					<td>${cust.address}</td>
					<td>${cust.phone}</td>
					<td>
						<a href="/BookStore/customer/modify?custId=${cust.custId}">수정</a>
						<a href="/BookStore/customer/delete?custId=${cust.custId}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
	</body>
</html>