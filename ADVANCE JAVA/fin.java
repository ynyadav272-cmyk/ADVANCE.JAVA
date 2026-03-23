public class fin {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // This line would cause a compilation error because x is final
        System.out.println("The value of x is: " + x);

    }
    public class finalExample {
        public void demonstrateFinal() {
            final int y = 5;
            // y = 10; // This line would cause a compilation error because y is final
            System.out.println("The value of y is: " + y);
        }
    }

}