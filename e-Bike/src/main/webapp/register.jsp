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
                        <input type="hidden" id="status" value="<%= request.getAttribute("Status") %>">
                        <div class="form center-align">
                          <img src="images/icons-for-free-137530.png" alt="icon" style="width:40%">
                            <form action="registration" method="post" id="Myform">
                                <input type="text" name="user_name" placeholder="Enter name">
                                <input type="password" name="user_password" placeholder="Enter password">
                                <input type="email" name="user_email" placeholder="Enter email">
                                 <input type="text" name="user_address" placeholder= "Enter address">
                                 <input type="text" name="user_phone" placeholder="Enter phone number">

                                <button type="submit" class="btn"> SUBMIT</button>
                                <br>
                                <a href="login.jsp">Click here to login</a>
                            </form>
                        </div>
                     
                    
                  </div>
                
              </div>        
                        
    </div>
 </div>
  </div>
    <script type="text/javascript">
        var stat = document.getElementById("status").value;
        document.getElementById("msg").innerText=" ";
        if(stat === "success"){
           document.getElementById("msg").innerText="Sucessfully Registered";
        }





    </script>
     <%-- <script
              src="https://code.jquery.com/jquery-3.7.0.min.js"
              integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
              crossorigin="anonymous"></script>
      <script>
          $(document).ready(function (){
              console.log("page is ready")
              $("#Myform").on('submit',function (event){
                  event.preventDefault();
                  //var f = $(this).serialize();
                  let f = new FormData(this);
                 /* console.log(f);
                  $(".loader").show();
                  $(".form").hide();*/
                  $.ajax({
                      url:"registration",
                      data:f,
                      method:'POST',
                      success:function (data,textStatus,jqXHR){
                          console.log("success");
                          if(data.trim()==='DONE'){
                              $("#msg").html("SUCESSFULLY REGISTERED");
                              $("#msg").addClass('green-text');
                          }
                          else{
                              $("#msg").html("SOMETHING WENT WRONG");
                              $("#msg").addClass('red -text');
                          }
                      },
                      error:function (jqXHR,textStatus,errorThrown){
                          console.log("error");
                          $("#msg").html("SOMETHING WENT WRONG");
                          $("#msg").addClass('red-text');
                      },
                      processData: false,
                      contentType:false
                  })
              })
          });
      </script>--%>

</body>
</html>