<%@page import="com.kfc.model.Products"%>
<%@page import="com.kfc.daoimpl.ProductDaoImpl"%>
<%@page import="com.kfc.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <% String pName = request.getParameter("pname"); 
  ProductDao productDao = new ProductDaoImpl();
Products product = new Products();
product.setProductName(pName);
Products meal = productDao.validateProduct(pName);
int userId=(int)session.getAttribute("userId");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update cart Kfc</title>
</head>
<body>
	
	<h2><%=pName %></h2>
	<h2><%=userId %></h2>
	<%if (meal!=null){ %>
	<form action="upateCart" method="post">
		<div>
			Enter how many quantity you want: <input type="number" name="quantity" >
			<%session.setAttribute("price", meal.getPrice()); %>
			<%session.setAttribute("productId", meal.getProductId()); %>
			<button type="submit">Submit</button>
		</div>
		<h1><%= meal.getPrice() %></h1>
		
	</form>
	
	<%} %>
	
</body>
</html>