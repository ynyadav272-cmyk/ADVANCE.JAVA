import java.util.*;
public class MainYied {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
       
            switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                sc.close();
                break;
        }
        String result = switch(day){
            case 1 ,2,3,4,5,6,7 -> {
                System.out.println("this is  1 to 7");
                yield "valid day";
            }
            default -> "Invalid day";
         };
         System.out.println(result);
         sc.close();
        }
    }


