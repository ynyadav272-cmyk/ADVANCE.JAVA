abstract class Shop{
 public abstract void order(String dish);
}
class Person extends Shop{
    String dish;
 @Override
public void order(String dish) {
this.dish=dish;
}
}
public class abs1 {
 public static void main (String[] args) {
    Person p = new Person();
  p.order("Pasta");
    System.out.println("Ordered dish: " + p.dish);

}  
}
