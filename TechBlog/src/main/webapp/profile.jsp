<%@ page import="com.techblog.entites.User" %><%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 05/06/23
  Time: 4:44 pm
  To change this template use File | Settings | File Templates.
--%>
<%@page errorPage="errorpage.jsp" %>
<%
  User user = (User)session.getAttribute("currentUser");
  if(user==null){
    response.sendRedirect("login.jsp");
  }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
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
    <%--nav-bar--%>
    <nav class="navbar navbar-expand-lg navbar-dark primary-background">
        <a class="navbar-brand" href="index.jsp"><span class="fa fa-compass"></span> Techblog</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#"> <span class="fa fa-cube"></span> Learn To Code <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <span class="fa fa-ellipsis-v"></span>  categories
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Programming language</a>
                        <a class="dropdown-item" href="#">Programming Implementaion</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">data Stuctures</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">contact</a>
                </li>

            </ul>
            <ul class="navbar-nav mr-right">
                <li class="nav-item">
                    <a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-modal" ><span class="fa fa-user-circle"></span><%= user.getName() %></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout"><span class=""></span>Log Out</a>
                </li>
            </ul>
        </div>
    </nav>
        <%--end-of-navbar--%>
            <%--Start of profile modal--%>
    <!-- Button trigger modal -->

    <!-- Modal -->
    <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header primary-background text-white text-center">
                    <h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="container text-center">
                        <%=user.getProfile()%>
                        <h5 class="modal-title" id="exampleModelLabel"><%=user.getName()%></h5>
                        <div id="profile-details">
                            <table class="table">
                            <tbody>
                            <tr>
                                <th scope="row">ID:</th>
                                <td><%= user.getId() %></td>
                            </tr>
                            <tr>
                                <th scope="row">E-mail:</th>
                                <td><%= user.getEmail()%></td>

                            </tr>
                            <tr>
                                <th scope="row">Gender:</th>
                                <td><%= user.getGender()%></td>
                            </tr>
                            <tr>
                                <th scope="row">Status:</th>
                                <td><%= user.getAbout()%></td>
                            </tr>
                            <tr>
                                <th scope="row">registered on:</th>
                                <td><%= user.getDateTime().toString() %></td>
                            </tr>
                            </tbody>
                            </table>
                        </div>
                        <div id="profile-edit">




                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" id="edit-profile-button" class="btn btn-primary">Edit</button>
                </div>
            </div>
        </div>
    </div>

            <%-- end of profile modal--%>



    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function (){
            let editStatus = false;

            $('#edit-profile-button').click(function(){
            $('#profile-details').hide()
            $('#profile-edit').show()
 


            })
        });




    </script>
</body>
</html>
