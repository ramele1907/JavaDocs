package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by user on 7/12/2016.
 */
public class InfoHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> enm = req.getHeaderNames();
        String htmlTable = "<table><tr><th>Header parameter</th><th>Header value</th></tr><tr>";
        String param = null;
        String value = null;
        while(enm.hasMoreElements()) {
            param = enm.nextElement().toString();
            value = req.getHeader(param);
            htmlTable += "<td>" + param + "</td><td>" + value + "</td>";
        }
        htmlTable +="</tr></table>";

    //    Cookie[] cookies  = req.getCookies();
    //    String cookieTable = "";

        resp.getWriter().write(htmlTable);
        resp.getWriter().write("\n");
        resp.getWriter().write(req.getMethod());
        resp.getWriter().write("\n");
        resp.getWriter().write(req.getQueryString());

    }
}
