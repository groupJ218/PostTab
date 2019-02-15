<%--
  Created by IntelliJ IDEA.
  User: 33558
  Date: 1/11/2019
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">--%>
      <link href="bootstrap-4.0.0-alpha.6-dist/css/bootstrap.css" rel="stylesheet" />

      <%--<link href="bootstrap-4.0.0-alpha.6-dist/css/bootstrap-theme.css" rel="stylesheet" />--%>
      <%--<link rel="stylesheet" href="bootstrap-4.0.0-alpha.6-dist/css/bootstrap.css/bootstrap.min.css">--%>
  </head>
  <body>
  <div class="container" style="margin-top:15px ">
      <form action="/Post_TAB/main" method="post">
          <div class="row">
              <div class="col-1">Email</div>
              <div class="col-4"><input name="email" class="padding-left" type="email" placeholder="email"/></div>
          </div>
          <div class="row">
              <div class="col-1">Password:</div>
              <div class="col-11"><input name="pass" class="padding-left" type="password" placeholder="password"/></div>
          </div>
          <div class="row">
              <div class="col-1">Press:</div>
              <div class="col-4"><input type="submit" value="Login"></div>
          </div>
      </form>
  </div>
  <div>
    <a href="/Post_TAB/rightsGetAll" >Show all rights</a>
  </div>
  <div>
    <a href="/Post_TAB/products">Show all Products</a>
  </div>
  <%--<script src="bootstrap-4.0.0-alpha.6-dist/js/bootstrap.min.js"></script>--%>
  </body>
</html>
