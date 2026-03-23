
interface Calc {
    void calculate(int n1, int n2);
    default void calculate(int n1, int n2, int n3){
    int s = n1+n2+n3;
        System.out.println("Sum is :"+ s);
    }
    static String message(){
        return "This is a static method in interface";
    }   
}
class Sum implements Calc{
    public void calculate(int n1, int n2){
        int s = n1+n2;
        System.out.println("Sum :"+ s);
    }
    public void calculator(int n1, int n2, int n3){
        int s = n1+n2+n3;
        System.out.println("Sum of three numbers :"+ s);
    }
}
public class MainInterface {
    public static void main(String[] args) {
        Sum c = new Sum();
        c.calculate(5, 10);
        c.calculate(5, 10, 15);
    }    
}





    


