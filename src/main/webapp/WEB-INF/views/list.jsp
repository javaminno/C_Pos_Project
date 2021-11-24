<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<center>
	<table width="700" cellpadding="0" cellspacing="0" border="1" bgcolor="skyblue">
		<tr>
			<td><h3><span style="color:red;"><center>상품 정보</center></h3></td>
		</tr>
	</table>
	<table width="700" cellpadding="0" cellspacing="0" border="1">
		<br>
		<tr>
			<td align="center" bgcolor="black"><span style="color:white;">번호</td>
			<td align="center" bgcolor="black"><span style="color:white;">상품명</td>
			<td align="center" bgcolor="black"><span style="color:white;">수량</td>
			<td align="center" bgcolor="black"><span style="color:white;">가격</td>
			<td align="center" bgcolor="black"><span style="color:white;">등록일</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td align="center" bgcolor="yellow">${dto.num}</td>
			<td align="center"><a href="modify?num=${dto.num }">${dto.product}</a></td>
			<td align="center">${dto.quantity}</td>
			<td align="center">${dto.price}</td>
			<td align="center">${dto.cpdate}</td>
		</tr>
		</c:forEach>
		<table width="700">
			<tr>
				<td><button type="button" onclick="location.href='writeForm'">상품등록</button></td>
			</tr>
		</table>
	</table>
	<center>
</body>
</html>