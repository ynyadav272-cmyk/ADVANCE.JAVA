@FunctionalInterface
interface VoteValidator {
    String validate(int age);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        VoteValidator voteValidator = age ->
                age < 18 ? "Not eligible for vote" : "Eligible for vote";

        int age1 = 20;
        System.out.println("Age " + age1 + ": " + voteValidator.validate(age1));
    }
}
