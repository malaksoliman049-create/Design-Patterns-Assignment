public class Prototype {

    interface Shape {
        Shape clone();
        void draw();
    }

    static class Circle implements Shape {
        private String color;

        public Circle(String color) {
            this.color = color;
        }

        public Shape clone() {
            return new Circle(this.color);
        }

        public void draw() {
            System.out.println("Drawing " + color + " circle");
        }
    }
}