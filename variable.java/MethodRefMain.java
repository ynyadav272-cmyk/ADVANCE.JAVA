class Calculator{
    Calculator(){
        System.out.println("This is a constructor");
    }
    int sub(int n1, int n2){
        return n1 - n2;
    }
        static int mul(int n1, int n2){
            return n1 * n2;
        }
}
@FunctionalInterface
interface Calc {
    int calculate(int n1, int n2);
}

public class MethodRefMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using method reference for instance method
        int result1 = calculator.sub(10, 5);
        System.out.println("Subtraction Result: " + result1);

        // Using method reference for static method
        int result2 = Calculator.mul(10, 5);
        System.out.println("Multiplication Result: " + result2);
    }
}

