<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 04/06/23
  Time: 12:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
  <link rel="stylesheet" href="css/mystyle.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <style>
    .banner-background{
      clip-path: polygon(50% 0%, 100% 0, 100% 99%, 75% 93%, 39% 100%, 0 93%, 0 0);
    }
  </style>
</head>
        <%@include file="normal_navbar.jsp"%>
        <main class="d-flex align-items-center primary-background banner-background" style="height: 70vh">
          <div class="container">
            <div class="row">
              <div class="col-md-4 offset-md-4">
                <div class="card">
                  <div class="card-header primary-background text-white text-center">
                    <span class="fa fa-user-plus fa-3x"></span>
                    <br>
                    <p>log in here</p>
                  </div>
                  <div class="card-body">
                    <form action="login" method="post">
                      <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input  name="email" required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                        <small  id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                      </div>
                      <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input  name="password" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                      </div>
                      <div class="container text-center">
                      <button type="submit" class="btn btn-primary">Submit</button>
                      </div>
                    </form>
                  </div>
                </div>

              </div>
            </div>
          </div>
        </main>
<body>





<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
