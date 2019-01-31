<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Change Student Info</h1>
<form action="login" method="post">
    Registration Number: <input type="text" name="id" value="${student.id}" readonly="readonly" /> <br/>
    Student Name: <input type="text" name="name" value="${student.name}" /> <br/>
    Student Age: <input type="text" name="age" value="${student.age}" /> <br/>
    Gender: <input type="text" name="gender" value="${student.gender}" /> <br/>
    ${student.hobbies[2]} <form:checkbox path="student.hobbies" value = "${student.hobbies[2]}" />
    ${student.hobbies[0]} <form:checkbox path="student.hobbies" value = "${student.hobbies[0]}" />
    ${student.hobbies[3]} <form:checkbox path="student.hobbies" value = "${student.hobbies[3]}" />
    ${student.hobbies[1]} <form:checkbox path="student.hobbies"  value=""/>
    ${student.hobbies[4]} <form:checkbox path="student.hobbies" value=""/>

    <input type="submit" value="提交"/><br/>
<form>

            <form:form modelAttribute="student" action="login" method="post">
                Hobbies: <form:checkboxes items="${student.hobbies}" path="selectedHobbies" />
                <input type="submit" value="提交"/>
            </form:form>

            <form:form modelAttribute="student" action="login" method="post">
                  grades: <form:radiobuttons items="${student.gradeMap}" path="selectedGrade" />
                  <input type="submit" value="提交"/>
             </form:form>
             <form:form modelAttribute="student" action="login" method="post">
                  Cities: <form:select  path="selectedCity" >
                  <form:options items="${student.travelledCity}" />
                  </form:select>
                  <input type="submit" value="提交"/>
            </form:form>
</body>
</html>