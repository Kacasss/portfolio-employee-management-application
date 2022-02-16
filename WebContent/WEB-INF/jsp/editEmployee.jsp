<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
</head>
<body>

	<h1>編集画面</h1>
	
	<table>
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>年齢</th>
		</tr>
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.age}</td>
		</tr>
	</table>

		<form action="<%= request.getContextPath() %>/updateConfirm" method="post">
				<input type="submit" value="編集">
				<input type="hidden" name="id" value="${employee.id}"><br>
				<input type="hidden" name="name" value="${employee.name}"><br>
				<input type="hidden" name="age" value="${employee.age}"><br>
		</form>
</body>
</html>