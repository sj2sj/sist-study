<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<nav class="navbar navbar-expand-lg ">
	<div class="container-fluid">
	    <a class="navbar-brand" href="${pageContext.request.contextPath}/">Home</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath}/notice/list">Notice</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/qna/list">Q&A</a>
	        </li>
	        
	        <c:choose>
	        	<c:when test="${not empty member}">
	        		<li class="nav-item">
						<a class="nav-link" href="${pageContext.request.contextPath}/member/mypage">MyPage</a>
			        </li>
			        <li class="nav-item">
						<a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/member/logout">logout</a>
			        </li>
	        	</c:when>
	        	<c:otherwise>
	        		<li class="nav-item">
						<a class="nav-link" href="${pageContext.request.contextPath}/member/check">Join</a>
			        </li>
			        <li class="nav-item">
						<a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/member/login">Login</a>
			        </li>
	        	</c:otherwise>
	        </c:choose>
	        
     	     
	      </ul>
	      
	    </div>
	</div>
</nav>