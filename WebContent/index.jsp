<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<form action="rest/sample/order" method="post">
Enter user name : <input type="text" name="username"></input> </br>
Enter Quantity<input type="text" name="qty"></input> </br>
Enter product <input type="text" name="prod"></input> </br></br></br>
<button type="submit"> Submit</button>
</form>

<form action="rest/account/add" method="post">
Enter acccount id :
<input name="prod_id" type="text"> </input>
<input type="submit" value = "Add Product">
</form>

</body>
</html>