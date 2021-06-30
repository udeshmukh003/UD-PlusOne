<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>

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

 <script type="text/javascript">
function edit() {
	
	document.my.action="edit";
    document.my.submit();
	 
}
function delet() {
	
	document.my.action="delet";
	document.my.submit();
}

</script>
</head>

<body>

<form action="edits" name="my">
Congratulations...!!!!!!!!!!!!!!!!!!

<h2>Info Table</h2>

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
    <th>Photo's</th>
    <th>Edit</th>
    <th>Delet</th>
  </tr>
  
<p:forEach items="${data1}" var="w">

	<p:url var="updateLink" value="/edit">
		<p:param name="pId" value="${w.pId }"></p:param>
	</p:url>

<tr>
<td><p:out value="${w.pId}"></p:out></td>
<td><p:out value="${w.fname}"></p:out></td>
<td><p:out value="${w.email }"></p:out></td>
<td><p:out value="${w.mobNo}"></p:out></td>
<td><p:out value="${w.gender}"></p:out></td>
<td><p:out value="${w.dob}"></p:out></td>
<td><p:out value="${w.country}"></p:out></td>
<td><p:out value="${w.lang}"></p:out></td>
<td><img alt="image not found" src="${w.image}" width="100" height="100"></td>

<%-- <td><input type="hidden" value="${w.pId}" name="pId"/></td> --%>

<!-- <td><input type="button" value="edit" onclick="edit()" /></td> -->


<td><a href="${updateLink }"><input type="button" value="Edit"/></a></td>

<td><input type="button" value="delete" onclick="delet()"/></td>

</tr>
</p:forEach>

	

</table>

<br><br>   
<a href="index.jsp" data-inline="true" ><input type="button" value="Back to Sign In" style="height: 60px" /></a>
<br><br>


</form>
</body>
</html>