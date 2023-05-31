<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="css/index.css">

    <!-- Compiled and minified JavaScript -->
    
</head>
<body>
    <div id="container">
        
        <div class="image">
        <img src="./images/logo-new.png" alt="logo" class="logo">  
        </div>
        <ul class="list" style="justify-content: left;">
            <li style="margin-left:10px;"><Button name="Home" class="button home" >Home</Button></li>
            <li style="margin-left:10px;"><Button name="About us" class="button">About us</Button></li>
        </ul>
    </div>  
  <div class="container" style="margin-top:30px;">
    <div class="row">
            <div class="col m6 offset-m3">
                <div class="card">
                    <div class="card-content">
                        <h3 style="margin-top:10px;" class="center-align">Register Here!!</h3>
                        <h5 id="msg" class="center-align"></h5>
                        <div class="form center-align">
                          <img src="images/icons-for-free-137530.png" alt="icon" style="width:40%">
                            <form action="register" method="post" id="Myform">
                                <input type="text" name="user_name" placeholder="Enter name">
                                <input type="password" name="user_password" placeholder="Enter password">
                                <input type="email" name="user_email" placeholder="Enter email">
                                 <input type="text" name="user_address" placeholder= "Enter adderss">
                                 <input type="text" name="user_phone" placeholder="Enter phone number">

                                <button type="submit" class="btn"> SUBMIT</button>
                            </form>
                        </div>
                     
                    
                  </div>
                
              </div>        
                        
    </div>
</div>
</body>
</html>