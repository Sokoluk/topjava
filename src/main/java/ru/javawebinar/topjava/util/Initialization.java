package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Initialization {

    private static final List<Meal> mealList = Collections.synchronizedList(new ArrayList<>());

    static
    {
        mealList.add(new Meal(0, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500));
        mealList.add(new Meal(1, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000));
        mealList.add(new Meal(2, LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500));
        mealList.add(new Meal(3, LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0), "Еда на граничное значение", 100));
        mealList.add(new Meal(4, LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000));
        mealList.add(new Meal(5, LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500));
        mealList.add(new Meal(6, LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410));
    }

    public static List<Meal> getMealList() {
        return mealList;
    }

    public static void add(String dateTime, String description, String calories) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y-M-dd'T'H:m");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime,dtf);

        mealList.add(new Meal(mealList.size(),localDateTime,description,Integer.parseInt(calories)));

    }

}
