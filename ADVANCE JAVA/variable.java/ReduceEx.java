import java.util.*;
import java.util.List;
public class ReduceEx {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0,(a,b)->a+b)/numbers.size();
        System.out.println("Sum: " + sum);
        List<Integer> number = Arrays.asList(30,45,66);
        int sum2 = number.stream().reduce(0,(a,b)->a+b)/number.size();
        System.out.println("Sum: " + sum2);
        int max = number.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max: " + max);
        int total = number.stream().reduce(0,(a,b)->a+b);
        System.out.println("Total: " + total);
        int product = number.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product: " + product);
    }
}
