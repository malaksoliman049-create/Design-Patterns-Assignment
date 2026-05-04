public class Main {
    public static void main(String[] args) {

        ShopManager manager = ShopManager.getInstance();
        manager.manageShop();

        BraceletDesign d1 = new BraceletDesign("Golden Design");
        BraceletDesign d2 = d1.clone();

        d1.showDesign();
        d2.showDesign();

        Craft c1 = CraftFactory.createCraft("bracelet");
        Craft c2 = CraftFactory.createCraft("candle");
        Craft c3 = CraftFactory.createCraft("bag");

        c1.create();
        c2.create();
        c3.create();
    }
}