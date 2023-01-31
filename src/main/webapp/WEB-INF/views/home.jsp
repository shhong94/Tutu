<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<style type="text/css">

	/* body {
		margin: auto;
	} */

	/* .container {
		margin: auto;
	} */
	
	#btn_board {
		margin: auto;
		display: block;
	    border: 2px solid #989898;
	    border-radius: 5px;
	    width: 300px;
	    height: 50px;
	    font-size: 20;
	    transition: all 0.5s;
	}
	#btn_board:hover {
		background-color: #A3A3A3;
		color: white;
	}

</style>
<head>
	<title>Home</title>
</head>
<body>

<div class="container">
	<button id="btn_board" onclick="location.href='/selectListBoard'">게시판 이동</button>
</div>

</body>
</html>
