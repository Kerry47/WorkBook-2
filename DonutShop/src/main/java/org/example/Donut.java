package org.example;

import java.sql.SQLOutput;

public class Donut {
    String variety;
    double price;
    int calories;
    String Description;

    Donut(String variety, int calories, double price, String Description) {
        this.variety = variety;
        this.price = price;
        this.calories = calories;
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "org.example.Donut: {Variety: " + variety + " Price: " + price + " calories: " + calories + " Description: " + Description + "}";
    }

    public String getVariety() {
        return variety;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

            }


