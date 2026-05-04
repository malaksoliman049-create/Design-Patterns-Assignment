package factory;

public class BraceletFactory implements CraftFactory {
    public Craft createCraft() {
        return new Bracelet();
    }
}