<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .order-popup {
  display: none;
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
}

.order-popup h2 {
  margin-top: 0;
}

.order-popup p {
  margin-bottom: 0;
}
    </style>
</head>
<body>
    <div id="container">
        
        <div class="image">
        <img src="./images/logo-new.png" alt="logo" class="logo">  
        </div>
        <ul class="list">
                <li><Button name="Locate" class="button locate" >locate us</Button></li>
                <li><Button name="About us" class="button">About us</Button></li>
                <li><button name="Login" class ="button">Logout</button></li>
                </ul>
    </div>  
    <div id="orderPlacedPopup" class="order-popup">
        <h2>Order Placed!</h2>
        <p>Your order has been successfully placed.</p>
      </div>
    
    <script>
        // Add this JavaScript code to show and hide the order placed popup
window.addEventListener('DOMContentLoaded', function() {
  var popup = document.getElementById('orderPlacedPopup');

  // Function to show the popup
  function showPopup() {
    popup.style.display = 'block';
  }

  // Function to hide the popup
  function hidePopup() {
    popup.style.display = 'none';
  }

  // Show the popup after a delay (e.g., 3 seconds)
  setTimeout(showPopup, 500);

  // Hide the popup when the user clicks outside of it
  window.addEventListener('click', function(event) {
    if (event.target === popup) {
      hidePopup();
    }
  });
});

    </script>
</body>
</html>