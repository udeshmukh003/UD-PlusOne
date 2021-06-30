<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="zxx">

<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<head>
	<title>Matrimony Login Form Responsive Widget Template :: w3layouts</title>
	
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Matrimony Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
		
		
		function validate() {
			/* alert("validated"); */
			var c = /^[A-Za-z]+$/;
			var n = /^[0-9]+$/;
			var u = document.getElementById("Name").value;
			var p = document.getElementById("Password").value;

			if (u ==  " " && u.length > 10 || p == " " && p.length > 10) 
			{
				text = "fail";
				alert("Name must be filled out or Uname must be Character");
				return false;
			} 
			else if (u.match(c) || p.match(n))
			{
				text = "Successfully createeee";
				return true;
			} 
			else
			{
				alert("Invalid Input");
				return false;
			}
		}
	
		
	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/fontawesome-all.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	<!-- web-fonts -->
	<link href="//fonts.googleapis.com/css?family=Tangerine:400,700" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=cyrillic,latin-ext"
	    rel="stylesheet">
	<!-- //web-fonts -->
	
</head>

<body>
	<!-- title -->
	<h1>Matrimony Login Form</h1>
	<!-- //title -->

	<!-- content -->
	<div class="sub-main-w3">
		<form action="login" method="post" onchange="return validate()">
			<h2>login Now
				<i class="fas fa-level-down-alt"></i>
			</h2>
			<div class="form-style-agile">
				<label>
					Username
					<i class="fas fa-user"></i>
				</label>
				<input placeholder="Username" name="unm" type="text" required="" id="Name" >
			</div>
			<div class="form-style-agile">
				<label>
					Password
					<i class="fas fa-unlock-alt"></i>
				</label>
				<input placeholder="Password" name="pwd" type="password" required="" id="Password">
			</div>
			<!-- checkbox -->
			<div class="wthree-text">
				<ul>
					<li>
						<label class="anim">
							<!-- <input type="checkbox" class="checkbox" required="">
							<span>Remember me</span> -->
							<p>Select Domain</p>
							<select name="loginSelect">
							<option>User</option>
							<option>Administration</option>
							</select>
						</label>
					</li>
					<li>
						<a href="#">Forgot Password?</a>
					</li>
				</ul>
			</div>
			<!-- //checkbox -->
			<input type="submit" value="Log In">
			
			
			<div class="wthree-text">
			
			<label>
			<h3 style="color:white; font-size:200%;">Register Here
			</label>
			
			<li>
				<i class="fas fa-level-down-alt"></i><br>
				<a href="Register.jsp" style="color: yellow; font-size:200%; ">CLICK ME</a>
			</li>
			</h3>
			</div>
		
		</form>
	</div>
	
	<!-- //content -->

	<!-- copyright -->
	<!-- <div class="footer">
		<p>&copy; 2018 Matrimony Login Form. All rights reserved | Design by
			<a href="http://w3layouts.com">W3layouts</a>
		</p>
	</div> -->
	<!-- //copyright -->

</body>

</html>