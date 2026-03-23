public class exception1 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        }  
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }   finally {
            System.out.println("Finally block executed.");
        }                                                               
            int data = 100 / 0; 
            System.out.println(data);
        
    }


}