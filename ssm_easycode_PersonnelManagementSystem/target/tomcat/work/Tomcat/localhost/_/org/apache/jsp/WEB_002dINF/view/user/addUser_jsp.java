/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-27 14:43:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>增加用户页面</title>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    // 检验密码是否输入一致\n");
      out.write("\n");
      out.write("    function VerifyCmrPwd() {\n");
      out.write("\n");
      out.write("    var myValue = document.getElementById(\"exampleInputPassword2\").value;\n");
      out.write("    var firValue = document.getElementById(\"exampleInputPassword1\").value;\n");
      out.write("    var spanJ = document.getElementById(\"pwdSpan\");\n");
      out.write("    var flag = (myValue == firValue);\n");
      out.write("    if (myValue != \"\" && myValue != null) {\n");
      out.write("    if (flag) {\n");
      out.write("    spanJ.innerHTML = \"密码输入一致\".fontcolor(\"green\");\n");
      out.write("    return true;\n");
      out.write("    } else {\n");
      out.write("    spanJ.innerHTML = \"*密码输入不一致\".fontcolor(\"red\");\n");
      out.write("    }\n");
      out.write("    } else {\n");
      out.write("    spanJ.innerHTML = \"*输入不能为空\".fontcolor(\"red\");\n");
      out.write("    }\n");
      out.write("    }\n");
      out.write("    function doSubmit(){\n");
      out.write("        if(!confirm(\"是否修改？\")){\n");
      out.write("            window.event.returnValue = false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-scroller\">\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../reset/menu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"col-10 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\">添加管理员</h4>\n");
      out.write("\n");
      out.write("                        <form class=\"forms-sample\" method=\"post\" action=\"/addUser\" id=\"myform\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h3 style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.addUserFail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputName1\">用户名</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"exampleInputName1\" name=\"username\" placeholder=\"username\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">密码</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"password\" placeholder=\"password\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword2\">再次输入密码</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" name=\"password\" placeholder=\"password\" onblur=\"VerifyCmrPwd()\">\n");
      out.write("                                <span id=\"pwdSpan\" />\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary mr-2\" onclick=\"return doSubmit()\" >修改</button>\n");
      out.write("                            <button class=\"btn btn-light\">重置</button>\n");
      out.write("                        </form>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"/vendors/base/vendor.bundle.base.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Plugin js for this page-->\n");
      out.write("<script src=\"/vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("<script src=\"/vendors/datatables.net/jquery.dataTables.js\"></script>\n");
      out.write("<script src=\"vendors/datatables.net-bs4/dataTables.bootstrap4.js\"></script>\n");
      out.write("<!-- End plugin js for this page-->\n");
      out.write("<!-- inject:js -->\n");
      out.write("<script src=\"/js/off-canvas.js\"></script>\n");
      out.write("<script src=\"/js/hoverable-collapse.js\"></script>\n");
      out.write("<script src=\"/js/template.js\"></script>\n");
      out.write("<!-- endinject -->\n");
      out.write("<!-- Custom js for this page-->\n");
      out.write("<script src=\"/js/dashboard.js\"></script>\n");
      out.write("<script src=\"/js/data-table.js\"></script>\n");
      out.write("<script src=\"/js/jquery.dataTables.js\"></script>\n");
      out.write("<script src=\"/js/dataTables.bootstrap4.js\"></script>\n");
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
