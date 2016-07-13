package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 7/13/2016.
 */
public class HttpServletInclude extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = "";

        // Set the response type
        resp.setContentType("text/html");

        // Obtain the user from the request instance
        user = req.getParameter("user");

        //Write the response content
        //resp.getWriter().write("Hello <b>" + user + "</b>");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/included");
        req.setAttribute("testAttribute", "Enjoy Z2H");
        requestDispatcher.include(req, resp);

        String aux = req.getAttribute("testAttribute").toString();
        resp.getWriter().write("Modifi " + aux);

    }
}
