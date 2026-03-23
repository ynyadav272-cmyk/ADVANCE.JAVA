public class Lambda {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };
        r1.run();
        Runnable r2 = () -> System.out.println("Thread is running using lambda expression");
        r2.run();
    }
}
