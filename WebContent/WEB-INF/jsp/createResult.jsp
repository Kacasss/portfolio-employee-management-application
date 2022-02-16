<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録完了</title>
</head>
<body>

	<h1>登録完了</h1>
	
	<c:if test="${not empty msg}">
		<p>${msg}</p>
	</c:if>
	
	<a href="<%= request.getContextPath() %>/employee">
		<button>TOPへ戻る</button>
	</a>
</body>
</html>