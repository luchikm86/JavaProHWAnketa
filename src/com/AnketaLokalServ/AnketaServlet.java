package com.AnketaLokalServ;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet(name = "AnketaServlet")
public class AnketaServlet extends HttpServlet {

    private static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua</title>" +
            "</head><body>" + "<h1>%s</h1>" + "</body></html>";

    public Statistics stats = new Statistics();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String sex = req.getParameter("sex");
        String java = req.getParameter("java");
        String smoke = req.getParameter("smoke");
        String beer = req.getParameter("beer");

        stats.getUserList().add(new Users(firstName, lastName,sex, java, smoke, beer));

        resp.getWriter().println(stats.getStats());
    }

}
