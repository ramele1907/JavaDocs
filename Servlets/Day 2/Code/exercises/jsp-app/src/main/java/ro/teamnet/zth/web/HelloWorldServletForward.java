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
public class HelloWorldServletForward extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "";

        // Set the response type
        response.setContentType("text/html");

        // Obtain the user from the request instance
        user = request.getParameter("user");

        //Write the response content

        String aux = request.getAttribute("testAttribute").toString();
        response.getWriter().write("Hello <b>"+ user +" "+ "</b> from the Forward Servlet " + aux);

    }
}
