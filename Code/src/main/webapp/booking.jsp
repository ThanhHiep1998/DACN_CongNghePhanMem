<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Booking Form</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

		<!-- STYLE CSS -->
		<link rel="stylesheet" href="rcss/style.css">
	 <!-- Stylesheet -->
	 <link rel="stylesheet" href="style.css">

	</head>
	
	<body>
		<!-- Preloader -->
		<div id="preloader">
			<div class="loader"></div>
		</div>
		<!-- /Preloader -->
	
		<!-- Header Area Start -->
		<header class="header-area">
			<!-- Search Form -->
			<div class="search-form d-flex align-items-center">
				<div class="container">
					<form action="index.html" method="get">
						<input type="search" name="search-form-input" id="searchFormInput" placeholder="Type your keyword ...">
						<button type="submit"><i class="icon_search"></i></button>
					</form>
				</div>
			</div>
	
			<!-- Top Header Area Start -->
			<div class="top-header-area">
				<div class="container">
					<div class="row">
	
						<div class="col-6">
							<div class="top-header-content">
								<a href="#"><i class="icon_phone"></i> <span>(+84) 032 775 4318</span></a>
								<a href="#"><i class="icon_mail"></i> <span>joyhan283@gmail.com</span></a>
							</div>
						</div>
	
						<div class="col-6">
							<div class="top-header-content">
								<!-- Top Social Area -->
								<div class="top-social-area ml-auto">
									<a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
									<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
									<a href="#"><i class="fa fa-tripadvisor" aria-hidden="true"></i></a>
									<a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
								</div>
							</div>
						</div>
	
					</div>
				</div>
			</div>
			<!-- Top Header Area End -->
	
			<!-- Main Header Start -->
			<div class="main-header-area">
				<div class="classy-nav-container breakpoint-off">
					<div class="container">
						<!-- Classy Menu -->
						<nav class="classy-navbar justify-content-between" id="robertoNav">
	
							<!-- Logo -->
							<a class="nav-brand" href="index.html"><img src="./img/core-img/hotellogo.png" alt=""></a>
	
							<!-- Navbar Toggler -->
							<div class="classy-navbar-toggler">
								<span class="navbarToggler"><span></span><span></span><span></span></span>
							</div>
	
							<!-- Menu -->
							<div class="classy-menu">
								<!-- Menu Close Button -->
								<div class="classycloseIcon">
									<div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
								</div>
								<!-- Nav Start -->
								<div class="classynav">
									<ul id="nav">
										<li class="active"><a href="./index.html">Home</a></li>
										<li><a href="./room.html">Rooms</a></li>
										<li><a href="./">About Us</a></li>
									
										<li><a href="./">News</a></li>
										<li><a href="./contact.html">Contact</a></li>
									</ul>
	
									<!-- Search -->
									<div class="search-btn ml-4">
										<i class="fa fa-search" aria-hidden="true"></i>
									</div>
	
									<!-- Book Now -->
									<div class="book-now-btn ml-3 ml-lg-5">
										<a href="/login.html">Login <i class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
									</div>
								</div>
								<!-- Nav End -->
							</div>
						</nav>
					</div>
				</div>
			</div>
		</header>
		<!-- Header Area End -->
	
	 

		<div class="wrapper" >
			<div class="inner">
				
				<form action="/login.html">
					<h3>Booking</h3>
					<div class="form-group">
						<input type="text" placeholder="First Name" class="form-control">
						<input type="text" placeholder="Last Name" class="form-control">
					</div>
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control">
						<input type="text" placeholder="Confirmation Email" class="form-control">
					</div>
					
					
					<div class="form-wrapper">
						<input type="text" placeholder="Phone" class="form-control">
						
					</div>
					
					<div class="form-wrapper">
						
						<input type="text" placeholder="Addresss" class="form-control">
					</div>
                   
					<button>Booking
						<i class="zmdi zmdi-arrow-right"></i>
					</button>
				</form>

				
			</div>
			
		</div>
	
    <!-- Call To Action Area Start -->
    <section class="roberto-cta-area">
        <div class="container">
            <div class="cta-content bg-img bg-overlay jarallax" style="background-image: url(img/bg-img/1.jpg);">
                <div class="row align-items-center">
                    <div class="col-12 col-md-7">
                        <div class="cta-text mb-50">
                            <h2>Contact us now!</h2>
                            <h6>Contact (+84) 032 775 431                                to book directly or for advice</h6>
                        </div>
                    </div>
                    <div class="col-12 col-md-5 text-right">
                        <a href="#" class="btn roberto-btn mb-50">Contact Now</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Call To Action Area End -->

    <!-- Partner Area Start -->
    <div class="partner-area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="partner-logo-content d-flex align-items-center justify-content-between wow fadeInUp" data-wow-delay="300ms">
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Partner Area End -->

    <!-- Footer Area Start -->
    <footer class="footer-area section-padding-80-0">
        <!-- Main Footer Area -->
        <div class="main-footer-area">
            <div class="container">
                <div class="row align-items-baseline justify-content-between">
                    <!-- Single Footer Widget Area -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-80">
                            <!-- Footer Logo -->
                            <a href="#" class="footer-logo"><img src="img/core-img/logof.png" alt=""></a>

                            <h4>(+84) 032 775 4318</h4>
                            <span>joyhan283@gmail.com</span>
                            <span>235 Nguyen Cu Trinh, District 1, HCM City, Viet Nam</span>
                        </div>
                    </div>

                   
                    <!-- Single Footer Widget Area -->
                    <div class="col-12 col-sm-4 col-lg-2">
                        <div class="single-footer-widget mb-80">
                            <!-- Widget Title -->
                            <h5 class="widget-title">Links</h5>

                            <!-- Footer Nav -->
                            <ul class="footer-nav">
                                <li><a href="#"><i class="fa fa-caret-right" aria-hidden="true"></i> About Us</a></li>
                                <li><a href="#"><i class="fa fa-caret-right" aria-hidden="true"></i> Our Room</a></li>
                                <li><a href="#"><i class="fa fa-caret-right" aria-hidden="true"></i> News</a></li>
                                <li><a href="#"><i class="fa fa-caret-right" aria-hidden="true"></i> Contact</a></li>
                            </ul>
                        </div>
                    </div>

                    <!-- Single Footer Widget Area -->
                    <div class="col-12 col-sm-8 col-lg-4">
                        <div class="single-footer-widget mb-80">
                            <!-- Widget Title -->
                            <h5 class="widget-title">Subscribe Newsletter</h5>
                            <span>Subscribe our newsletter gor get notification about new updates.</span>

                            <!-- Newsletter Form -->
                            <form action="index.html" class="nl-form">
                                <input type="email" class="form-control" placeholder="Enter your email...">
                                <button type="submit"><i class="fa fa-paper-plane" aria-hidden="true"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

       
    </footer>
    <!-- Footer Area End -->

    <!-- **** All JS Files ***** -->
    <!-- jQuery 2.2.4 -->
    <script src="js/jquery.min.js"></script>
    <!-- Popper -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap -->
    <script src="js/bootstrap.min.js"></script>
    <!-- All Plugins -->
    <script src="js/roberto.bundle.js"></script>
    <!-- Active -->
    <script src="js/default-assets/active.js"></script>

</body>
</html>
</body>
</html>