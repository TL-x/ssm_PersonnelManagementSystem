<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pro
  Date: 2020/3/24
  Time: 上午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息页面</title>


</head>
<body>
    <div class="container-scroller">
        <jsp:include page="../reset/menu.jsp" />
        <div class="col-10 grid-margin stretch-card">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title">个人用户信息</h4>
                    <p class="card-description">
                        账号密码修改
                    </p>
                    <form class="forms-sample" method="post" action="/modifyUser" id="myform">
<%--                        <c:if test="isFail == null">--%>
<%--                            --%>
<%--                        </c:if>--%>
                        <div class="form-group">
                            <h3 style="color:red">${sessionScope.updateUserFail}</h3>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputId1">My Id</label>
                            <input type="text" class="form-control" id="exampleInputId1" name="pkUid" value="${sessionScope.user.pkUid}" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputName1">Name</label>
                            <input type="text" class="form-control" id="exampleInputName1" name="username" value="${sessionScope.user.username}" >
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword4">Password</label>
                            <input type="text" class="form-control" id="exampleInputPassword4" name="password" value="${sessionScope.user.password}">
                        </div>
                        <button type="submit" class="btn btn-primary mr-2" onclick="return doUpdateUserSubmit()" >修改</button>
                        <button class="btn btn-light">重置</button>
                    </form>
                    </form>
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
