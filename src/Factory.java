public class Factory {

    interface Product {
        void display();
    }

    static class ProductA implements Product {
        public void display() {
            System.out.println("This is Product A");
        }
    }

    static class ProductB implements Product {
        public void display() {
            System.out.println("This is Product B");
        }
    }

    interface FactoryMethod {
        Product createProduct();
    }

    static class FactoryA implements FactoryMethod {
        public Product createProduct() {
            return new ProductA();
        }
    }

    static class FactoryB implements FactoryMethod {
        public Product createProduct() {
            return new ProductB();
        }
    }
}