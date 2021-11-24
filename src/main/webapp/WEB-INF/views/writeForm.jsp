<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeForm.jsp</title>
</head>
<body>
	<center>
	<table width="500" cellpadding="0" cellspacing="0" border="1" bgcolor="skyblue">
		<tr>
			<td><h3><span style="color:red;"><center>상품 등록</center></h3></td>
		</tr>
	</table>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="write">
			<br>
			<tr>
				<td bgcolor="black" align="center"><span style="color:white;">상품이름</span></td>
				<td><input type="text" name="product" size="65"></td>
			</tr>
			<tr>
				<td bgcolor="black" align="center"><span style="color:white;">수량</td>
				<td><input type="text" name="quantity" size="65"></td>
			</tr>
			<tr>
				<td bgcolor="black" align="center"><span style="color:white;">가격</td>
				<td><input type="text" name="price" size="65"></td>
			</tr>
			<tr>
				<td bgcolor="black" align="center"><span style="color:white;">등록일</td>
				<td><input type="text" name="cpdate" size="65"></td>
			</tr>
			<table width="500">
				<tr align="left">
					<td colspan="3"><input type="submit" value="입력"> &nbsp;&nbsp;
					<input type="reset" value="취소"></td>
				</tr>
			</table>
		</form>
	</table>
	</center>
</body>
</html>