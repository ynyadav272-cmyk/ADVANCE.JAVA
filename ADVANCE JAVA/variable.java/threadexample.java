public class threadexample implements Runnable {
    private int balance = 4000;

    @Override
    public void run() {
        withdraw(3000);
    }

    public synchronized void withdraw(int amount) {

        if (balance > amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawn amount: " + amount);
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }

    public int geta() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        threadexample th = new threadexample();
        Thread t1 = new Thread(th, "one");
        Thread t2 = new Thread(th, "two");
        System.out.println();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw e;
        }

        System.out.println("Final balance: " + th.geta());
    }
}

    


