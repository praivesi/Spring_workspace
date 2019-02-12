<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			/* var id = $("#id").val();	
			var pwd = $("#pwd").val();	
			var confirm = $("#confirom").val();
			var email = $("email").val();
			
			console.log(id + " " + pwd + " " + confirm + " " + email);	
 */
 
 		document.frm.action="step3.do";
 		document.frm.method="get";
 		document.frm.submit();
		});
	});
</script>


</head>
<body>
	<h2>step2.jsp</h2>
	<form name="frm">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="Text" name="id" id="id" /></td>
			</tr>
			
			<tr>
				<th>PW</th>
				<td><input type="password" name="pwd" id="pwd" /> </td>
			</tr>
			
			
			<tr>
				<th>Confirm</th>
				<td><input type="password" name="confirm" id="confirm" /> </td>
			</tr>
			
			<tr>
				<th>Email</th>
				<td><input type="email" name="email" id="email" /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="button" value="가입" id="btn" />
					<input type="button" value="되돌아가기"
						onclick="javascript:history.back()"
					 />
				</td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>