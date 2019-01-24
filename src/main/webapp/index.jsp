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
      <link rel="stylesheet" href="bootstrap-4.0.0-alpha.6-dist/css/bootstrap.css/bootstrap.min.css">
  </head>
  <body>
  text
  <div class="container">
      <form action="/login" method="post">
          <div class="row">
              <div class="col-1">Email</div>
              <div class="col-4"><input class="padding-left" type="email" placeholder="email"/></div>
          </div>
          <div class="row">
              <div class="col-1">Password:</div>
              <div class="col-11"><input class="padding-left" type="password" placeholder="password"/></div>
          </div>
          <div class="row">
              <div class="col-1">Press:</div>
              <div class="col-4"><input type="submit" value="Login"></div>
          </div>
      </form>
  </div>
  </body>
</html>
