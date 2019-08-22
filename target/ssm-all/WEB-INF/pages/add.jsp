<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/22
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add one Employee</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/employee/saveEmployee">
        <table>
            <tr>
                <td>
                    <label>LastName:</label>
                </td>
                <td>
                    <input type="text" id="lastName" name="lastName" />
                </td>
            </tr>
            <tr>
                <td>
                    <label>Email:</label>
                </td>
                <td>
                    <input type="text" id="email" name="email" value="@qq.com" />
                </td>
            </tr>
            <tr>
                <td>
                    <label>Gender:</label>
                </td>
                <td>
                    <input type="radio" id ="female" name="gender" value="0"/> 女
                    <input type="radio" id ="male" name="gender" value="1"/> 男
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" id="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
