<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
<c:import url="./temp/boot_head.jsp"></c:import>
</head>
<body>

<c:import url="./temp/boot_nav.jsp"></c:import>
<h1>
	Hello world!  
</h1>

<P> d The time on the server is ${serverTime}. </P>

<c:if test="${not empty member}">
	<h3> login 성공 시 </h3>
</c:if>
<c:if test="${empty member}">
	<h3> login 하기 전 </h3>
</c:if>

<button id="btn"> CLICK </button>


<script type="text/javascript">
	$("#btn").click(function() {
		alert('ff');
	})
</script>


</body>
</html>
