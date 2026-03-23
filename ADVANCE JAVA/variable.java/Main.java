// Test / Driver class
public class Main {

    // Base class
    static class Shape {
        // This method is meant to be overridden
        public void area() {
            System.out.println("Area formula not defined for generic shape");
        }
    }

    // Derived class: Circle
    static class Circle extends Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public void area() {
            System.out.println("Area of Circle = π * r * r");
            // If you also want to compute & print numeric value:
            double a = Math.PI * radius * radius;
            System.out.println(" => Numeric area = " + a);
        }
    }

    // Derived class: Rectangle
    static class Rectangle extends Shape {
        private double width, height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public void area() {
            System.out.println("Area of Rectangle = width * height");
            double a = width * height;
            System.out.println(" => Numeric area = " + a);
        }
    }

    // Derived class: Triangle
    static class Triangle extends Shape {
        private double base, height;
        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        @Override
        public void area() {
            System.out.println("Area of Triangle = ½ * base * height");
            double a = 0.5 * base * height;
            System.out.println(" => Numeric area = " + a);
        }
    }

    public static void main(String[] args) {
        // Upcasting examples
        Shape s1 = new Circle(5);        // upcast Circle to Shape
        Shape s2 = new Rectangle(4, 6);  // upcast Rectangle to Shape
        Shape s3 = new Triangle(3, 8);   // upcast Triangle to Shape

        s1.area();  // calls Circle’s override
        s2.area();  // calls Rectangle’s override
        s3.area();  // calls Triangle’s override

        }
    }


