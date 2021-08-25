<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> bankbook Select Page </h1>
	<% 
		String num = request.getParameter("bookNumber");
		Object obj = request.getAttribute("dto");
		BankBookDTO bankBookDTO = (BankBookDTO) obj;
	%>
	
	<h3> num : <%=num %></h3>
	<h3> Name : <%= bankBookDTO.getBookName() %></h3>
	<h3> Rate : <%= bankBookDTO.getBookRete() %></h3>
	<h3> Sale : <%= bankBookDTO.getBookSale() %></h3>
	
</body>
</html>