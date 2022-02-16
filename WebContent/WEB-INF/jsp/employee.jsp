<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<jsp:include page="/WEB-INF/jsp/common/aside.jsp" />
	
	<article>
	<h2>社員一覧</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>年齢</th>
			<th></th>
			<th></th>
		</tr>
		<tr>
		</tr>
	<c:forEach var="emp" items="${empList}" >
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.age}</td>
			<td>
				<form action="<%= request.getContextPath() %>/edit" method="post">
					<input type="hidden" name="id" value="${emp.id}">
					<input type="submit" value="編集">
				</form>
			</td>
			<td>
				<form action="<%= request.getContextPath() %>/deleteConfirm" method="post">
					<input type="hidden" name="id" value="${emp.id}">
					<input type="submit" value="削除">
				</form>
			</td>
		</tr>
	</c:forEach>
	</table>
</article>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />