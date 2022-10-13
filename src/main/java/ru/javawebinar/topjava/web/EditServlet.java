package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.util.Initialization;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

@WebServlet("/topjava/edit")
public class EditServlet extends HttpServlet {

    private static final Logger log = getLogger(EditServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("redirect to Edit(GET)");

        req.setAttribute("meal",Initialization.getMealList().get(Integer.parseInt(req.getParameter("id"))));

        req.getRequestDispatcher("/edit.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("redirect to Edit(POST)");
        req.setCharacterEncoding("UTF-8");

        Initialization.edit(req.getParameter("id"),req.getParameter("dateTime"),
                req.getParameter("description"),req.getParameter("calories"));

        req.getRequestDispatcher("/edit.jsp").forward(req, resp);
    }
}
