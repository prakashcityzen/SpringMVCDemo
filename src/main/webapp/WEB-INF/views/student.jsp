<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/11/2018
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>Add Student</h1>

<form action="save" method="post">
    <p>Student Name: <input type="text" name="studentName"/></p>
    <p>Student Address:<input type="text"  name="studentAddress"/></p>
    <p>Student Phone:<input type="text" name="studentPhone"/></p>
    <p><input type="submit" value="Add Student"/></p>
</form>
<hr>
<h1>Display Stdents</h1>
<table>

    <thead>
    <th>Id</th>
    <th>Student Name</th>
    <th>Student Address</th>
    <th>Student Phone</th>
    <th>Delete</th>
    </thead>
    <tbody>
    <c:forEach items="${StudentList}" var="student">
    <tr>

        <td>${student.studentId}</td>
        <td>${student.studentName}</td>
        <td>${student.studentAddress}</td>
        <td>${student.studentPhone}</td>
        <td><a href="${pageContext.request.contextPath}/deleteStudent/${student.studentId}">Delete</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
