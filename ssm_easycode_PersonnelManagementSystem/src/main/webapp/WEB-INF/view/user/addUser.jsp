<%--
  Created by IntelliJ IDEA.
  User: pro
  Date: 2020/3/27
  Time: 下午9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加用户页面</title>


</head>
<body>
    <div class="container-scroller">
        <div class="container-scroller">
            <jsp:include page="../reset/menu.jsp" />
            <div class="col-10 grid-margin stretch-card">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">添加管理员</h4>

                        <form class="forms-sample" method="post" action="/addUser" id="myform">
                            <div class="form-group">
                                <h3 style="color:red">${sessionScope.addUserFail}</h3>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputName1">用户名</label>
                                <input type="text" class="form-control" id="exampleInputName1" name="username" placeholder="username" >
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">密码</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="password" >
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword2">再次输入密码</label>
                                <input type="password" class="form-control" id="exampleInputPassword2" name="password" placeholder="password" onblur="VerifyCmrPwd()">
                                <span id="pwdSpan" />
                            </div>
                            <button type="submit" class="btn btn-primary mr-2" onclick="return doAddUserSubmit()" >修改</button>
                            <button class="btn btn-light">重置</button>
                        </form>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
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
</html>
