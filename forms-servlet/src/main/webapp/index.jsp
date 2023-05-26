<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>FORM</title>
  <style>
    .container{
      width:40%;
      margin:0 auto;
      border: 2px solid rgb(15,150,215);
      display: flex;
      flex-direction: column;
      align-items: center;
      background: darkorange;
      padding: 20px;
    }
  </style>
</head>
<body>
<div class="container">
<h1>FILL THE FORM</h1>
<form action="register" method="post">
  <table>
    <tr>
      <td>Enter your name:</td>
      <td><input type="text" name="user_name" placeholder="enter name"></td>
    </tr>
    <tr>
      <td>Enter password:</td>
      <td><input type="password" name="user_password" placeholder="enter passeword"></td>
    </tr>
    <tr>
      <td>Enter e-mail:</td>
      <td><input type="email" name="user_email" placeholder="enter email"></td>
    </tr>
    <tr>
      <td>Enter Gender:</td>
      <td><input type="radio" name="user_gender" value="male">Male &nbsp; &nbsp; <input type="radio" name="user_gender" value="female">Female</td>
    </tr>
    <tr>
      <td>Select Course</td>
      <td><select name="user_course">
        <option value="java">JAVA</option>
        <option value="python">PYTHON</option>
        <option value=".net">.Net</option>
        <option value="golang">Golang</option>
      </select></td>
    </tr>
    <tr>
      <td style="text-align: right;"><input type="checkbox" name="condition" value="checked"></td>
      <td>Agree terms and conditions</td>
    </tr>
    <tr>
      <td>

      </td>
      <td><button type="submit">Register</button>
          <button type="reset">Reset</button>
      </td>

    </tr>

  </table>
</form>
</div>

</body>
</html>