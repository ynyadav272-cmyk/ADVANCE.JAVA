
public class thread3 extends Thread {
    private final int id;

    public thread3(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread number: " + id);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            thread3 t = new thread3(i);
            t.start();
        }
    }
} 
