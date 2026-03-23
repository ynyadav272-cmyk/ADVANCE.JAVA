sealed class Shape permits Circle, Rectangle {
    void draw(){
        System.out.println("Drawing a shape");
    }
}

final class Circle extends Shape {
    void draw(){
        System.out.println("Drawing a circle");
    }
}

final class Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}

public class Shape1 {
    public static void main(String[] args){
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        System.out.println(shape1);
        System.out.println(shape2);
        shape1.draw();
        shape2.draw();
    }
}


