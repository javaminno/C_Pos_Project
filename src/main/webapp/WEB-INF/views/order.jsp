<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
	//String cafe = request.getParameter("${price}");
	
	//int Int = Integer.parseInt(cafe);
%>
<html>
<head>
<meta charset="UTF-8">
<title>order.jsp</title>
</head>
<body>
<center>
	<table width="700" cellpadding="0" cellspacing="0" border="1" bgcolor="skyblue">
		<tr>
			<td><h3><span style="color:red;"><center>주문 받기</center></h3></td>
		</tr>
	</table>
	<form action="order">
	<td><h1><center><span style="color:skyblue;">OOO 카페 </span></center></h1></td>
	<c:forEach items="${list}" var="dto">
	<input type="button" value="${dao.product 1}">
	<input type="button" value="${dao.product 2}">
	<input type="button" value="${dao.product 3}">
	</c:forEach>
	</center>
	</form>
</body>
</html>