package factory;

public class BagFactory implements CraftFactory {
    public Craft createCraft() {
        return new Bag();
    }
}