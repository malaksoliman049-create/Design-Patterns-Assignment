public class Prototype {

    interface Design {
        Design clone();
        void showDesign();
    }

    static class BraceletDesign implements Design {
        private String style;

        public BraceletDesign(String style) {
            this.style = style;
        }

        public Design clone() {
            return new BraceletDesign(this.style);
        }

        public void showDesign() {
            System.out.println("Bracelet Design: " + style);
        }
    }
}