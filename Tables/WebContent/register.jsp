<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<form:form method="post">
		<h2>Registeration Form</h2>

		<c:url var="registerStudentUrl" value="/registerStudent.shu" />
		<table>
			<tr>
				<td>Qualification</td>
			</tr>
			<tr>
				<td><c:forEach items="${student.qualificationList}" var="quali"
						varStatus="status">
						<a href="${registerStudentUrl}?stream=${quali.stream}&sid=123">Edit
						</a>
						<br />
					</c:forEach></td>
			</tr>
		</table>
	</form:form>
</body>
</html>