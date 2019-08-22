<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/20
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of employees</title>
</head>
<body>
<table border="1">
    <caption>
        <h3> List of emps.</h3>
    </caption>
    <tbody>
    <tr>
        <th>Id</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Gender</th>
        <c:if test="${delStatus eq 1}"><th>opt: Delete<th></c:if>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>
                <c:choose>
                    <c:when test="${emp.gender eq 1 }">
                        <c:out value="男"/>
                    </c:when>
                    <c:when test="${emp.gender eq 0 }">
                        <c:out value="女"/>
                    </c:when>
                </c:choose>
            </td>
                <c:if test="${delStatus eq 1}">
            <td>
                    <a href="${pageContext.request.contextPath}/employee/delete?id=${emp.id}">delete</a>
            <td>
                </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
