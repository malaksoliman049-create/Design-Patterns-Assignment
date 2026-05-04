public class Main {
    public static void main(String[] args) {

        
        Singleton.ShopManager manager = Singleton.ShopManager.getInstance();
        manager.openShop();

        
        Prototype.BraceletDesign d1 = new Prototype.BraceletDesign("Beads Style");
        Prototype.Design d2 = d1.clone();
        d2.showDesign();

    
        Factory.CraftFactory factory = new Factory.CandleFactory();
        Factory.Craft craft = factory.createCraft();
        craft.create();
    }
}