<%--
  Created by IntelliJ IDEA.
  User: pro
  Date: 2020/3/22
  Time: 上午10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的个人信息</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .modifybutton{
            text-align: right;
        }
        .userinfos{
            /*border: #086A3B solid 1px;*/
            display: flex;
        }
        .left{
            /*border: blue solid 1px;*/
            position: relative;
            width: 150px;
            flex: 2;
        }
        .pic{
            border: lightgray 1px solid;
            height: 75%;
        }
        .nameandEid{
            /*border: red solid 1px;*/
            height: 20%;
            padding-top: 8px;
            text-align: center;
        }
        .right{
            flex: 8 ;
            /*border: 1px solid red;*/
            position: relative;
            margin-left: 30px;
        }

        table{
            border-collapse: collapse;
            width: 100%;
        }
        #table1 td{
            border: darkgray solid 1px;
            padding: 4px;
        }
        #table1 .showtext{
            text-align: left;
            padding-left: 15px;
        }
        #table1 .infosname{
            text-align: right;
            padding-right: 15px;
        }
        /*.attendname{
            border: red solid 1px;
        }*/
        #table2{
            width: 100%;

        }
        #table2 td{
            padding-left: 10px;
            text-align: left;
            border: #A9A9A9 solid 1px;
        }
        .infosname{

        }

        a{
            text-decoration: none;
            color: black;
        }
        /*ul{*/
        /*    list-style: none;*/
        /*    margin: 0;*/
        /*    color: red;*/
        /*    border-bottom: #000000;*/
        /*}*/
        /*li{*/
        /*    padding-left: 100px;*/
        /*    border-bottom: #DEE1E6 1px solid ;*/
        /*    border-top: #DEE1E6 1px solid ;*/
        /*}*/
        .close{
            display: none;
        }
        .open{
            display: inline;
        }

        .attendstatus{
            float: right;
        }

    </style>
    <script type="text/javascript">
        function closethis(obj){
            var oul=obj.parentNode.getElementsByTagName("ul")[0];
            var otable=document.getElementById("table2");
            var oUlArr = otable.getElementsByTagName("ul");
            for(var i=0;i<oUlArr.length;i++){
                if(oul==oUlArr[i] && oul.className=="close"){
                    oul.className="open";
                }else{
                    oUlArr[i].className="close";
                }
            }
        }
    </script>
</head>
<body>
<%--    面包屑导航--%>
    <ol class="breadcrumb">
        <li><a href="/all">Home</a></li>
        <li class="active">个人档案</li></ol>
<div >
    <!--修改按钮-->
    <div class="modifybutton">
        <button onclick="javascript:window.location.href='file:///Users/pro/Desktop/%E4%BA%BA%E4%BA%8B%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F%EF%BC%88html%EF%BC%89/%E7%94%A8%E6%88%B7%E4%BF%AE%E6%94%B9%E7%95%8C%E9%9D%A2/EmployeeModify.html'" name="modify">修改</button>
    </div>
    <hr />

    <!--用户信息-->
    <div class="userinfos">

        <!--照片信息-->
        <div class="left">
            <!--图片-->
            <div class="pic">
                img<!--<img src="img/a.png"/>-->
            </div>
            <!--姓名和工号-->
            <div class="nameandEid">
                姓名：张三<br />
                工号: 1901056<br />
            </div>

        </div>

        <!--部门基本信息-->
        <div class="right">
            <table class="table-bordered table-condensed">

                <tr>
                    <td class="infosname"><p class="text-right"><strong>手机号</strong></p></td>
                    <td class="showtext">dfaweffdfasdfdfasdefasdfeeeeewfrdfadf</td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>QQ号</strong></p></td>
                    <td class="showtext"></td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>邮箱</strong></p></td>
                    <td class="showtext">2134541112@qq.com</td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>地址</strong></p></td>
                    <td class="showtext">湖南长沙</td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>部门</strong></p></td>
                    <td class="showtext">dfawefdfagtg</td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>部门领导</strong></td>
                    <td class="showtext"></td>
                </tr>

                <tr>
                    <td class="infosname"><p class="text-right"><strong>入职日期</strong></p></td>
                    <td class="showtext"></td>
                </tr>

            </table>

        </div>

    </div>

    <hr />

    <!--考勤信息-->
    <div class="attendname">
        <div>
            <span> 考勤管理</span>
            <span class="attendstatus"> 考勤状态</span>
        </div>
        <table id="table2">
            <tr  >
                <td width="85%">
                    <a href="javascript:void(0)" onclick="closethis(this)">迟到管理</a>
                    <ul class="close">
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td width="85%">
                    <a href="javascript:void(0)" onclick="closethis(this)">迟到管理</a>
                    <ul class="close">
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td width="85%">
                    <a href="javascript:void(0)" onclick="closethis(this)">迟到管理</a>
                    <ul class="close">
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                    </ul>
                </td>
            </tr>
            <tr>
                <td width="85%">
                    <a href="javascript:void(0)" onclick="closethis(this)">迟到管理</a>
                    <ul class="close">
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                        <li>2019-1-15 08:45  迟到</li>
                    </ul>
                </td>
            </tr>
        </table>
    </div>

</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.0/js/bootstrap.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
