<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除結果</title>
</head>
<body>
	<h1>削除結果</h1>
	<p>${msg}</p>
	
	<a href="<%= request.getContextPath() %>/employee">
		<button>戻る</button>
	</a>
</body>
</html>