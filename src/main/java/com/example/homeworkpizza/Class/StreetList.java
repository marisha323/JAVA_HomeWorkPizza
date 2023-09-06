package com.example.homeworkpizza.Class;

import java.util.Arrays;
import java.util.List;

public class StreetList {
    public static List<Street> streetList=Arrays.asList(

            new Street("вул. Шевченка"),
            new Street("вул. Лесі Українки"),
            new Street("вул. Дружби"),
            new Street("вул. Мира")

    );

    public static Street getStreetList(String name) {
        for (Street street  : streetList) {
            if (street.getStreet().equalsIgnoreCase(name)) {
                return street;
            }
        }
        return null; // Піца не знайдена
    }
}
