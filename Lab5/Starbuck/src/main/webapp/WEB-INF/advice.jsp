<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
<p>Hello, ${user.name}</p>
<form action = "logout.do" method="post">
	<p><input type="submit" value = "Logout"/></p>
</form>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice.do?roast=${roast}" method="post">
<select name="roast"   >

	  		<c:forEach var="roast" items="${roasts}">
	    		<option value="${roast.value}" > ${roast.key}</option>
			</c:forEach>

</select>

<p><input type="submit" value = "Submit"/></p>
</form>

 </body>
</html>