package ru.javawebinar.topjava.web;


import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.util.MealsUtil;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;


import static org.slf4j.LoggerFactory.getLogger;

@WebServlet("/topjava")
public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(MealServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("redirect to Meals");
////        for(MealTo it: MealsUtil.init()){
////            System.out.println(it.getCalories());
////        }
        req.setAttribute("list", Collections.synchronizedCollection( MealsUtil.init()));
////        req.setAttribute("mealTo", MealTo.class);


        req.getRequestDispatcher("/meals.jsp").forward(req, resp);

    }


}
