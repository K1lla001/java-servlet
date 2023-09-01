<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Dashboard</title>
</head>
<body>
<h1>Dashboard</h1>

<h2>Data Mahasiswa</h2>
<table border="1">
  <tr>
    <th>Department</th>
    <th>Student ID</th>
    <th>Marks</th>
  </tr>
  <c:forEach var="department" items="${departmentData}">
    <c:forEach var="student" items="${department.students}">
      <tr>
        <c:if test="${student == department.students[0]}">
          <td rowspan="${fn:length(department.students)}">${department.name}</td>
        </c:if>
        <td>${student.studentID}</td>
        <td>${student.mark}</td>
      </tr>
    </c:forEach>
  </c:forEach>
</table>

<h2>Persentase Kelulusan</h2>
<table border="1">
  <tr>
    <th>Department</th>
    <th>Pass %</th>
  </tr>
  <c:forEach var="department" items="${departmentData}">
    <tr>
      <td>${department.name}</td>
      <td>${department.passPercentage}%</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
