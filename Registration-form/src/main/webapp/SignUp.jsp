<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 26/05/23
  Time: 4:25 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body style="background: url(./img/back.jpg);background-size: cover;background-attachment: fixed;">
        <div class="container">
            <div class="row">
                    <div class="col m6 offset-m3">
                        <div class="card">
                            <div class="card-content">
                                <h3 style="margin-top:10px;" class="center-align">Register Here!!</h3>
                                <div class="form center-align">
                                    <form action="register" method="post">
                                        <input type="text" name="user_name" placeholder="Enter name">
                                        <input type="password" name="user_password" placeholder="Enter password">
                                        <input type="email" name="user_email" placeholder="Enter email">
                                        <button type="submit" class="btn"> SUBMIT</button>
                                    </form>
                                </div>
                                <div class="loader center-align" style="margin-top:10px; display: none">
                                    <div class="preloader-wrapper big active">
                                        <div class="spinner-layer spinner-blue">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                        </div>

                                        <div class="spinner-layer spinner-red">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                        </div>

                                        <div class="spinner-layer spinner-yellow">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                        </div>

                                        <div class="spinner-layer spinner-green">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div><div class="gap-patch">
                                            <div class="circle"></div>
                                        </div><div class="circle-clipper right">
                                            <div class="circle"></div>
                                        </div>
                                        </div>

                                    </div>
                                    <h5>Please Wait...</h5>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
        <script
                src="https://code.jquery.com/jquery-3.7.0.min.js"
                integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
                crossorigin="anonymous"></script>
        <script>
            $(document).ready(function (){
                console.log("page is ready")
            })
        </script>
</body>
</html>
