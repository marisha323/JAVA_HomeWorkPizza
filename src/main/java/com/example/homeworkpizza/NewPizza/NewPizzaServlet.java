package com.example.homeworkpizza.NewPizza;

import com.example.homeworkpizza.Class.Pizza;
import com.example.homeworkpizza.Class.PizzaService;
import com.example.homeworkpizza.Class.Street;
import com.example.homeworkpizza.Class.StreetList;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collections;

@WebServlet(name = "newPizza", value = "/new-pizza")
public class NewPizzaServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");

        String name =request.getParameter("name");
        String phone =request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        String pizzaName=request.getParameter("pizza");

        String[] selectedToppings=request.getParameterValues("toppings");
        Pizza selectedPizza= new Pizza(pizzaName,0.0);
        Street selectedStreet= StreetList.getStreetList(address);
        if (selectedToppings != null) {
            for (String topping : selectedToppings) {
                selectedPizza.addTopping(topping);
            }
        }
        String p=String.join(", ", selectedPizza.getToppings());
        Pizza pizza=new Pizza();
        pizza.setName(name);
        pizza.setPhone(phone);
        pizza.setEmail(email);

        request.setAttribute("pizzatop", selectedPizza);
        request.setAttribute("street", selectedStreet);

        request.setAttribute("pizza",pizza);
        request.getRequestDispatcher("NewPizza/infoOrdered.jsp").forward(request,response);

    }
}
