<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 1/26/2024
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<h1>Dang ki tai khoan</h1>
<form:form action="/auth/register" method="post" modelAttribute="account">
    <div>
        <h3>FullName</h3>
        <form:input path="fullName" type="text"/>
        <form:errors path="fullName" cssClass="error" element="p"/>
    </div>
    <div>
        <h3>UserName</h3>
        <form:input type="text" path="username"/>
        <form:errors path="username" cssClass="error" element="p"/>

    </div>
    <div>
        <h3>Password</h3>
        <form:input type="password" path="password"/>
        <form:errors path="password" cssClass="error" element="p"/>

    </div>
    <div>
        <h3>Confirm Password</h3>
        <form:input type="password" path="confirmPassword"/>
        <form:errors path="confirmPassword" cssClass="error" element="p"/>

    </div>
    <div>
        <h3>Phone</h3>
        <form:input type="text" path="phone"/>
        <form:errors path="phone" cssClass="error" element="p"/>
    </div>
    <div>
        <button type="submit">Register</button>
    </div>
</form:form>
</body>
</html>
