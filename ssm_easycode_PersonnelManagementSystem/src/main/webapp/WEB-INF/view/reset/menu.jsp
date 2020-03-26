<%--
  Created by IntelliJ IDEA.
  User: pro
  Date: 2020/3/24
  Time: 上午12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Title</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="/vendors/base/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <link rel="stylesheet" href="/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="/css/style.css">
    <!-- endinject -->
    <link rel="shortcut icon" href="/images/favicon.png" />
</head>
<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
        <div class="navbar-brand-wrapper d-flex justify-content-center">
            <div class="navbar-brand-inner-wrapper d-flex justify-content-between align-items-center w-100">
<%--                <a class="navbar-brand brand-logo" href="index.html"><img src="images/logo.svg" alt="logo"/></a>--%>
<%--                <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg" alt="logo"/></a>--%>

                <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
                    <span class="mdi mdi-sort-variant"></span>
                </button>
            </div>
        </div>
        <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
<%--            <ul class="navbar-nav mr-lg-4 w-100">--%>
<%--                <li class="nav-item nav-search d-none d-lg-block w-100">--%>
<%--                    <div class="input-group">--%>
<%--                        <div class="input-group-prepend">--%>
<%--                <span class="input-group-text" id="search">--%>
<%--                  <i class="mdi mdi-magnify"></i>--%>
<%--                </span>--%>
<%--                        </div>--%>
<%--                        <input type="text" class="form-control" placeholder="Search now" aria-label="search" aria-describedby="search">--%>
<%--                    </div>--%>
<%--                </li>--%>
<%--            </ul>--%>
            <ul class="navbar-nav navbar-nav-right">

                <li class="nav-item nav-profile dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
                        <img src="images/faces/face5.jpg" alt="profile"/>
                        <span class="nav-profile-name">${sessionScope.user.username}</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
                        <a class="dropdown-item">
                            <i class="mdi mdi-logout text-primary"></i>
                            Logout
                        </a>
                    </div>
                </li>
            </ul>
            <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                <span class="mdi mdi-menu"></span>
            </button>
        </div>
    </nav>
</div>
<!-- partial -->
<div class="container-fluid page-body-wrapper">
    <!-- partial:partials/_sidebar.html -->
    <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
            <li class="nav-item">
                <a class="nav-link" href="index.html">
                    <i class="mdi mdi-home menu-icon"></i>
                    <span class="menu-title">首页</span>
                </a>
            </li>

            <li class="nav-item">

                <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
                    <i class="mdi mdi-account menu-icon"></i>
                    <span class="menu-title">用户管理</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="auth">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="/userInfomation">用户信息</a></li>
                        <li class="nav-item"> <a class="nav-link" href="/userInfomation">新增用户</a></li>
                    </ul>
                </div>
            </li>

            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#dep" aria-expanded="false" aria-controls="auth">
                    <i class="mdi mdi-tie"></i>
                    <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门管理</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="dep">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> 添加部门 </a></li>
                    <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> 添加职位 </a></li>
                    <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> 所有员工 </a></li>
                </ul>
            </div>
            </li>

            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#emp" aria-expanded="false" aria-controls="auth">
                    <i class="mdi mdi-tie"></i>
                    <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工管理</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="emp">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> 添加员工 </a></li>
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> 所有职工 </a></li>
                    </ul>
                </div>
            </li>


            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#performance" aria-expanded="false" aria-controls="auth">
                    <i class="mdi mdi-tie"></i>
                    <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;绩效管理</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="performance">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> 绩效规则 </a></li>
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> 绩效奖励 </a></li>
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> 绩效惩罚 </a></li>

                    </ul>
                </div>
            </li>

            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#salary" aria-expanded="false" aria-controls="auth">
                    <i class="mdi mdi-tie"></i>
                    <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工资管理</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="salary">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html">  </a></li>
                        <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> 所有职工 </a></li>
                    </ul>
                </div>
            </li>
        </ul>
    </nav>
</div>
</body>
<!-- plugins:js -->
<script src="/vendors/base/vendor.bundle.base.js"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<script src="/vendors/chart.js/Chart.min.js"></script>
<script src="/vendors/datatables.net/jquery.dataTables.js"></script>
<script src="vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="/js/off-canvas.js"></script>
<script src="/js/hoverable-collapse.js"></script>
<script src="/js/template.js"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="/js/dashboard.js"></script>
<script src="/js/data-table.js"></script>
<script src="/js/jquery.dataTables.js"></script>
<script src="/js/dataTables.bootstrap4.js"></script>
<!-- End custom js for this page-->
</html>
