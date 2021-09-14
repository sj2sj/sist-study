<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		/* request.setCharacterEncoding("UTF-8");  */
	%>
	<h1> memberJoin Page </h1>
	<form action="./memberJoin.do" method="POST" >
		ID <input type="text" name="id"> <br/>
		pw <input type="password" name="pw"> <br/>
		이름 <input type="text" name="name"> <br/>
		휴대폰번호 <input type="text" name="phone"> <br/>
		email <input type="text" name="email"> 
	

		<div>
			<p>
				<input type="submit"> 
			</p>
			
			<p>
				<input type="reset"> 
			</p>
		</div>
	</form>


</body>
</html>