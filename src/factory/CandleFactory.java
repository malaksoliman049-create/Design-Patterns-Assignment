package factory;

public class CandleFactory implements CraftFactory {
    public Craft createCraft() {
        return new Candle();
    }
}