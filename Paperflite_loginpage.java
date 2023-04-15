package javaprogram;

public class Paperflite_loginpage {
	

	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <title>Glassmorphism login Form Tutorial in html css</title>
	 
	    <link rel="preconnect" href="https://fonts.gstatic.com">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
	    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
	    <!--Stylesheet-->
	    <style media="screen">
	      *,
	*:before,
	*:after{
	    padding: 0;
	    margin: 0;
	    box-sizing: border-box;
	}
	body{
	    background-color: #080710;
	     width: 100px;
	    height: 100px;
	    background: url("https://marketplace.zoho.com/view/extnbaner/1507a50f-c113-4ec1-b736-eabeac342a9e") no-repeat top center;
	    background-size: cover;
	}
	.background{
	    
	}
	.background .shape{
	    height: px;
	    width: px;
	    position: absolute;
	    border-radius: 50%;
	}
	.shape:first-child{
	    background: linear-gradient(
	        #1845ad,
	        #23a2f6
	    );
	    left: -80px;
	    top: -80px;
	}
	.shape:last-child{
	    background: linear-gradient(
	        to right,
	        #ff512f,
	        #f09819
	    );
	    right: -30px;
	    bottom: -80px;
	}
	form{
	    height: 520px;
	    width: 400px;
	    background-color: rgba(255,255,255,0.13);
	    position: absolute;
	    transform: translate(-50%,-50%);
	    top: 45%;
	    left: 50%;
	    border-radius: 10px;
	    backdrop-filter: (px);
	    border: 2px solid rgba(255,255,255,0.1);
	    box-shadow: 0 0 40px rgba(8,7,16,0.6);
	    padding: 50px 35px;
	}
	form *{
	    font-family: 'Poppins',sans-serif;
	    color: #1c2833;
	    letter-spacing: 0.5px;
	    outline: none;
	    border: none;
	}
	form h3{
	    font-size: 32px;
	    font-weight: 500;
	    line-height: 42px;
	    text-align: center;
	}

	label{
	    display: block;
	    margin-top: 30px;
	    font-size: 16px;
	    font-weight: 500;
	}
	input{
	    display: block;
	    height: 50px;
	    width: 100%;
	    background-color: rgba(28, 40, 51,0.15);
	    border-radius: 3px;
	    padding: 0 10px;
	    margin-top: 8px;
	    font-size: 14px;
	    font-weight: 300;
	}
	::placeholder{
	    color: #e5e5e5;
	}
	button{
	    margin-top: 50px;
	    width: 100%;
	    background-color: #ffffff;
	    color: #1c2833;
	    padding: 15px 0;
	    font-size: 18px;
	    font-weight: 600;
	    border-radius: 5px;
	    cursor: pointer;
	}
	.social{
	  margin-top: 30px;
	  display: flex;
	}
	.social div{
	  background: red;
	  width: 150px;
	  border-radius: 6px;
	  padding: 5px 10px 10px 5px;
	  background-color: rgba( 28, 40, 51 ,0.45);
	  color: #eaf0fb;
	  text-align: center;
	}
	.social div:hover{
	  background-color: rgba( 28, 40, 51 );
	}
	.social .fb{
	  margin-left: 25px;
	}
	.social i{
	  margin-right: 4px;
	}

	    </style>
	</head>
	<body>

	<form action ="addUser">

	    <div class="background">
	        <div class="shape"></div>
	        <div class="shape"></div>
	    </div>
	    <form>
	        <h3>Login Here</h3>

	        <label for="username">Username</label>
	        <input type="text" placeholder="Email or Phone" name="username" id="username" required>

	        <label for="password">Password</label>
	        <input type="text" placeholder="Password" name="Password" id="Password" required>

	        <a href="http://www.paperflite.com/"><button>Log In</button></a>
	        
	        
	        
	        <div class="social">
	          <div class="go"><i class="fab fa-google"></i>  Google</div>
	          <div class="fb"><i class="fab fa-facebook"></i>  Facebook</div>
	        </div>
	    </form>
	</body>
	</html>





}
