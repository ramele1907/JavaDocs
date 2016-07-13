package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 7/13/2016.
 */
public class HttpServletIncluded extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = "";

        // Set the response type
        resp.setContentType("text/html");

        // Obtain the user from the request instance
        user = req.getParameter("user");

        //Write the response content
        String aux = req.getAttribute("testAttribute").toString();
        req.setAttribute("testAttribute", "aici" + aux);
//        resp.getWriter().write("aici " + aux);
    }
}
