<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

<form action="update">


<h2>Edit info Table</h2>

<table>
  <tr>
    <th>PID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Mob No</th>
    <th>Gender</th>
    <th>DOB</th>
    <th>Country</th>
    <th>Language</th>
  </tr>
  
<p:forEach items="${data}" var="w">
<tr>
<th><p:out value="${w.pId}" ></p:out><input type="text" name="pId" value="${w.pId}"></th>
<th><p:out value="${w.fname}"></p:out><input type="text" name="fname" value="${w.fname}"></th>
<th><p:out value="${w.email }"></p:out><input type="text" name="email" value="${w.email}"></th>
<th><p:out value="${w.mobNo}"></p:out><input type="number" name="mobNo" value="${w.mobNo}"></th>
<th><p:out value="${w.gender}"></p:out><input type="text" name="gender" value="${w.gender}"></th>
<th><p:out value="${w.image}"></p:out><input type="text" name="image" value="${w.image}"></th>
<th><p:out value="${w.dob}"></p:out><input type="text" name="dob" value="${w.dob}"></th>
<th><p:out value="${w.country}"></p:out><input type="text" name="country" value="${w.country}"></th>
<th><p:out value="${w.lang}"></p:out><input type="text" name="lang" value="${w.lang}"></th>
<td><input type="hidden" value="${w.uname }" name="uname" /></td>
<td><input type="hidden" value="${w.pass }" name="pass" /></td>

</tr>
</p:forEach>

</table>

<br><br>
<input type="submit" value="SAVE" style="height:60px" />  

</form>
</body>
</html>