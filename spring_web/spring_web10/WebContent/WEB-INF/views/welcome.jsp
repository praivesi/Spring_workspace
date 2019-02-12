<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
	<h2>welcome.jsp</h2>
	<h2>가입해 주셔서 감사합니다</h2>
	<h3>가입 정보 확인</h3>
	<ul>
		<li>your id : ${dt.id }</li>
		<li>your pwd : ${dt.pwd }</li>
		<li>confirm : ${dt.confirm }</li>
		<li>email : ${dt.email }</li>
	</ul>

	<a href="../main">[메인화면으로 이동]</a>

</body>
</html>