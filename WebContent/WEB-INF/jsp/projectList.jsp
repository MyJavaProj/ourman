<%-- <%@page pageEncoding="utf-8"%>
 <html> <head>
<title></title>
</head> <body>
<h1>
Welcome,${name}
</h1> </body>

</html>
 --%>
<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
</head>
<body>
	<h1>Project List</h1>
	<table width="90%" border="2">
		<tr>

			<td>ID</td>
			<td>Name</td>
			<td>Start Date</td>
			<td>End Date</td>
		</tr>
		<c:forEach items="${projectList}" var="project">
			<tr>
				<td>${project.id}</td>
				<td>${project.name}</td>
				<td>${project.startDate}</td>
				<td>${project.endDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>