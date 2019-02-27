<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="models.Product" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 33558
  Date: 2/14/2019
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Product Page</title>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet"
          id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>

<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div class="row">
        <ul class="thumbnails">
            <c:forEach items="${products}" var="product">
                <li class="span4">
                    <div class="thumbnail">
                        <img src="http://placehold.it/320x200" alt="ALT NAME">
                        <div class="caption">
                            <h3>${product.getName()}</h3>
                            <p>${product.getDescription()}</p>
                            <p align="center"><a href="/Post_TAB/products/product?id=${product.getId()}"
                                                 class="btn btn-primary btn-block">Open</a></p>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>
