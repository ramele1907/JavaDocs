package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by user on 7/12/2016.
 */
public class ZeroToHeroServlet extends HttpServlet {
    private String handleRequest(HttpServletRequest req) {
        String fName = req.getParameter("First Name");
        String lName = req.getParameter("Last Name");
        System.out.println(fName);
        String response = "Hello <b>+[" + fName+"] [" + lName + "]</b>! Enjoy Zero To Hero!!!";
        return response;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write(handleRequest(req));
    }
}
