/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-26 05:24:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kfc.model.User;
import com.kfc.model.Orders;
import com.kfc.daoimpl.OrdersDaoImpl;
import java.util.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kfc.model.Orders");
    _jspx_imports_classes.add("com.kfc.daoimpl.OrdersDaoImpl");
    _jspx_imports_classes.add("com.kfc.model.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Cart KFC</title>\r\n");
      out.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<style >\r\n");
      out.write("body {\r\n");
      out.write("\t\tbackground: linear-gradient(to bottom right, #BDB76B, white);\r\n");
      out.write("}\r\n");
      out.write(".topnav {\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tbackground-color: rgb(0, 0, 0);\r\n");
      out.write("\tsize: 500px;\r\n");
      out.write("\twidth: 1200px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tmargin-top: -110px;\r\n");
      out.write("\tmargin-left: 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 20px 20px;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav-right {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\talign-self: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".downnav {\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tbackground-color: rgb(0, 0, 0);\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("\t/* size: 300px; */\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".downnav a {\r\n");
      out.write("\tfloat: center;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tpadding: 20px 20px;\r\n");
      out.write("\tcolor: blanchedalmond;\r\n");
      out.write("}\r\n");
      out.write(".moveTop {\r\n");
      out.write("\twidth: 1198 px;\r\n");
      out.write("\tmargin-left: 150px;\r\n");
      out.write("\tmargin-top: -90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\tbackground-color: #0000FF;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tcolor: #FFFAFA;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 23px;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\ttransition: all 0.5s;\r\n");
      out.write("\tcursor: move;\r\n");
      out.write("\tmargin: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button span {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttransition: 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button span:after {\r\n");
      out.write("\tcontent: '\\00bb';\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\topacity: 10;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tright: -20px;\r\n");
      out.write("\ttransition: 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover span {\r\n");
      out.write("\tpadding-right: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover span:after {\r\n");
      out.write("\topacity: 1;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	String pName=request.getParameter("pname");
	int userId=Integer.parseInt(request.getParameter("userId"));
	OrdersDaoImpl orderDao = new OrdersDaoImpl();
	Orders order = new Orders();
	order.setUserId(userId);
	List<Orders> showOrders;
	showOrders = orderDao.showOrders(order);
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
User user=(User)session.getAttribute("currentUser"); 
      out.write("\r\n");
      out.write("<!--logoImage -->\r\n");
      out.write("\t<img src=\"image/KFC Logo2.png \" width=\"150px\" height=\"100px\"margin-top: \"20px\" >\r\n");
      out.write("\t<!-- navbar-->\r\n");
      out.write("\t<div class=\"moveTop\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid justify-content-between\">\r\n");
      out.write("\t\t\t\t<!-- Left elements -->\r\n");
      out.write("\t\t\t\t<a class=\"nav-link d-sm-flex align-items-lg-center\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"https://mdbcdn.b-cdn.net/img/new/avatars/1.webp\"\r\n");
      out.write("\t\t\t\t\tclass=\"rounded-circle\" height=\"25\" alt=\"image for b/w\" /> <strong\r\n");
      out.write("\t\t\t\t\tclass=\"d-none d-sm-block ms-7\">");
      out.print(user.getUserName());
      out.write("</strong>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"d-flex\">\r\n");
      out.write("\t\t\t\t\t<a href=\"mainPage.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-light button\">Home</button>\r\n");
      out.write("\t\t\t\t\t</a> <a class=\"\" href=\"showProducts.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-light  button\">Menu</button>\r\n");
      out.write("\t\t\t\t\t</a> <a href=\"showOrders.jsp?userId=");
      out.print(user.getUserId());
      out.write("\"><button\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-light button\">My Orders</button></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Search form -->\r\n");
      out.write("\t\t\t\t\t<form action=\"searchProduct\" class=\"input-group w-auto\">\r\n");
      out.write("\t\t\t\t\t\t<input autocomplete=\"off\" type=\"search\" name=\"search\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control \" placeholder=\"search by meal\" />\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-dark btn-sm\">search</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Left elements -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Center elements -->\r\n");
      out.write("\t\t\t\t<a href=\"cart.jsp?userId=");
      out.print(user.getUserId());
      out.write("\"><button\r\n");
      out.write("\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-light button\">My Cart</button></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Center elements -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Right elements -->\r\n");
      out.write("\t\t\t\t<a href=\"login.jsp\"><button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-light button\">Logout</button></a>\r\n");
      out.write("\t\t\t\t<!-- Right elements -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Navbar --> <br>\r\n");
      out.write("\t\t\t<h3><b><i>Your Cart</i> </b></h3>\r\n");
      out.write("\t");

	int count = 0;
	
	for (Orders cart : showOrders) {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<td>\r\n");
      out.write("\t\t<table id=\"cartTable\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<span><b>Product Name:  ");
      out.print(cart.getProductName() );
      out.write("<b></b></span> <br>\r\n");
      out.write("\t\t\t\t\t\t<span><b>Product Price: ");
      out.print(cart.getPrice() );
      out.write("</b></span><br>\r\n");
      out.write("\t\t\t\t\t\t<span>Quantity:");
      out.print(cart.getQuantity() );
      out.write("</span> <a href=\"updateCart.jsp?pname=");
      out.print(cart.getProductName());
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" >Update</button></a><br> \r\n");
      out.write("\t\t\t\t\t\t<span> Total Price: ");
      out.print(cart.getTotalPrice());
      out.write("</span><br>\r\n");
      out.write("\t\t\t\t\t\t\t<span> <a href=\"delCart.jsp?pname=");
      out.print(cart.getProductName());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger btn-sm\">Remove</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t \t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</td> <br>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	count++;

	if (count == 4) {
	
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t");

		count = 0;

		}
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t ");
int userId1=(int)session.getAttribute("userId");
		Orders orders=new Orders();
		orders.setUserId(userId1);
		double totalPrice=orderDao.sumOfPrice(order);
		session.setAttribute("totalPrice", totalPrice);
	 
      out.write("\r\n");
      out.write("\t<span> <a href=\"payment.jsp?userId=");
      out.print(order.getUserId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-sm\" value=\"");
      out.print(totalPrice);
      out.write('"');
      out.write('>');
      out.print(totalPrice);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
session.setAttribute("userId",order.getUserId()); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("<span> <a href=\"deleteCart.jsp?userId=");
      out.print(order.getUserId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-dark btn-sm\">Clear Cart</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
session.setAttribute("userId",order.getUserId()); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
