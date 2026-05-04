public class Factory {

    interface Craft {
        void create();
    }

    static class Bracelet implements Craft {
        public void create() {
            System.out.println("Creating Bracelet");
        }
    }

    static class Candle implements Craft {
        public void create() {
            System.out.println("Creating Candle");
        }
    }

    static class Bag implements Craft {
        public void create() {
            System.out.println("Creating Handmade Bag");
        }
    }

    interface CraftFactory {
        Craft createCraft();
    }

    static class BraceletFactory implements CraftFactory {
        public Craft createCraft() {
            return new Bracelet();
        }
    }

    static class CandleFactory implements CraftFactory {
        public Craft createCraft() {
            return new Candle();
        }
    }

    static class BagFactory implements CraftFactory {
        public Craft createCraft() {
            return new Bag();
        }
    }
}