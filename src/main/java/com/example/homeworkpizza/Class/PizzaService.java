package com.example.homeworkpizza.Class;

import java.util.Arrays;
import java.util.List;

public class PizzaService {
    private static List<Pizza> pizzaList = Arrays.asList(
            new Pizza("Маргарита", 10.99),
            new Pizza("Чотири сира", 12.99),
            new Pizza("Капрічоза", 14.99),
            new Pizza("Гавайська", 13.99)
    );

    public static Pizza getPizzaByName(String name) {
        for (Pizza pizza : pizzaList) {
            if (pizza.getName().equalsIgnoreCase(name)) {
                return pizza;
            }
        }
        return null; // Піца не знайдена
    }
}