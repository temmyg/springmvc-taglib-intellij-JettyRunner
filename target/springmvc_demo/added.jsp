<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ page import = "com.southwind.entity.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Student Added</h1>fsdfdsa
    <form:form modelAttribute="student" action="login" method="post">
        学生编号：<form:input path="id" readonly=""/><br/>
        学生姓名：<form:input path="name" /><br/>
        学生年龄：<form:input path="age" /><br/>
        学生性别：<form:input path="gender" /><br/>
        Hobbies:
        <c:forEach var="hobby" items="${student.hobbies}">
            <form:checkbox path="hobbies" value="${hobby}" /> ${hobby}
        </c:forEach>
         <input type="submit" value="提交"/>
    </form:form>

    Selected Hobbies: total-- <b> <%= ((Student)request.getAttribute("student")).getSelectedHobbies().length %> </b>  <br/>
    <c:forEach var="hobby" items="${student.selectedHobbies}">
                <form:checkbox path="student.selectedHobbies" value="${hobby}" /> ${hobby}
    </c:forEach>
    <br /> <br/>
    <div>
        You selected Grade ${student.selectedGrade}
    </div>
    <br /> <br/>
    <div>
        You selected City ${student.selectedCity}
    </div>
    <div>
    <%
        double len = Math.random();
        Student student = new Student();
        student.setName("Aron");
    %>
    </div>
</body>
</html>
