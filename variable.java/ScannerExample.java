import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:");
            double a = sc.nextDouble();
            System.out.print("Enter second number:");
            double b = sc.nextDouble();
            double area = a*b;
            System.out.println("Sum is :"+ area);
        }
    }
}
