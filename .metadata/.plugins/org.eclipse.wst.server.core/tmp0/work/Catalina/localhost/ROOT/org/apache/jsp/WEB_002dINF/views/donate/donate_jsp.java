/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-11-15 08:35:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.donate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("jar:file:/C:/backend-workspace/kjw_alertravel/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/alertravel/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/backend-workspace/kjw_alertravel/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/alertravel/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.7.RELEASE.jar", Long.valueOf(1693959208075L));
    _jspx_dependants.put("/WEB-INF/views/donate/../layouts/header.jsp", Long.valueOf(1697589150172L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1695082487079L));
    _jspx_dependants.put("jar:file:/C:/backend-workspace/kjw_alertravel/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/alertravel/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1693959208435L));
    _jspx_dependants.put("/WEB-INF/views/donate/../layouts/menu.jsp", Long.valueOf(1699948770369L));
    _jspx_dependants.put("jar:file:/C:/backend-workspace/kjw_alertravel/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/alertravel/WEB-INF/lib/spring-webmvc-5.0.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1528782246000L));
    _jspx_dependants.put("/WEB-INF/views/donate/../layouts/footer.jsp", Long.valueOf(1700036577183L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"/resources/js/main.js\"></script> <!-- 파일 크기 정리 계산 -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<header class=\"jumbotron mb-0 rounded-0\">\r\n");
      out.write("			<h1> \r\n");
      out.write("				<font color=\"white\">Mini? Project</font>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<span style=\"text-shadow: -1px 0 #000, 0 1px #000, 1px 0 #000, 0 -1px #000;\">\r\n");
      out.write("				<p>현재 미니? 프로젝트를 진행 중입니다.</p>\r\n");
      out.write("			</span>\r\n");
      out.write("		</header>\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark sticky-top\" style=\"background: #8E6D65\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"/\">\r\n");
      out.write("		<i class=\"fa-solid fa-house\"></i>\r\n");
      out.write("		메인 화면\r\n");
      out.write("	</a>\r\n");
      out.write("	\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#collapsibleNavbar\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("		\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("		<!-- 좌측 메뉴 -->\r\n");
      out.write("		<ul class=\"navbar-nav\">\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link\" href=\"/donate/donate\">\r\n");
      out.write("					<i class=\"fa-solid fa-screwdriver-wrench\"></i> 후원하기\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		\r\n");
      out.write("		<!-- 우측 메뉴 -->\r\n");
      out.write("		<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("			");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<!-- 로그아웃된 상태 -->\r\n");
      out.write("			");
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- 로그아웃 Form -->\r\n");
      out.write("<form id=\"logoutForm\" action=\"/security/logout\" method=\"post\" >\r\n");
      out.write("	<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("	$('.logout-link').click(function(e) {\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		$('#logoutForm').submit();\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"donate_title\">\r\n");
      out.write("	<h1><i class=\"fas fa-money-check skill-icon\"> 후원하기</i></h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container mt-5\">\r\n");
      out.write("	<div class=\"row justify-content-center\">\r\n");
      out.write("		<div class=\"col-md-8\">\r\n");
      out.write("			<div class=\"card border-0\"> <!-- 외부 선 제거 -->\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<form action=\"payment\" method=\"post\"> <!-- submit 버튼 누르면 이동할 곳 -->\r\n");
      out.write("						<input type=\"hidden\" name=\"donationAmount\" value=\"선택된 금액\">\r\n");
      out.write("						<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("						\r\n");
      out.write("							<h3><br>후원자 정보<br></h3>\r\n");
      out.write("							\r\n");
      out.write("							<!-- 후원자 개인 정보 입력 -->\r\n");
      out.write("							<div class=\"form-group\" id=\"nameInput\">\r\n");
      out.write("								<label for=\"name\">성명</label> \r\n");
      out.write("								<input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"성명 입력\">\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<br>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\" id=\"birthdayInput\">\r\n");
      out.write("								<label for=\"birthday\">생년월일</label>\r\n");
      out.write("								<input type=\"text\" name=\"birthday\" class=\"form-control\" placeholder=\"생년월일 6자리 입력\">\r\n");
      out.write("								<pre>※만 14세 미만의 경우, 후원이 불가능합니다.※</pre>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<br>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\" id=\"phoneInput\">\r\n");
      out.write("								<label for=\"phone\">휴대폰 번호</label>\r\n");
      out.write("								<input type=\"text\" name=\"phone\" class=\"form-control\" placeholder=\"휴대펀 번호 입력('-' 제외)\">\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<br>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"form-group\" id=\"emailInput\">\r\n");
      out.write("								<label for=\"email\">이메일</label>\r\n");
      out.write("								<input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"이메일 주소 입력\">\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<br>\r\n");
      out.write("							<hr color=\"#F0A07B\">\r\n");
      out.write("							<br>\r\n");
      out.write("						\r\n");
      out.write("							<!-- 후원 목적 선택창 -->\r\n");
      out.write("                            <label for=\"select\"><b><h5>후원 목적 선택</h5></b></label> \r\n");
      out.write("                            <select class=\"form-control\" name=\"select\" id=\"donateSelect\">\r\n");
      out.write("                                <option value=\"select\">== 후원 목적 선택 ==</option>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("							\r\n");
      out.write("							<!-- 글 간격 줄이기 -->\r\n");
      out.write("							<div style=\"height: 0.5em;\"></div> \r\n");
      out.write("							후원 목적 상세 내역\r\n");
      out.write("							\r\n");
      out.write("							<br>\r\n");
      out.write("							<br>\r\n");
      out.write("							\r\n");
      out.write("							<!-- 후원 금액 선택창 -->\r\n");
      out.write("							<label for=\"amount\"><b><h5>후원 금액 선택</h5></b></label>\r\n");
      out.write("							<select class=\"form-control\" name=\"amount\" id=\"donateAmount\">\r\n");
      out.write("								<option value=\"amount\">== 후원 금액 선택 ==</option>\r\n");
      out.write("							    ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							</select>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"message\"><b><h5>응원 메시지</h5></b></label>\r\n");
      out.write("							<textarea class=\"form-control\" name=\"message\" rows=\"3\"\r\n");
      out.write("								placeholder=\"응원 메시지를 남겨주세요\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<br>\r\n");
      out.write("						<hr color=\"#F0A07B\">\r\n");
      out.write("						<br>\r\n");
      out.write("						\r\n");
      out.write("						<!-- 후원 요약 정보를 보여줄 컨테이너 -->\r\n");
      out.write("						<div id=\"summaryContainer\" style=\"display: none;\">\r\n");
      out.write("							<label for=\"summary\"><b><h5>후원 요약</h5></b></label>\r\n");
      out.write("								<p id=\"summaryText\"></p>\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-block\">후원하기</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS and dependencies -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  // 함수를 만들어 국가 및 후원 금액에 대한 요약을 업데이트\r\n");
      out.write("  function updateSummary() {\r\n");
      out.write("    var summaryContainer = document.getElementById('summaryContainer');\r\n");
      out.write("    var summaryText = document.getElementById('summaryText');\r\n");
      out.write("    \r\n");
      out.write("    // 선택한 국가 및 후원 금액 가져오기\r\n");
      out.write("    var selectedOption = document.getElementById('donateSelect').\r\n");
      out.write("    						options[document.getElementById('donateSelect').selectedIndex].text;\r\n");
      out.write("    \r\n");
      out.write("    var selectedAmount = document.getElementById('donateAmount').\r\n");
      out.write("    						options[document.getElementById('donateAmount').selectedIndex].text;\r\n");
      out.write("    \r\n");
      out.write("    // 항상 요약을 표시\r\n");
      out.write("    summaryContainer.style.display = 'block';\r\n");
      out.write("    summaryText.innerText = \"선택하신 후원 목적: \" + selectedOption +\r\n");
      out.write("                            \"\\n선택하신 후원 금액: \" + selectedAmount;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 후원 금액 변경 시 이벤트 처리\r\n");
      out.write("  document.getElementById('donateAmount').addEventListener('change', function() {\r\n");
      out.write("    updateSummary();\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // 후원 목적 변경 시 이벤트 처리\r\n");
      out.write("  document.getElementById('donateSelect').addEventListener('change', function() {\r\n");
      out.write("    updateSummary();\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // 초기 로딩 시 실행\r\n");
      out.write("  window.addEventListener('load', function() {\r\n");
      out.write("    // 처음에 숨겨둔 요약 컨테이너를 표시\r\n");
      out.write("    document.getElementById('summaryContainer').style.display = 'block';\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("	.donate_title {\r\n");
      out.write("		padding: 50px 300px 50px; /* 패딩: 위, 좌우, 아래 */\r\n");
      out.write("	    background-color: #F0A07B;\r\n");
      out.write("    	border-color: #F0A07B;\r\n");
      out.write("		color: white;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("	.btn {\r\n");
      out.write("	    background-color: #F0A07B;\r\n");
      out.write("    	border-color: #F0A07B;\r\n");
      out.write("		color: white;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" 			<footer class=\"text-center p-3 footer mt-5\">\r\n");
      out.write("				<i class=\"fa-regular fa-copyright\"></i>\r\n");
      out.write("				2023.10 ~ ING\r\n");
      out.write("			</footer> \r\n");
      out.write("		</div> \r\n");
      out.write("	</body>\r\n");
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

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/donate/../layouts/menu.jsp(27,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("				");
        if (_jspx_meth_sec_005fauthentication_005f0(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("				<!-- 로그인한 상태 -->\r\n");
        out.write("				<li class=\"nav-item\">\r\n");
        out.write("					<a class=\"nav-link\" href=\"/security/profile\">\r\n");
        out.write("						<img src=\"/resources/images/mainecoon.jpg\" class=\"avatar-sm\" />\r\n");
        out.write("						");
        if (_jspx_meth_sec_005fauthentication_005f1(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("					</a>\r\n");
        out.write("				</li>\r\n");
        out.write("				<li class=\"nav-item\">\r\n");
        out.write("					<a class=\"nav-link logout-link\" href=\"#\">\r\n");
        out.write("						<i class=\"fa-solid fa-right-from-bracket\"></i> 로그아웃\r\n");
        out.write("					</a>\r\n");
        out.write("				</li>\r\n");
        out.write("			");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      _jspx_th_sec_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
      // /WEB-INF/views/donate/../layouts/menu.jsp(28,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setProperty("principal.username");
      // /WEB-INF/views/donate/../layouts/menu.jsp(28,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setVar("username");
      int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      _jspx_th_sec_005fauthentication_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
      // /WEB-INF/views/donate/../layouts/menu.jsp(33,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f1.setProperty("principal.username");
      int _jspx_eval_sec_005fauthentication_005f1 = _jspx_th_sec_005fauthentication_005f1.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f1);
      _jspx_th_sec_005fauthentication_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/donate/../layouts/menu.jsp(44,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("isAnonymous()");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("				<i class=\"nav-item\">\r\n");
        out.write("					<a class=\"nav-link\" href=\"/security/login\">\r\n");
        out.write("						<i class=\"fa-solid fa-right-from-bracket\"></i> 로그인\r\n");
        out.write("					</a>\r\n");
        out.write("				</i>\r\n");
        out.write("				<li class=\"nav-item\">\r\n");
        out.write("					<a class=\"nav-link\" href=\"/security/signup\">\r\n");
        out.write("						<i class=\"fa-solid fa-user-plus\"></i> 회원가입\r\n");
        out.write("					</a>\r\n");
        out.write("				</li>\r\n");
        out.write("			");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      _jspx_th_sec_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/donate/donate.jsp(66,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("donateSelect");
      // /WEB-INF/views/donate/donate.jsp(66,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/donate/donate.jsp(66,32) '${donateSelectList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${donateSelectList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        							<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${donateSelect.donateSelect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${donateSelect.donateSelect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("                                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/donate/donate.jsp(82,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("donateAmount");
      // /WEB-INF/views/donate/donate.jsp(82,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/donate/donate.jsp(82,11) '${donateAmountList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${donateAmountList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("        							<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${donateAmount.donateMoney}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${donateAmount.donateOption}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("   								");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
