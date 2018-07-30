<%--
  Created by IntelliJ IDEA.
  User: kunku
  Date: 2018/7/25
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is a Resource Website</title>
    <link rel="shortcut icon" href="../static/images/header.png" type="image/x-icon">
    <link href="../static/css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- jQuery (necessary JavaScript plugins) -->
    <script src="../static/js/bootstrap.js"></script>
    <!-- Custom Theme files -->
    <link href="../static/css/style.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Game Box  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

    <script src="../static/js/jquery.min.js"></script>

</head>
<body>
<!-- header -->
<div class="top-banner">
    <div class="header">
        <div class="container">
            <div class="headr-left">
                <h7 align="center"> Welcome To KKResource Website</h7>
                <div class="search">
                    <form>
                        <input type="submit" value="">
                        <input type="text" value="" placeholder="Search...">
                    </form>
                </div>
                <div class="clearfix"></div>
            </div>
      <%--      <div class="headr-right">
                <div class="details">
                    <ul>
                        <li><a href="kunkunlq6666@163.com"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info(at)kunkunlq6666@163.com</a></li>
                        <li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>(+086)136 9654 9521</li>
                    </ul>
                </div>
            </div>--%>
            <div class="clearfix"></div>
        </div>
    </div>
    <!--banner-info-->
    <div class="banner-info">
        <div class="container">
            <div class="logo">
                <h1><a href="index">Game</a></h1>
            </div>
            <div class="top-menu">
                <span class="menu"></span>
                <ul class="nav1">
                    <li class="active"><a href="index">首页</a></li>
                    <li><a href="about">游戏</a></li>
                    <li><a href="reviews">电影</a></li>
                    <li><a href="typo">软件</a></li>
                    <li><a href="gallery">其他资源</a></li>
                    <li><a href="contact">邮件</a></li>
                </ul>
            </div>
            <!-- script-for-menu -->
            <script>
                $( "span.menu" ).click(function() {
                    $( "ul.nav1" ).slideToggle( 300, function() {
                        // Animation complete.
                    });
                });
            </script>
            <!-- /script-for-menu -->

            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!-- banner -->
<!-- Slider-starts-Here -->
<script src="../static/js/responsiveslides.min.js"></script>
<script>
    $(function () {
        $("#slider").responsiveSlides({
            auto:true,
            nav: false,
            speed: 500,
            namespace: "callbacks",
            pager:true,
        });
    });

</script>
<div class="slider">
    <div class="callbacks_container">
        <ul class="rslides" id="slider">

            <div class="slid banner1">
                <div class="caption">
                    <h3>Donec id diam nec ex luctus congue nec sed mi.</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat ex, eu vehicula velit efficitur non.</p>
                </div>
            </div>


            <div class="slid banner2">
                <div class="caption">
                    <h3>Pellentesque eu ante quis elit interdum cursus.</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat ex, eu vehicula velit efficitur non.</p>
                </div>
            </div>


            <div class="slid banner3">
                <div class="caption">
                    <h3>Fusce id urna ut felis feugiat fringilla sed quis nisl.</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat ex, eu vehicula velit efficitur non.</p>
                </div>
            </div>

        </ul>
    </div>
</div>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >kk资源网站</a></div>
<!-- content -->
<div class="content">
    <div class="container">
        <div class="top-games">
            <h3>最热游戏</h3>
            <span></span>
        </div>
        <div class="top-game-grids">
            <ul id="flexiselDemo1">
                <li>
                    <div class="game-grid">
                        <h4>动作 游戏</h4>
                        <p>游戏名称</p>
                        <img src="../static/images/t1.jpg" class="img-responsive" alt=""/>
                    </div>
                </li>
                <li>
                    <div class="game-grid">
                        <h4>赛车 游戏</h4>
                        <p>游戏名称</p>
                        <img src="../static/images/t3.jpg" class="img-responsive" alt=""/>
                    </div>
                </li>
                <li>
                    <div class="game-grid">
                        <h4>3D 游戏</h4>
                        <p>游戏名称</p>
                        <img src="../static/images/t4.jpg" class="img-responsive" alt=""/>
                    </div>
                </li>
                <li>
                    <div class="game-grid">
                        <h4>逃亡 游戏</h4>
                        <p>游戏名称</p>
                        <img src="../static/images/t2.jpg" class="img-responsive" alt=""/>
                    </div>
                </li>
            </ul>

            <script type="text/javascript">
                $(window).load(function() {
                    $("#flexiselDemo1").flexisel({
                        visibleItems: 4,
                        animationSpeed: 1000,
                        autoPlay: true,
                        autoPlaySpeed: 3000,
                        pauseOnHover:true,
                        enableResponsiveBreakpoints: true,
                        responsiveBreakpoints: {
                            portrait: {
                                changePoint:480,
                                visibleItems: 1
                            },
                            landscape: {
                                changePoint:640,
                                visibleItems: 2
                            },
                            tablet: {
                                changePoint:768,
                                visibleItems: 3
                            }
                        }
                    });
                });
            </script>
            <script type="text/javascript" src="../static/js/jquery.flexisel.js"></script>
        </div>
    </div>
</div>
<!-- latest -->
<div class="latest">
    <div class="container">
        <div class="latest-games">
            <h3>最新游戏</h3>
            <span></span>
        </div>
        <div class="latest-top">
            <div class="col-md-5 trailer-text">
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v2.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#">Killzone: Shadow Fall for PlayStation 4 Reviews</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v1.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#"> Spiderman 2 Full Version PC Game</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v3.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#">Sega's: Jet Set for Andriod Play Store 4 Reviews</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="col-md-7 trailer">
                <iframe src="https://www.youtube.com/embed/V5-DyoVlNOg?list=PLiVunv1pnIs2c0ORVqY60K3n8XMO9CoGp" frameborder="0" allowfullscreen></iframe>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>


<%--大型游戏部分--%>
<div class="latest">
    <div class="container">
        <div class="latest-games">
            <h3>大型游戏</h3>
            <span></span>
        </div>
        <div class="latest-top">
            <div class="col-md-5 trailer-text">
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v2.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#">Killzone: Shadow Fall for PlayStation 4 Reviews</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v1.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#"> Spiderman 2 Full Version PC Game</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="sub-trailer">
                    <div class="col-md-4 sub-img">
                        <img src="../static/images/v3.jpg" alt="img07"/>
                    </div>
                    <div class="col-md-8 sub-text">
                        <a href="#">Sega's: Jet Set for Andriod Play Store 4 Reviews</a>
                        <p>Lorem ipsum dolor sit amet, consectetur adipi…</p>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="col-md-7 trailer">
                <iframe src="https://www.youtube.com/embed/V5-DyoVlNOg?list=PLiVunv1pnIs2c0ORVqY60K3n8XMO9CoGp" frameborder="0" allowfullscreen></iframe>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>

<%--每日推荐部分--%>
<div class="poster">
    <div class="container">
        <div class="poster-info">
            <h4 style="color: saddlebrown">每日推荐</h4>
            <h3>游戏名.</h3>
            <p>游戏详情</p>
            <a class="hvr-bounce-to-bottom" href="reviews.html">Read More</a>
        </div>
    </div>
</div>
<!-- poster -->

<!-- x-box -->
<div class="x-box">
    <div class="container">
        <div class="x-box_sec">
            <div class="col-md-7 x-box-left">
                <h2>Games</h2>
                <h3>电脑配置推荐</h3>
                <p>由于很多游戏对电脑配置要求很高 这里推荐电脑配置.内存16G 显卡6G以上 磁盘内存尽量大点（游戏本身容量很大）I7cpu处理器.一般的大型软件运行没问题 游戏安装时有安装说明的话 尽量按照说明安装 有的
                游戏缺少安装环境请联系我们或者自行百度 本网站提供资源链接地址 不提供下载.</p>
                <a class="hvr-bounce-to-top" href="reviews.html">更多 游戏</a>
            </div>
            <div class="col-md-5 x-box-right">
                <img src="../static/images/xbox.jpg" class="img-responsive" alt=""/>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>

<!-- footer -->
<div class="footer">
    <div class="container">
        <div class="footer-grids">
            <div class="col-md-3 ftr-info">
                <h3>关于我们</h3>
                <p>本网站不提供任何下载 只是提供相关资源链接 如果有想要的资源 请联系我们.</p>
            </div>
            <div class="col-md-3 ftr-grid">
                <h3>电影</h3>
                <ul class="ftr-list">
                    <li><a href="#">动作</a></li>
                    <li><a href="#">爱情</a></li>
                    <li><a href="#">科幻</a></li>
                    <li><a href="#">惊悚</a></li>
                    <li><a href="#">其他</a></li>
                </ul>
            </div>
            <div class="col-md-3 ftr-grid">
                <h3>游戏</h3>
                <ul class="ftr-list">
                    <li><a href="#">动作</a></li>
                    <li><a href="#">3 D</a></li>
                    <li><a href="#">射击</a></li>
                    <li><a href="#">探险</a></li>
                    <li><a href="#">生存</a></li>
                </ul>
            </div>
            <div class="col-md-3 ftr-grid">
                <h3>软件</h3>
                <ul class="ftr-list">
                    <li><a href="#">开发</a></li>
                    <li><a href="#">作图</a></li>
                    <li><a href="#">VFX视觉</a></li>
                    <li><a href="#">视频编辑</a></li>
                    <li><a href="#">其他</a></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!---->
<div class="copywrite">
    <div class="container">
        <p>Copyright &copy; 2015.Company name All rights reserved.More Resources kk资源 - Collect from  kk资源</p>
    </div>
</div>
<!---->
</body>
</html>
