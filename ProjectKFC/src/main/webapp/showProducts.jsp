<%@page import="com.kfc.daoimpl.ProductDaoImpl"%>
<%@page import="com.kfc.model.Products"%>

<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KFC's Meals</title>

</head>
<body>
	<%ProductDaoImpl products = new ProductDaoImpl();
	List<Products> showProduct;
	
	showProduct = products.showProduct();
	%>
	<p>
					<b>Product list</b>
				</p>
	<table>
		<tbody>
			<tr>
				
			 <%
 int count = 0;
			 int i=showProduct.size();
 for (Products meals : showProduct) {
 %>

					<td>
						<table id="productTable">
							<tbody>
								<tr>

									<td><span>Meal name: <%=meals.getProductName()%>
									</span><br> <span> meal Description: <%=meals.getDescription()%>
									</span><br> <span>meal price: <%=meals.getPrice()%>
									</span><br> <span>Meal Type:<%=meals.getProductType()%>
									</span><br> <span>Meal Status:<%=meals.getProductStatus()%></span><br>

										<span>
										 
										<a href="product.jsp" >	<button type="submit"  >Add Cart</button></a>
									</span></td>
								</tr>
							</tbody>
						</table>

				</td> 
<%
 count++;

 if (count == 2) {
 %>
			</tr>
			<tr>
				<%
				count = 0;

				}
				}
				%>

			</tr>
		</tbody>
	</table>


</body>
</html>
