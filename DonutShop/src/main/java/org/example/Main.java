package org.example;

public class Main {
    public static void main(String[] args) {
        Donut[] donutCollection = new Donut[6];

        String[] Variety = {"Cake", "Frosted", "Jelly", "Glazed", "Boston", "Cider"};
        int[] calories = {250, 290, 260, 300, 310, 190};
        double[] price = {1.25, 2.25, 3.25, 3.75, 4.75, 2.25};
        String[] Description = {"Cake Donut", "Vanilla frosted donut", "Jelly filled donut", "Glazed donut",
                "Boston cream donut", "Cider donut"};

        for (int i = 0; i < donutCollection.length; i++){
            donutCollection[i] = new Donut(Variety[i], calories[i], price[i], Description[i]);
        }
        for (Donut donut: donutCollection) {
            System.out.println(donut);
        }
    }
}