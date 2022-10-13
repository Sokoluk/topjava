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

@WebServlet("/topjava/delete")
public class DeleteServlet extends HttpServlet {

    private static final Logger log = getLogger(DeleteServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("redirect to Delete(POST)");

        Initialization.delete(req.getParameter("id"));
        resp.sendRedirect("/topjava");
    }

}
