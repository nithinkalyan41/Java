<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .navbar-nav .nav-link.active {
            background-color: #333;
            color: white;
        }

        #inventory {
            background-color: #979A9A;
        }

        #staff {
            background-color: #AEB6BF;
        }

        #expenses {
            background-color: #D5D8DC;
        }

        #income {
            background-color: #E5E7E9;
        }

        #profile {
            background-color: #F2F3F4;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-light bg-light justify-content-between m-0 p-0" style="background-color: #909497;">
    <a class="navbar-brand">
        <img src="img/logo.png" alt="logo" width="100" height="90" class="d-inline-block align-top"
             style="margin:0">
        <p class="text-center" style="padding:0;margin:0;text-align:center;">Restaurent</p>
    </a>
    <p style="margin:0; padding:0;">
    <h1 class="font-weight-bold">Dashboard</h1></p>
    <form class="form-inline justify-content-between">
        <a class="btn btn-outline-success my-2 my-sm-0 mr-3" href="#">About Us</a>
        <a class="btn btn-outline-success my-2 my-sm-0 mr-3" href="#">Contact us</a>
    </form>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2" style="height:100vh;padding:0;background-color: aqua; ">
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solidwhite; border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('addstaff')">Add Staff</a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white; border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('additems')">Add fooditems </a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white; border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('inventory')">itemslist </a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white;border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('staff')">Staff list</a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white;border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('expenses')">Expenses</a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white;border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('income')">Income</a>
            </nav>
            <nav class="navbar navbar-light bg-dark m-1" style="border: 1px solid white;border-radius:15px;">
                <a class="navbar-brand text-white" href="#" onclick="showDiv('profile')">Manager Profile</a>
            </nav>
        </div>

        <div class="col-md-10" style="margin:0;padding:0; background-image: url('img/pic1.jpg');background-repeat: no-repeat;background-size: cover">
            <div id="inventory" style="display: none">
                <div class="navbar navbar-light bg-dark text-center justify-content-center">
                    <a class="navbar-brand text-white">
                        <h3>Items List</h3>
                    </a>
                </div>
                <div class="table-responsive" style="background-color: #979A9A;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="staff" style="display: none;">
                <div class="navbar navbar-light bg-dark text-center justify-content-center">
                    <a class="navbar-brand text-white">
                        <h3>StaffList</h3>
                    </a>
                </div>
                <div class="table-responsive" style="background-color: #AEB6BF;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="expenses" style="display: none;">
                <div class="navbar navbar-light bg-dark text-center justify-content-center">
                    <a class="navbar-brand text-white">
                        <h3>EXPENSES</h3>
                    </a>
                </div>
                <div class="table-responsive" style="background-color: #D5D8DC;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="income" style="display: none;">
                <div class="navbar navbar-light bg-dark text-center justify-content-center">
                    <a class="navbar-brand text-white">
                        <h3>INCOME</h3>
                    </a>
                </div>
                <div class="table-responsive" style="background-color: #E5E7E9;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="profile" style="display: none;">
                <div class="navbar navbar-light bg-dark text-center justify-content-center" style="border-radius:15px;">
                    <a class="navbar-brand text-white">
                        <h3>MANAGER PROFILE</h3>
                    </a>
                </div>
                <div class="table-responsive" style="background-color: #F2F3F4; border-radius:15px;">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="addstaff" style="display: none; margin:auto;border:1px solid black">
                <div class="navbar navbar-light bg-dark text-center justify-content-center text-white"
                     style="border-radius:15px;">
                    <h1>Enter Staff Details</h1>
                </div>
                <div class="col-md-4" style="margin:auto">
                    <form id="myform" method="post" action="RegisterStaff">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="name" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="age">Age</label>
                            <input type="number" class="form-control" id="age" name="age" required>
                        </div>
                        <div class="form-group">
                            <label for="gender">Gender</label>
                            <select class="form-control" id="gender" name="gender" required>
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="other">Other</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="address">Address</label>
                            <input type="text" class="form-control" id="address" name="address" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="text" class="form-control" id="password" name="password" required>
                        </div>
                        <div class="form-group">
                            <label for="phone">Phone Number</label>
                            <input type="text" class="form-control" id="phone" name="phone" required>
                        </div>
                        <div class="form-group">
                            <label for="salary">Salary</label>
                            <input type="text" class="form-control" id="salary" name="salary" required>
                        </div>
                        <div class="form-group">
                            <label for="designation">Designation</label>
                            <input type="text" class="form-control" id="designation" name="designation" required>
                        </div>
                            <button id="submit" type="submit" class="btn btn-primary">Add</button>
                    </form>

                </div>
            </div>
            <div id="additems" style="display: none; margin:auto;border:1px solid black">
                <div class="navbar navbar-light bg-dark text-center justify-content-center text-white"
                     style="border-radius:15px;">
                    <h1>Enter Item Details</h1>
                </div>
                <div class="col-md-4" style="margin:auto;background: ">
                    <form method="post" action="">
                        <!-- Item Name -->
                        <div class="form-group">
                            <label for="item-name">Item Name</label>
                            <input type="text" class="form-control" id="item-name" name="item-name" required>
                        </div>
                        <!-- Quantity -->
                        <div class="form-group">
                            <label for="quantity">Quantity</label>
                            <input type="number" class="form-control" id="quantity" name="quantity" required>
                        </div>
                        <!-- Price -->
                        <div class="form-group">
                            <label for="price">Price</label>
                            <input type="number" step="0.01" class="form-control" id="price" name="price" required>
                        </div>
                        <!-- Expiry Date -->
                        <div class="form-group">
                            <label for="expiry-date">Expiry Date</label>
                            <input type="date" class="form-control" id="expiry-date" name="expiry-date" required>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary">Add</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Add Inventory Modal -->
<!-- Rest of your HTML code -->

<!-- Add Staff Modal -->
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>" style="display: none">

<%--<!-- Rest of your HTML code -->--%>
<script src="https://cdn.jsdelivr.net/npm/mysql2"></script>
<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script>
    function showDiv(divId) {
        var divs = document.querySelectorAll('[id^="inventory"], [id^="staff"], [id^="expenses"], [id^="income"], [id^="profile"],[id^="addstaff"],[id^="additems"]');
        for (var i = 0; i < divs.length; i++) {
            divs[i].style.display = 'none';
        }
        document.getElementById(divId).style.display = 'block';
    }
    var status = document.getElementById("status").value;
    if(status=="success"){
        swal("Staff Member added successfully");
    }
    else if(status==null || status=="failed"){
        swal("something went wrong");
    }
    else{
    }
</script>

</body>

</html>
