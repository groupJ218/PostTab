<%@ page import="models.Product" %><%--
  Created by IntelliJ IDEA.
  User: 33558
  Date: 2/19/2019
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8"/>
    <title>Bootstrap Sales Page.</title>
    <meta name="author" content=""/>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<header class="container">
    <div class="row">
        <div class="col-md-10 col-md-offset-1">
            <% Product product = (Product) request.getAttribute("product");%>
            <h1><%= product.getName() %>
            </h1>
            <p class="lead"><%= product.getPrice()%>
            </p>
        </div>
    </div>
</header>

<div class="container">
    <div class="row">
        <div class="col-xs-12 col-md-4 col-md-offset-1">
            <p>
                <strong>Description</strong>
                <%=product.getDescription()%>
            </p>
            <p>
                <em><strong><u>Back -></u>
                    <a href="/Post_TAB/products"> to Products.</a></strong></em>
            </p>
        </div>
        <div class="col-xs-12 col-md-6">
            <figure class="text-center">
                <img src="http://placehold.it/400x300" alt="The Amazing Product" class="img-thumbnail"/>
            </figure>
        </div>
    </div>
    <hr/>
</div>
</body>
</html>