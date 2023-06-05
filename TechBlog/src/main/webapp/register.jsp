<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 04/06/23
  Time: 12:38 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
  <link rel="stylesheet" href="css/mystyle.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <style>
    .banner-background{
      clip-path: polygon(50% 0%, 100% 0, 100% 99%, 75% 93%, 39% 100%, 0 93%, 0 0);
    }
  </style>
</head>
<body>
        <%@include file="normal_navbar.jsp"%>
      <main class="primary-background p-5 banner-background" style="padding-bottom: 50px">
        <div class="container">
          <div class="col-md-6 offset-md-3">
              <div class="card">
                <div class="card-header text-center primary-background text-white">
                  <span class="fa fa-3x fa-user-plus "></span>
                    <p>Register Here!!!</p>
                </div>
                <div class="card-body">
                  <form id="myform" action="registration" method="POST">
                    <div class="form-group">
                      <label for="username">username</label>
                      <input type="text" name="user_name"  class="form-control" id="username" aria-describedby="emailHelp" placeholder="Enter name">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Email address</label>
                      <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Password</label>
                      <input type="password" name="user_password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">select gender</label><br>
                      <input type="radio"  name="gender" value="male">male
                      <input type="radio"  name="gender" value="female">female
                    </div>
                    <div class="form-group">
                      <textarea  class="form-control" name="about" id="" cols="30" rows="5" placeholder="Enter something about yourself"></textarea>
                    </div>
                    <div class="form-check">
                      <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                      <label class="form-check-label" for="exampleCheck1">Agree terms and conditions</label>
                    </div>
                    <br>
                    <div class="container text-center" id="loader" style="display: none;">
                    <span class="fa fa-refresh fa-spin fa-3x" ></span>
                      <h4>Please wait.....</h4>
                    </div>
                    <br>
                    <button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
                  </form>
                </div>

              </div>
          </div>
        </div>
      </main>



<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>
          $(document).ready(function(){
            console.log("loaded........")
                $('#myform').on('submit',function(event){
                  event.preventDefault();
                   let form = new FormData(this);
                   $("#submit-btn").hide();
                   $("#loader").show();

                   //send register servlet
                   $.ajax({
                     url:"registration",
                     type:'POST',
                     data:form,
                     success:function(data,textStatus,jqXHR){
                       console.log(data)
                       $("#submit-btn").show();
                       $("#loader").hide();
                       if(data.trim()==="done") {
                         swal("registered Successfully We are redirecting to Login page.")
                                 .then((value) => {
                                   window.location = "login.jsp"
                                 });
                       }
                       else{
                         swal(data);
                       }


                     },
                     error:function(jqXHR,textStatus,errorThrown){
                        console.log(jqXHR)
                       swal("Something Went Wrong")
                       $("#submit-btn").show();
                       $("#loader").hide();

                     },
                     processData:false,
                     contentType:false
                   });
                });
          });

        </script>
</body>
</html>
