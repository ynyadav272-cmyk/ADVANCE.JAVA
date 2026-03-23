
public class threadsolution {
    static class Printer {
        public synchronized void printMessage(String msg) {
            System.out.print(Thread.currentThread().getName() + ": ");
            System.out.println(msg);
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> printer.printMessage("hello from thread A"), "aman");
        Thread t2 = new Thread(() -> printer.printMessage("Hello from thread B"), "akhilesh");
        Thread t3 = new Thread(() -> printer.printMessage("Hello from thread C"), "tyagi");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
} 
    