interface Area{
    double PI = 3.14;
    double getArea();

}
class Circle implements Area{
    double r;
    Circle(double r){
        this.r = r;
    }

public double getArea(){
    return (PI*r*r);
}
}
public class AreaMain {
    public static void main(String[]args){
  Circle c1 = new Circle(5.9);
  System.out.println("Area of Circle:"+c1.getArea());
  Area c2 = new  Circle(5);
  System.out.println("Area of Circle:"+c2.getArea());
  Area r1 = new Area() {
      @Override
      public double getArea() {
          return 0;
      }
  };
  System.out.println("Area of Area:"+r1.getArea());
    }
}
