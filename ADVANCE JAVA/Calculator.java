class Sum {
    void sum(int a, int b) {
        System.out.println(a + b);
    }
}

class Multiply {
    void multiply(int a, int b) {
        System.out.println(a * b);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Sum s = new Sum();
        Multiply m = new Multiply();

        m.multiply(10, 10);
        s.sum(100, 100);
    }
}
