<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員削除確認画面</title>
</head>
<body>
	<h1>社員削除確認画面</h1>
	<p>以下内容を削除してよろしいですか？</p>
	
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
	
	<form action="<%= request.getContextPath() %>/delete" method="post">
		<input type="hidden" name="id" value="${employee.id}">
		<input type="submit" value="削除">
	</form>
	
</body>
</html>