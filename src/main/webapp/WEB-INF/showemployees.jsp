<%@ page import="com.ztaticvienn.controller.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ztaticvienn.controller.util.DateParser" %>
<%--
  Created by IntelliJ IDEA.
  User: mike
  Date: 16.05.14
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="../css/main.css">
    <title>Show Employees</title>

</head>
<body>

<div class="dialogform">
    <table border="solid">
        <c:forEach items="${list}" var="employee">
            <tr>
                <td><c:out value="${employee.getId()}"/></td>
                <td><c:out value="${employee.getName()}"/></td>
                <td><c:out value="${employee.getSurname()}"/></td>
                <td><c:out value="${employee.getDateOfBirthString()}"/></td>
                <td><c:out value="${employee.getSalary()}"/></td>
                <td><c:out value="${employee.getEmployeeType()}"/></td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
