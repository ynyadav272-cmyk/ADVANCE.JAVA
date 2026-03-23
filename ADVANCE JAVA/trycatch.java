public class trycatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try { 
            try {
                int result = arr[1] / 0; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException ae) {
                System.out.println("Caught ArithmeticException: " + ae.getMessage());
            }
                
            
            int value = arr[5];
            System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + aioobe.getMessage());
        }
            int result2 = arr[0] /2;
            System.out.println("Result2: " + result2); 
    }
            
}