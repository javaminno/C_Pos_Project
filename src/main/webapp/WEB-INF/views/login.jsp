<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script type="text/javascript">
   function check() {
      if (login.id.value == "") {
         alert("아이디를 입력하세요.");
         login.id.focus();
         return false;
      } else if (login.id.value != "admin") {
         alert("아이디가 맞지 않습니다.");
         login.id.focus();
         return false;
      } else if(login.pw.value == "") {
         alert("비밀번호를 입력하세요.")
         login.pw.focus();
         return false;
      } else if(login.pw.value != "1234") {
          alert("비밀번호가 맞지 않습니다.")
          login.pw.focus();
          return false;
       } else
         return true;
   }
</script>
</head>
<body>
	<center>
	<table>
		<form id="login" action="index" method="post" onsubmit="return check()">
		<tr>
			<td>ID</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td><input type="submit" value="로그인">
		</tr>
		</form>
	</table>
	</center>
</body>
</html>