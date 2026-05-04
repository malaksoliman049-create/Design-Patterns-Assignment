package main;

import manager.ShopManager;
import prototype.BraceletDesign;
import factory.*;

public class Main {
    public static void main(String[] args) {

        ShopManager manager = ShopManager.getInstance();
        manager.manageShop();

        BraceletDesign d1 = new BraceletDesign("Golden Design");
        BraceletDesign d2 = d1.clone();

        if (d2 != null) {
            d1.showDesign();
            d2.showDesign();
        } else {
            System.out.println("Cloning failed");
        }


        Craft c1 = CraftFactory.createCraft("bracelet");
        Craft c2 = CraftFactory.createCraft("candle");
        Craft c3 = CraftFactory.createCraft("bag");

        if (c1 != null) c1.create();
        if (c2 != null) c2.create();
        if (c3 != null) c3.create();
    }
}