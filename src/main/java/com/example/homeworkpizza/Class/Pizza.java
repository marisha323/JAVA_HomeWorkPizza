package com.example.homeworkpizza.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private String phone;
    private String email;
    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    List<String> toppings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza() {
    }



    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void removeTopping(String topping) {
        toppings.remove(topping);
    }
}
