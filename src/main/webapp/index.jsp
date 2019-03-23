<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ include file="pages/header.jsp" %>
    <html>
    <body>
    <h2>JSP 语法</h2>

    <ul name="">
        <li>模板元素</li>
        <li>表达式</li>
        <li>脚本片段</li>
        <li>声明</li>
        <li>注释</li>
        <li>指令</li>
        <li>标签</li>
        <li>内置对象</li>
    </ul>


    当前时间 <%= new java.util.Date() %>


    <% System.out.println("hello world");  %>

    lala <br/>

    <%! int count = 2; %>


    <%-- 这是 JSP 注释 --%>


    <!-- 这是HTML，XML 注释 -->

    <a href="pages/forward.jsp">跳到forward 展示</a>

    <a href="firstServlet">servlet</a>

    <%= session.getAttribute("names") == null %>
    姓名：${nameList[0]}



</body>
</html>
