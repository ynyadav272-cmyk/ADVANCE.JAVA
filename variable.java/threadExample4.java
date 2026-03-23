// ...existing code...
import java.util.Scanner;

public class threadExample4 {
    static class GreetingThread extends Thread {
        private final String name;

        GreetingThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("AKHILESH YADAV: ");
        String name = sc.nextLine();

        GreetingThread t = new GreetingThread(name);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            sc.close();
        }
    }
}