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

        d1.showDesign();
        d2.showDesign();

    
        CraftFactory braceletFactory = new BraceletFactory();
        CraftFactory candleFactory = new CandleFactory();
        CraftFactory bagFactory = new BagFactory();

        Craft c1 = braceletFactory.createCraft();
        Craft c2 = candleFactory.createCraft();
        Craft c3 = bagFactory.createCraft();

        c1.create();
        c2.create();
        c3.create();
    }
}