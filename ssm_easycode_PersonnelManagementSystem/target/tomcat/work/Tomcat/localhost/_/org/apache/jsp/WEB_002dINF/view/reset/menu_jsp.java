/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-27 15:18:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.reset;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Title</title>\n");
      out.write("    <!-- plugins:css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/vendors/base/vendor.bundle.base.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- plugin css for this page -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/vendors/datatables.net-bs4/dataTables.bootstrap4.css\">\n");
      out.write("    <!-- End plugin css for this page -->\n");
      out.write("    <!-- inject:css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/style.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/images/favicon.png\" />\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        // 检验密码是否输入一致\n");
      out.write("\n");
      out.write("        function VerifyCmrPwd() {\n");
      out.write("\n");
      out.write("            var myValue = document.getElementById(\"exampleInputPassword2\").value;\n");
      out.write("            var firValue = document.getElementById(\"exampleInputPassword1\").value;\n");
      out.write("            var spanJ = document.getElementById(\"pwdSpan\");\n");
      out.write("            var flag = (myValue == firValue);\n");
      out.write("            if (myValue != \"\" && myValue != null) {\n");
      out.write("                if (flag) {\n");
      out.write("                    spanJ.innerHTML = \"密码输入一致\".fontcolor(\"green\");\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    spanJ.innerHTML = \"*密码输入不一致\".fontcolor(\"red\");\n");
      out.write("                }\n");
      out.write("            } else {\n");
      out.write("                spanJ.innerHTML = \"*输入不能为空\".fontcolor(\"red\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doUpdateUserSubmit(){\n");
      out.write("            if(!confirm(\"是否修改？\")){\n");
      out.write("                window.event.returnValue = false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doAddUserSubmit(){\n");
      out.write("            if(!confirm(\"是否确定？\")){\n");
      out.write("                window.event.returnValue = false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        function doSignOut() {\n");
      out.write("            if(!confirm(\"是否退出？\")){\n");
      out.write("                window.event.returnValue = false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- partial:partials/_navbar.html -->\n");
      out.write("    <nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("        <div class=\"navbar-brand-wrapper d-flex justify-content-center\">\n");
      out.write("            <div class=\"navbar-brand-inner-wrapper d-flex justify-content-between align-items-center w-100\">\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("                    <span class=\"mdi mdi-sort-variant\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("            <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("\n");
      out.write("                <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\n");
      out.write("                        <img src=\"images/faces/face5.jpg\" alt=\"profile\"/>\n");
      out.write("                        <span class=\"nav-profile-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" onclick=\"doSignOut()\" href=\"/signout\">\n");
      out.write("                            <i class=\"mdi mdi-logout text-primary\"></i>\n");
      out.write("                            Logout\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("                <span class=\"mdi mdi-menu\"></span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("<!-- partial -->\n");
      out.write("<div class=\"container-fluid page-body-wrapper\">\n");
      out.write("    <!-- partial:partials/_sidebar.html -->\n");
      out.write("    <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                    <i class=\"mdi mdi-home menu-icon\"></i>\n");
      out.write("                    <span class=\"menu-title\">首页</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#auth\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("                    <i class=\"mdi mdi-account menu-icon\"></i>\n");
      out.write("                    <span class=\"menu-title\">用户管理</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"auth\">\n");
      out.write("                    <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"/modifyUser\">用户信息</a></li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"/addUser\">新增用户</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#dep\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("                    <i class=\"mdi mdi-tie\"></i>\n");
      out.write("                    <span class=\"menu-title\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门管理</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"dep\">\n");
      out.write("                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\"> 添加部门 </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\"> 添加职位 </a></li>\n");
      out.write("                    <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> 所有员工 </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#emp\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("                    <i class=\"mdi mdi-tie\"></i>\n");
      out.write("                    <span class=\"menu-title\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工管理</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"emp\">\n");
      out.write("                    <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\"> 添加员工 </a></li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> 所有职工 </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#performance\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("                    <i class=\"mdi mdi-tie\"></i>\n");
      out.write("                    <span class=\"menu-title\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;绩效管理</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"performance\">\n");
      out.write("                    <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\"> 绩效规则 </a></li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> 绩效奖励 </a></li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> 绩效惩罚 </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#salary\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("                    <i class=\"mdi mdi-tie\"></i>\n");
      out.write("                    <span class=\"menu-title\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工资管理</span>\n");
      out.write("                    <i class=\"menu-arrow\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"collapse\" id=\"salary\">\n");
      out.write("                    <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\">  </a></li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> 所有职工 </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!-- plugins:js -->\n");
      out.write("\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Plugin js for this page-->\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!-- End plugin js for this page-->\n");
      out.write("<!-- inject:js -->\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Custom js for this page-->\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!-- End custom js for this page-->\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
