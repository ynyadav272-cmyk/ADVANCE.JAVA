public class  throw1 {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid age to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String args[]) {
       try{
        validate(13);
        System.out.println("rest of the code...");
    
         }
     catch(ArithmeticException e){
        System.out.println("Exception caught: " + e.getMessage());
       }
    }

}

