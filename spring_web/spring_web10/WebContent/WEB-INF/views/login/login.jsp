<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			location.href = "../register/step1.do";
		});
	});
</script>

</head>
<body>
	<h2>login.jsp</h2>
	<form name="frm">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="password" name="pwd" id="pwd" /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="button" value="로그인" />
					<input type="button" value="회원가입" id="btn" />
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>