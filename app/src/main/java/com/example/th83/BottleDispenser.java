package com.example.th83;

import java.util.ArrayList;

public class BottleDispenser {

    private static BottleDispenser bot = null;

    private int bottles;

    private float money = 0;
    private String name = "";
    private float size = 0;
    private int choice = 0;
    private float price = 0;

    ArrayList<Bottle> bottle_list = new ArrayList<Bottle>();


    private BottleDispenser() {

        bottles = 5;

        for(int i = 0;i<bottles;i++) {
            if (i==0) {
                name = "Pepsi Max";
                size = 0.5f;
                price = 1.80f;
            }
            if (i==1) {
                name = "Pepsi Max";
                size = 1.5f;
                price = 2.2f;
            }
            if (i==2) {
                name = "Coca-Cola Zero";
                size = 0.5f;
                price = 2.0f;
            }
            if (i==3) {
                name = "Coca-Cola Zero";
                size = 1.5f;
                price = 2.5f;
            }
            if (i==4) {
                name = "Fanta Zero";
                size = 0.5f;
                price = 1.95f;
            }
            bottle_list.add(new Bottle(name, size, price));
        }
    }

    public static BottleDispenser getInstance() {
        if (bot == null) {
            bot = new BottleDispenser();
        }
        return bot;
    }


    public void addMoney(int mon) {
        money = mon;
    }


    public int buyBottle() {

        // for(int i = 0;i<bottles;i++) {
        //System.out.println((i + 1) +". Name: " +bottle_list.get(i).getName() +"\n\tSize: " +bottle_list.get(i).getSize() +"\tPrice: " +bottle_list.get(i).getPrice());
        // }

        if (money >= 2) {
            System.out.println("Toimii");
            //if (money >= bottle_list.get(choice-1).getPrice()) {
            //System.out.println("KACHUNK! " + bottle_list.get(choice-1).getName() +" came out of the dispenser!");
            //money = money - bottle_list.get(choice-1).getPrice();
            //bottle_list.remove(choice-1);
            //bottles -= 1;
            money = money -2 ;
            int i = 11;
            return i;
        } else {
            System.out.println("Ei massia");
            //System.out.println("Add money first!");
            return 0;
        }
    }


    public float returnMoney() {
        float money_now;
        money_now = money;
        money = 0;
        return money_now;
    }

   //public void print() {

     //   for(int i = 0;i<bottles;i++) {
       //     System.out.println((i + 1) +". Name: " +bottle_list.get(i).getName() +"\n\tSize: " +bottle_list.get(i).getSize() +"\tPrice: " +bottle_list.get(i).getPrice());
      //  }
   // }
}
