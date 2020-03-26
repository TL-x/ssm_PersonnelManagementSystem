<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8" />
    <title>菜单</title>
    <style type="text/css">
        body {
            background: #E4E4E4;
            margin: 0;
        }

        .all {
            position: absolute;
            top: 0;
            left: 0px;
            margin: 0;
            border-right: 2px solid grey;
            height: 100%;
            background: lightgrey;
        }

        div>a {
            /*控制宽和高，变为块状元素*/
            display: block;
            /*取消下划线*/
            text-decoration: none;
            padding-left: 10px;
            line-height: 45px;
            /*border: solid #AFAFAF 1px;*/
            color: #666666;
            background-color: #FFFFFF;
            width: 159px;
            height: 45px;
            font-size: 17px;
            border-bottom: 1px solid transparent;
            border-image: linear-gradient(to right, white, lightgrey, grey, grey, lightgrey, white);
            border-image-slice: 20;
        }

        li>a {
            /*控制宽和高，变为块状元素*/
            display: block;
            /*取消下划线*/
            text-decoration: none;
            text-align: center;
            line-height: 45px;
            /*border: solid #AFAFAF 1px;*/
            color: #797979;
            background-color: #FFFFFF;
            width: 169px;
            height: 45px;
            font-size: 15px;
            border-bottom: 1px solid transparent;
            border-image: linear-gradient(to right, white, whitesmoke, lightgrey, lightgrey, lightgrey, whitesmoke, white);
            border-image-slice: 20;
        }

        div>a:hover {
            color: #000000;
            background-color: whitesmoke;
        }

        li>a:hover {
            color: #000000;
            background-color: ghostwhite;
        }

        div {
            width: 170px;
        }

        ul {
            list-style: none;
            margin: 0px;
            padding: 0px;
            display: none;
        }

        li {
            text-align: center;
            line-height: 30px;
        }

        .open {
            display: block;
        }

        .close {
            display: none;
        }

        ul a {
            margin: 0px;
            padding: 0px;
            background-color: whitesmoke;
            /*target-position: show;*/
        }
    </style>
    <script type="text/javascript">
        function change(obj) {

            var opNode = obj.parentNode;
            // 获取ul跟obj同级的ul标签
            var ochiNode = opNode.getElementsByTagName("ul");
            var oppNode = opNode.parentNode;
            var arr2 = oppNode.getElementsByTagName("ul");
            for(var i = 0; i < arr2.length; i++) {
                if(arr2[i] == ochiNode[0] && arr2[i].className != "open") {

                    arr2[i].className = "open";

                } else {

                    arr2[i].className = "close";
                }
            }
        }

        function toAddr(obj){
            var input_val = this.innerHTML;
            //window.location.href=encodeURI("address.html?value="+input_val);
        }

    </script>
</head>

<body>
<div class="all">
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a1">用户信息</a>
        <ul>
            <li>
                <a href="1" target='show'  value="a1_1" >个人账户信息修改</a>
            </li>
            <li>
                <a href="/myArchive/${sessionScope.user.pkUid}" target='show' onclick="toAddr(this)">个人档案</a>
            </li>
        </ul>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a2">部门查询</a>
        <ul>
            <li>
                <a href="file:///Users/pro/Desktop/%E4%BA%BA%E4%BA%8B%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F%EF%BC%88html%EF%BC%89/%E9%83%A8%E9%97%A8%E7%AE%A1%E7%90%86/department.html" target='show' value="a2_1" onclick="toAddr(this)">部门列表</a>
            </li>
        </ul>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a3">员工管理</a>
        <ul>
            <li>
                <a href="1" target='show' value="a3_1" onclick="toAddr(this)">员工列表</a>
            </li>
        </ul>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a4">考勤管理</a>
        <ul>
            <li>
                <a href="1" target="show" value="a4_1" onclick="toAddr(this)">员工班次</a>
            </li>
            <li>
                <a href="1" target="show" value="a4_2" onclick="toAddr(this)">请假管理</a>
            </li>
            <li>
                <a href="1" target="show" value="a4_3" onclick="toAddr(this)">违规管理</a>
            </li>
        </ul>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a5">业绩中心</a>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a6">公告</a>
        <ul>
            <li>
                <a href="1" target="show" value="a6_1" onclick="toAddr(this)">公司公告</a>
            </li>
            <li>
                <a href="1" target="show" value="a6_2" onclick="toAddr(this)">部门公告</a>
            </li>
        </ul>
    </div>
    <div>
        <a href="javascript:void(0)" onclick="change(this)" value="a7">下载中心</a>
        <ul>
            <li>
                <a href="1" target="show" value="a7_1" onclick="toAddr(this)">下载资源</a>
            </li>
        </ul>
    </div>
</div>
</body>

</html>