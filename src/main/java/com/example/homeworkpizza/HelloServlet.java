package com.example.homeworkpizza;

import java.io.*;

import com.example.homeworkpizza.Class.Pizza;
import com.example.homeworkpizza.Class.PizzaService;
import com.example.homeworkpizza.Class.Street;
import com.example.homeworkpizza.Class.StreetList;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name =request.getParameter("name");
        String phone =request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        String pizzaName=request.getParameter("pizza");

        String[] selectedToppings=request.getParameterValues("toppings");
        Pizza selectedPizza= PizzaService.getPizzaByName(pizzaName);
        Street selectedStreet= StreetList.getStreetList(address);

        if (selectedToppings != null) {
            for (String topping : selectedToppings) {
                selectedPizza.addTopping(topping);
            }
        }
        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Дякуємо за ваше замовлення!</h2>");
        out.println("<p>Ім'я: " + name + "</p>");
        out.println("<p>Телефон: " + phone + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Адреса доставки: " + selectedStreet.getStreet() + "</p>");
        out.println("<p>Піца: " + selectedPizza.getName() + "</p>");
        out.println("<p>Топінги: " + String.join(", ", selectedPizza.getToppings()) + "</p>");
        out.println("<p>Ціна: $" + selectedPizza.getPrice() + "</p>");
        out.println("</body></html>");
    }


    public void destroy() {
    }
}