/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-04-19 08:19:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.days02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import domain.EmpVO;
import java.util.ArrayList;

public final class ex12_005femp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("domain.EmpVO");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
	ArrayList<EmpVO> emp_list = (ArrayList<EmpVO>)request.getAttribute("e_voList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"http://localhost/jspPro/images/SiSt.ico\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/jspPro/resources/cdn-main/example.css\">\r\n");
      out.write("<script src=\"/jspPro/resources/cdn-main/example.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(" span.material-symbols-outlined{\r\n");
      out.write("    vertical-align: text-bottom;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  <h1 class=\"main\"><a href=\"#\" style=\"position: absolute;top:30px;\">kenik HOme</a></h1>\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"#\">로그인</a></li>\r\n");
      out.write("    <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</header>\r\n");
      out.write("<h3>\r\n");
      out.write("  <span class=\"material-symbols-outlined\">view_list</span> jsp days00\r\n");
      out.write("</h3>\r\n");
      out.write("<div>\r\n");
      out.write("  <xmp class=\"code\">\r\n");
      out.write("                     \r\n");
      out.write("  </xmp>  \r\n");
      out.write("  		<h2>emp list</h2>\r\n");
      out.write("		<table>\r\n");
      out.write("		  <thead>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	      	<td><input id=\"all\" type=\"checkbox\">전체선택</td>\r\n");
      out.write("	        <td>empno</td>\r\n");
      out.write("	        <td>ename</td>\r\n");
      out.write("	        <td>job</td>\r\n");
      out.write("	        <td>mgr</td>\r\n");
      out.write("	        <td>hiredate</td>\r\n");
      out.write("	        <td>sal</td>\r\n");
      out.write("	        <td>comm</td>\r\n");
      out.write("	        <td>deptno</td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("		  </thead>\r\n");
      out.write("		  <tbody>\r\n");
      out.write("		    ");

		       if( emp_list == null ){
		    
      out.write("\r\n");
      out.write("		        <tr>\r\n");
      out.write("		          <td colspan=\"8\">사원 존재 X</td>\r\n");
      out.write("		        </tr>\r\n");
      out.write("		    ");
	   
		       }else{
		    	 EmpVO vo = null;
		    	 Iterator<EmpVO> ir = emp_list.iterator();
		    	 while( ir.hasNext() ){
		    		 vo = ir.next();
		    	 
      out.write("\r\n");
      out.write("		    	  <tr>\r\n");
      out.write("		    	  	<td><input type=\"checkbox\" name=\"checkbox\"></td>\r\n");
      out.write("			        <td>");
      out.print( vo.getEmpno() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getEname() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getJob() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getMgr() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getHiredate() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getSal() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getComm() );
      out.write("</td>\r\n");
      out.write("			        <td>");
      out.print( vo.getDeptno() );
      out.write("</td>\r\n");
      out.write("			      </tr>\r\n");
      out.write("		 		 ");
		 
		    	 } // while
		       } // if
		    
      out.write("\r\n");
      out.write("		  </tbody>\r\n");
      out.write("		  <tfoot>\r\n");
      out.write("		    <tr>\r\n");
      out.write("		      <td colspan=\"8\">\r\n");
      out.write("		        <span class=\"badge left red\">\r\n");
      out.write("		          ");
      out.print( emp_list==null ? 0 : emp_list.size() );
      out.write("\r\n");
      out.write("		        </span>\r\n");
      out.write("		        명.\r\n");
      out.write("		       	<button> <a href=\"javascript:history.back()\"></a></button>	 \r\n");
      out.write("		       	<button id=\"submit\">확인</button>\r\n");
      out.write("		      </td>\r\n");
      out.write("		    </tr>\r\n");
      out.write("		  </tfoot>\r\n");
      out.write("		</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(\"#deptno\").on(\"change\", function(e){\r\n");
      out.write("	let value = $(this).val();\r\n");
      out.write("	location.href = `code.jsp?deptno=${value}`;\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\"#submit\").on(\"click\", function(event){\r\n");
      out.write("    event.preventDefault();\r\n");
      out.write("    var checkedEmpnos = $(\"[type=checkbox][name=checkbox]:checked\").map(function(){\r\n");
      out.write("        return $(this).closest('td').next('td').text(); \r\n");
      out.write("    }).get();\r\n");
      out.write("    let empnos = checkedEmpnos.join(\", \"); \r\n");
      out.write("    //alert(empnos)\r\n");
      out.write("    location.href = `test.jsp?empnos=${empnos}`; \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    // 전체 선택 체크박스의 상태가 변경될 때 실행\r\n");
      out.write("    $('#all').on('change', function() {\r\n");
      out.write("        var isChecked = $(this).is(':checked'); // 전체 선택 체크박스의 상태를 확인\r\n");
      out.write("        $('[name=\"checkbox\"]').prop('checked', isChecked); // 모든 체크박스의 상태를 전체 선택 체크박스와 동일하게 설정\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 개별 체크박스의 상태가 변경될 때 실행\r\n");
      out.write("    $('[name=\"checkbox\"]').on('change', function() {\r\n");
      out.write("        if (false === $(this).is(':checked')) { // 하나라도 체크 해제된 경우\r\n");
      out.write("            $('#all').prop('checked', false); // 전체 선택 체크박스를 해제\r\n");
      out.write("        }\r\n");
      out.write("        // 모든 개별 체크박스가 체크된 경우\r\n");
      out.write("        if ($('[name=\"checkbox\"]').length === $('[name=\"checkbox\"]:checked').length) {\r\n");
      out.write("            $('#all').prop('checked', true); // 전체 선택 체크박스를 체크\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
