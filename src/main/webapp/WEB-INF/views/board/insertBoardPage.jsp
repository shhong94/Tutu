<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>게시글 생성 화면</h1>

<form action="/insertBoard" method="post">
	<label>게시글 아이디</label>
	<input type="text" value="${id}"/>
	<br>
	<label>게시글 내용</label>
	<input type="text" value="${content}"/>
	<input type="submit" value="작성">
</form>

</body>
</html>