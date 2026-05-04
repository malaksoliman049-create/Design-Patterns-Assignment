public class Singleton {

    static class ShopManager {
        private static ShopManager instance;

        private ShopManager() {}

        public static ShopManager getInstance() {
            if (instance == null) {
                instance = new ShopManager();
            }
            return instance;
        }

        public void openShop() {
            System.out.println("Handmade Shop is Open 🧶");
        }
    }
}