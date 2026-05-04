package prototype;

public class BraceletDesign implements Cloneable {
    private String design;

    public BraceletDesign(String design) {
        this.design = design;
    }

    public void showDesign() {
        System.out.println("Bracelet Design: " + design);
    }

    @Override
    public BraceletDesign clone() {
        try {
            return (BraceletDesign) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}