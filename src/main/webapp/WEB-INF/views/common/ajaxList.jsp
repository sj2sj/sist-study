<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${comments}" var="list">
	<div class="card mb-2">
		<div class="card-header bg-light">
		        <span> ${list.writer} </span> 
		        <span class="replyRegDate"> ${list.regDate} </span>
		</div>
		<div class="card-body">
			<ul class="list-group list-group-flush">
			    <li class="list-group-item">
					<div id="content${list.commentNum}" data-comment-num="${list.commentNum}">
					  	<div></div>
					  	${list.contents} 
					</div>
					<c:if test="${member.id eq list.writer}">
						<button type="button" data-comment-num="${list.commentNum}" class="update btn btn-dark mt-3"> update </button>
						<button type="button" data-comment-num="${list.commentNum}" class="delete btn btn-dark mt-3"> 삭제 </button>
					</c:if>
			    </li>
			</ul>
		</div>
	</div>
</c:forEach>

<nav aria-label="Page navigation example">
	<ul class="pagination justify-content-center">
	<li class="page-item">
      <span class="page-link" data-comment-pn="1">&laquo;</span>
    </li>
	<li class="page-item">
      <span class="page-link" data-comment-pn="${pager.startNum-1}">&lt</span>
    </li>
    
    	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
    		<li class="page-item"> 
    			<span class="page-link" data-comment-pn="${n}"> ${n} </span> 
    		</li>
		</c:forEach>
    <li class="page-item">
      	<span class="page-link" data-comment-pn="${pager.lastNum+1}">&gt</span>
    </li>
    <li class="page-item">
    	<span class="page-link" data-comment-pn="${pager.totalPage}"> &raquo; </span>
    </li>
  </ul>
</nav>