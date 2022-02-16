<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
	<h1>新規登録</h1>

	<form action="<%= request.getContextPath() %>/createConfirm" method="post">
		<p>
			ID：<input type="text" name="id"><br>
			名前：<input type="text" name="name"><br>
			年齢：<input type="number" name="age"><br>
		</p>
		
		<input type="submit" value="確認">
	</form>
	<a href="<%= request.getContextPath() %>/employee">
		<button>戻る</button>
	</a>
	
	<c:if test="${not empty msgList}">
		<c:forEach var="msg" items="${msgList}">
			<p style="color: red">
				<c:out value="${msg}" />
			</p>
		</c:forEach>
	</c:if>
	
</body>
</html>