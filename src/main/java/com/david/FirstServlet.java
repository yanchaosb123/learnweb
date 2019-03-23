package com.david;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by z00473307 on 2019/3/17.
 */
public class FirstServlet extends HttpServlet {



    javax.servlet.jsp.PageContext pageContext;

    /**
     * 如果不实现doGet 方法，则所有的get 请求无法到达此servlet
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);



        List<String> names = Arrays.asList("wang xiao", "liu da", "zhang ming", "zhou tong");

        req.getSession().setAttribute("nameList", names);

        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        resp.getWriter().write(" 你好 hello");

        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
