public class Main {
    public static void main(String[] args) {

        
        Singleton.SystemManager m1 = Singleton.SystemManager.getInstance();
        Singleton.SystemManager m2 = Singleton.SystemManager.getInstance();
        m1.show();
        System.out.println(m1 == m2);

        
        Prototype.Circle c1 = new Prototype.Circle("Red");
        Prototype.Shape c2 = c1.clone();
        c2.draw();

        
        Factory.FactoryMethod f = new Factory.FactoryA();
        Factory.Product p = f.createProduct();
        p.display();
    }
}