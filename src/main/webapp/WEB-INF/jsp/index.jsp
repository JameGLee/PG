<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>

<head>
    <title>Home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="${pageContext.request.contextPath}/css/slider.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/startstop-slider.js"></script>
</head>

<body>
<div class="wrap">
    <div class="header">
        <div class="headertop_desc">
            <div class="call">
                <p><span>需要帮助吗?</span> 拨给我们 <span class="number">18862633560</span></span>
                </p>
            </div>
            <div class="account_desc">
                <ul>
                    <li><a href="#">注册</a></li>
                    <li><a href="#">登录</a></li>

                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="header_top">
            <div class="logo">
                <a href="index.html"><img src="images/logo.png" alt="" /></a>
            </div>
            <div class="cart">
                <p>欢迎来到娜尔思读书<span>书架：</span>
                <div id="dd" class="wrapper-dropdown-2"> 0
                    <ul class="dropdown">
                        <li>您还没向您的书架中添加书籍</li>
                    </ul>
                </div>
                </p>
            </div>
            <script type="text/javascript">
                function DropDown(el) {
                    this.dd = el;
                    this.initEvents();
                }
                DropDown.prototype = {
                    initEvents: function() {
                        var obj = this;

                        obj.dd.on('click', function(event) {
                            $(this).toggleClass('active');
                            event.stopPropagation();
                        });
                    }
                }

                $(function() {

                    var dd = new DropDown($('#dd'));

                    $(document).click(function() {
                        // all dropdowns
                        $('.wrapper-dropdown-2').removeClass('active');
                    });

                });
            </script>
            <div class="clear"></div>
        </div>
        <div class="header_bottom">
            <div class="menu">
                <ul>
                    <li class="active"><a href="index.html">首页</a></li>
                    <li><a href="about.html">出版图书</a></li>
                    <li><a href="delivery.html">国风中文网</a></li>
                    <li><a href="news.html">采薇书院</a></li>
                    <li><a href="contact.html">排行榜</a></li>
                    <li><a href="#">作者之家</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="search_box">
                <form action="" method="POST">
                    <input type="text" value="寻找您所想看的书籍" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
                </form>
            </div>
            <div class="clear"></div>
        </div>
        <div class="header_slide">
            <div class="header_bottom_left">
                <div class="categories">
                    <ul>
                        <h3>书籍分类</h3>
                            <c:forEach items="${roughlyNameList}" var="roughly" begin="0" end="14">
                                <li><a href="#">${roughly.rname}</a></li>
                            </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="header_bottom_right">
                <div class="slider">
                    <div id="slider">
                        <div id="mover">
                            <div id="slide-1" class="slide">
                                <div class="slider-img">
                                    <a href="#"><img src="${pageContext.request.contextPath}/images/2019_11_12_5d9a3de6d8144ef0bda095604e283b1f.png" alt="learn more" /></a>
                                </div>
                                <!-- <div class="slider-text">
                                    <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 20% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services Lorem Ipsum is simply dummy text</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div> -->
                                <div class="clear"></div>
                            </div>
                            <div class="slide">
                                <div class="slider-text">
                                    <!-- <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 40% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div>
                                <div class="slider-img"> -->
                                    <a href="#"><img src="${pageContext.request.contextPath}/images/2019_11_12_bfd0169352cc4671a98b7b25dc3cfb79 (1).png" alt="learn more" /></a>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="slide">
                                <div class="slider-img">
                                    <a href="#"><img src="${pageContext.request.contextPath}/images/2019_11_04_b0100a891e0c408ca4a8ae7e4543db70.png" alt="learn more" /></a>
                                </div>
                                <!-- <div class="slider-text">
                                    <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 10% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services Lorem Ipsum is simply dummy text</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div> -->
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="tlinks">Collect from <a href="http://www.cssmoban.com/">网页模板</a></div>
    <div class="main">
        <div class="content">
            <div class="content_top">
                <div class="heading">
                    <h3>最新小说发布</h3>
                </div>
                <div class="see">
                    <p><a href="#">更多最新小说</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section group">
                <c:forEach items="${bookList}" var="book" begin="0" end="10">
                    <div class="grid_1_of_4 images_1_of_4">
                    <a href="#"><img src="../${book.bcover}" alt="" style="width: 140px;height: 220px"/></a>
                    <h2>${book.bname}</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees"><a href="#" style="font-size: 18px">直接阅读</a></span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="preview.html">加入书架</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>
                    </div>
                </c:forEach>
            </div>
            <div class="content_bottom">
                <div class="heading">
                    <h3>本周最热</h3>
                </div>
                <div class="see">
                    <p><a href="#">更多热门小说</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section group">
                <c:forEach items="${bookClick}" var="book" begin="0" end="10">
                    <div class="grid_1_of_4 images_1_of_4">
                        <a href="#"><img src="../${book.bcover}" alt="" style="width: 140px;height: 220px"/></a>
                        <h2>${book.bname}</h2>
                        <div class="price-details">
                            <div class="price-number">
                                <p><span class="rupees"><a href="#" style="font-size: 18px">直接阅读</a></span></p>
                            </div>
                            <div class="add-cart">
                                <h4><a href="preview.html">加入书架</a></h4>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <div class="content_bottom">
                <div class="heading">
                    <h3>老舍</h3>
                </div>
                <div class="see">
                    <p><a href="#">查看老舍全部作品</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section group">
                <c:forEach items="${LSBook}" var="book" begin="0" end="10" >
                    <div class="grid_1_of_4 images_1_of_4">
                        <a href="#"><img src="../${book.bcover}" alt="" style="width: 140px;height: 220px"/></a>
                        <h2>${book.bname}</h2>
                        <div class="price-details">
                            <div class="price-number">
                                <p><span class="rupees"><a href="#" style="font-size: 18px">直接阅读</a></span></p>
                            </div>
                            <div class="add-cart">
                                <h4><a href="preview.html">加入书架</a></h4>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="wrap">
        <div class="section group">
            <div class="col_1_of_4 span_1_of_4">
                <h4>Information</h4>
                <ul>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="contact.html">Customer Service</a></li>
                    <li><a href="#">Advanced Search</a></li>
                    <li><a href="delivery.html">Orders and Returns</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Why buy from us</h4>
                <ul>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="contact.html">Customer Service</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="contact.html">Site Map</a></li>
                    <li><a href="#">Search Terms</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>My account</h4>
                <ul>
                    <li><a href="contact.html">Sign In</a></li>
                    <li><a href="index.html">View Cart</a></li>
                    <li><a href="#">My Wishlist</a></li>
                    <li><a href="#">Track My Order</a></li>
                    <li><a href="contact.html">Help</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Contact</h4>
                <ul>
                    <li><span>+91-123-456789</span></li>
                    <li><span>+00-123-000000</span></li>
                </ul>
                <div class="social-icons">
                    <h4>Follow Us</h4>
                    <ul>
                        <li>
                            <a href="#" target="_blank"><img src="images/facebook.png" alt="" /></a>
                        </li>
                        <li>
                            <a href="#" target="_blank"><img src="images/twitter.png" alt="" /></a>
                        </li>
                        <li>
                            <a href="#" target="_blank"><img src="images/skype.png" alt="" /> </a>
                        </li>
                        <li>
                            <a href="#" target="_blank"> <img src="images/dribbble.png" alt="" /></a>
                        </li>
                        <li>
                            <a href="#" target="_blank"> <img src="images/linkedin.png" alt="" /></a>
                        </li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="copy_right">
        <p>Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function() {
        $().UItoTop({
            easingType: 'easeOutQuart'
        });

    });
</script>
<a href="#" id="toTop"><span id="toTopHover"> </span></a>

</body>

</html>