<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集</title>
</head>
<body>

	<h1>編集</h1>
	<form action="<%= request.getContextPath() %>/edit" method="post">
		ID：<input type="text" name="id">
		<input type="submit" value="編集">
	</form>

</body>
</html>