
class invalidmarksException extends RuntimeException {
    public invalidmarksException(String message) {
        super(message);
    }
}
public class throw2 {
    public  static void checkmarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new invalidmarksException("enter the mraks between 0 and 100");
        } else {
            System.out.println("valid marks");
        }
    }

    public static void main(String args[]) {
        try{
        checkmarks(105);
        System.out.println("rest of the code...");
    
            }
        catch(ArithmeticException e){
        System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
