/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.81
 * Generated at: 2022-06-28 17:10:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loging_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <link rel=\"icon\" href=\"premier/src/main/webapp/assets/docs/favicon.ico\">\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/3.3/examples/starter-template/\">\r\n");
      out.write("    <title>Bootstrap 101 Template</title>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"premier/src/main/webapp/assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("    <link href=\"premier/src/main/webapp/assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"premier/src/main/webapp/assets/docs/assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    <script src=\"premier/src/main/webapp/assets/docs/assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <form class=\"form-signin\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\r\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\r\n");
      out.write("        <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\r\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("<!--     <nav class=\"navbar navbar-inverse navbar-fixed-top\"> -->\r\n");
      out.write("<!--       <div class=\"container\"> -->\r\n");
      out.write("<!--         <div class=\"navbar-header\"> -->\r\n");
      out.write("<!--           <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"> -->\r\n");
      out.write("<!--             <span class=\"sr-only\">Toggle navigation</span> -->\r\n");
      out.write("<!--             <span class=\"icon-bar\"></span> -->\r\n");
      out.write("<!--             <span class=\"icon-bar\"></span> -->\r\n");
      out.write("<!--             <span class=\"icon-bar\"></span> -->\r\n");
      out.write("<!--           </button> -->\r\n");
      out.write("<!--           <a class=\"navbar-brand\" href=\"#\">Project name</a> -->\r\n");
      out.write("<!--         </div> -->\r\n");
      out.write("<!--         <div id=\"navbar\" class=\"collapse navbar-collapse\"> -->\r\n");
      out.write("<!--           <ul class=\"nav navbar-nav\"> -->\r\n");
      out.write("<!--             <li class=\"active\"><a href=\"#\">Home</a></li> -->\r\n");
      out.write("<!--             <li><a href=\"#about\">About</a></li> -->\r\n");
      out.write("<!--             <li><a href=\"#contact\">Contact</a></li> -->\r\n");
      out.write("<!--           </ul> -->\r\n");
      out.write("<!--         </div> -->\r\n");
      out.write("<!--       </div> -->\r\n");
      out.write("<!--     </nav> -->\r\n");
      out.write("\r\n");
      out.write("<!--     <div class=\"container\"> -->\r\n");
      out.write("\r\n");
      out.write("<!--       <div class=\"starter-template\"> -->\r\n");
      out.write("<!--         <h1>Bootstrap starter template</h1> -->\r\n");
      out.write("<!--         <p class=\"lead\">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p> -->\r\n");
      out.write("<!--       </div> -->\r\n");
      out.write("\r\n");
      out.write("<!--     </div> -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"premier/src/main/webapp/assets/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
