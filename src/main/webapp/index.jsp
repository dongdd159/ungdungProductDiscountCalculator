<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/21/2021
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount</h2>
<form action="/display-discount" method="post">
  <input type="text" name="Des" placeholder="Enter Product Description: "/><br/>
  <input type="text" name="Price" placeholder="Enter Price: "><br/>
  <input type="text" name="Dis" placeholder="Enter Discount Percent: "><br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
