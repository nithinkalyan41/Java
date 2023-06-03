<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/gallery.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    

    <title>e-Bike Gallery</title>
</head>
<body>
    <div class="Container1">
        <div class="image">
            <img src="images/logo-new.png" alt="logo" class="logo">
            </div>
            <ul class="list">
                <li><a href="home.jsp"><Button name="Home" class="button">Home</Button></a></li>
                    <li><Button name="About us" class="button">About us</Button></li>
                <li><a href="login.jsp"><button name="LogOut" class ="button">LogOut</button></a></li>
                    </ul>
        </div>  
    </div> 
    <div class="second">
        <div class="slider"> 
            <div class="swiper">
            <!-- Additional required wrapper -->
            <div class="swiper-wrapper">
              <!-- Slides -->
              <div class="swiper-slide"><img src="images/Flash-gallery-5.png" alt="1"></div>
              <div class="swiper-slide"><img src="images/Flash-gallery-6.png" alt="2"></div>
              <div class="swiper-slide"><img src="images/Flash-gallery-7.png" alt="3"></div>
              <div class="swiper-slide"><img src="images/Flash-gallry-thumb-1.png" alt="3"></div>
              <div class="swiper-slide"><img src="images/Flash-gallry-thumb-2.png" alt="3"></div>
              <div class="swiper-slide"><img src="images/Flash-thumbnail.png" alt="3"></div>
            </div>
            <!-- If we need pagination -->
            <div class="swiper-pagination"></div>
            <!-- If we need navigation buttons -->
            <div class="swiper-button-prev"></div>
            <div class="swiper-button-next"></div>
          </div>
        
        </div>
        <div class="info">
            <div class="bike-tit">
                <p class = "pline">Comfort Speed (LX)</p>
                <h2 class="tit" style="color:rgb(255, 89, 95); font-weight:bold">Hero Electric Flash LX</h2>
            </div>
            <div class="details">
                <div class="specs">
                    <div>
                <h2 style="color:rgb(255, 89, 95); background-color: #2ECC71; border-radius: 10px; font-weight:bold">Specifications</h2>
                <ul>
                    <li>Top speed 25kmph</li>
                    <li>85KM/C</li>
                    <li>4 to 5HRS full charge</li>
                    <li>250W Watts Motor power</li>
                    <li>51.2V/30Ah battery capacity</li>
                </ul>
                </div>
                
                <div class="price">
                    <h3>PRICE <br>
                        ₹ 59,640</h3>
                </div>
                </div>
                <div class="features">
                    <h2 style="color:rgb(255, 89, 95); background-color: #2ECC71; border-radius: 10px; font-weight:bold">Key Features</h2>
                    <ul>
                        <li><h5>Digital Instrument Cluster</h5>
                            the modern and stylish digital instrument cluster. </li>
                        <li><h5>Alloy Wheels</h5>
                            Ride in style with alloy wheels lighter and more stable.</li>
                        
                        <li><h5>Telescopic Suspension</h5>
                            Improve your ride quality with telescopic suspension. 
                            </li>
                    </ul>

                </div>
                    
            </div>
            
            <div class="btn" style="margin-left:20px;padding:0;">
                <button class="Order" name ="order">ORDER NOW</button>
            </div>
        </div>
    </div>
    <div class="finalcontainer">
        <div class="line">

        </div>
        <div class="elements">
        <div class="About">
            
            <ul class="lis">
                <h3>About</h3>
                <li>About us</li>
                <li>Products</li>
                <li>Archieved Products</li>
            </ul>
        </div>
        <div class="Purchase">
            
            <ul class="lis">
                <h3>Purchase</h3>
                <li>Book a product</li>
                <li>Test Ride</li>
                <li>Battery Safety</li>
            </ul>
        </div>
        <div class="media">
            
            <ul class="lis">
            <h3>Media</h3>
            <li>News</li>
            <li>videos</li>
            <li>Blogs</li>
            </ul>
        </div>
        <div class="Institutional-Customer">
            <ul class="lis">
                <h3>Institutional Customer</h3>
                <li>India</li>
                <li>Global</li>
                <li>UnitedStates</li>
            </ul>
        </div>
        
     </div>
     <div class="line1">
        </div>
        <p style="padding:0px;margin:0;">©All Copyrights reserved @MCA-2023 Minor Project </p>

     </div>
    <script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
    <script>
        const swiper = new Swiper('.swiper', {
            autoplay:{
                delay:3000,
                disableOnInteraction:false,

            },
            loop: true,
            pagination: {
                el: '.swiper-pagination',
                clickable:true,
                 },
            navigation: {
                nextEl: '.swiper-button-next',
                prevEl: '.swiper-button-prev',
                 },
        });
    </script>
</body>
</html>