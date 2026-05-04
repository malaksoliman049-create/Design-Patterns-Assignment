public class CraftFactory {
    public static Craft createCraft(String type) {
        if (type.equalsIgnoreCase("bracelet")) {
            return new Bracelet();
        } else if (type.equalsIgnoreCase("candle")) {
            return new Candle();
        } else if (type.equalsIgnoreCase("bag")) {
            return new Bag();
        }
        return null;
    }
}