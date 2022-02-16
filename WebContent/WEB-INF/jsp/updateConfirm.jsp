<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新画面</title>
</head>
<body>

	<h1>更新画面</h1>
	<form action="<%= request.getContextPath() %>/update" method="post">
			ID:${employee.id}<input type="hidden" name="id" value="${employee.id}"><br>
			名前：<input type="text" name="name" value="${employee.name}"><br>
			年齢：<input type="number" name="age" value="${employee.age}"><br>
				<input type="submit" value="更新">
	</form>
	
	<a href="<%= request.getContextPath() %>/employee">
		<button>TOPへ戻る</button>
	</a>
	
</body>
</html>