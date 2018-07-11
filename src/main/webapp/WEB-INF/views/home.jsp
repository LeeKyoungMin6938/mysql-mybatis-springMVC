<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<h5>총 ${country.size() }건</h5>
<table border="1">
	<tr align="left">
		<th width="100" align="center">코드</th>
		<th width="200" align="center">이름</th>
	</tr>
	
	<c:forEach var="country" items="${country}">
		<tr>
			<td align="center">${country.code}</td>
			<td align="center">${country.name}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
