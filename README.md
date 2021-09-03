# Spring4


## Board


### Notice (공지사항) 게시판

1. 글번호, 글제목, 글내용, 작성자, 작성일, 조회수

#### 1) 테이블 생성
 테이블명: NOTICE <br>
 글번호 (NUM) - PK <br>
 글제목 (TITLE) <br>
 글내용 (CONTENTS) <br> 
 작성자 (WRITER) - FK <br>
 작성일 (REGDATE) <br>
 조회수 (HITS) <br>
 
#### 2) 시퀀스 생성

#### 3) 기능
- `List` <br>
	url: /notice/list <br>
	jsp: /WEB-INF/views/board/list.jsp
- `상세`  <br>
	url: /notice/select <br>
	jsp: /WEB-INF/views/board/select.jsp
- `글쓰기` <br>
	Request: GET (form)
	url: /notice/insert <br>
	jsp: /WEB-INF/views/board/insert.jsp
	Request: POST
	url: /notice/insert <br>
	jsp: /WEB-INF/views/board/insert.jsp
- `삭제`
- `수정`
	
