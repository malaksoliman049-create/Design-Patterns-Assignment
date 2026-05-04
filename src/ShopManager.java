public class ShopManager {
    private static ShopManager instance;

    private ShopManager() {}

    public static ShopManager getInstance() {
        if (instance == null) {
            instance = new ShopManager();
        }
        return instance;
    }

    public void manageShop() {
        System.out.println("Managing the shop...");
    }
}