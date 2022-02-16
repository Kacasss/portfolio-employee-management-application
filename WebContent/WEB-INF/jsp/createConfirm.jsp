<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録確認</title>
</head>
<body>

	<h1>登録確認</h1>
	

			<table>
				<tr>
					<th>ID</th>
					<th>名前</th>
					<th>年齢</th>
				</tr>
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.age}</td>
				</tr>
			</table>
			
			<form action="<%= request.getContextPath() %>/create" method="post">
				<input type="hidden" name="id" value="${emp.id}">
				<input type="hidden" name="name" value="${emp.name}">
				<input type="hidden" name="age" value="${emp.age}">
				<input type="submit" value="登録">
			</form>


	
	<a href="<%= request.getContextPath() %>/employee">
		<button>戻る</button>
	</a>
</body>
</html>