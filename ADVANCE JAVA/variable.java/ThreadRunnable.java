class thread implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
        System.out.println("Thread is running");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
}
public class ThreadRunnable{
public static void main(String[] args) {
    Thread t1 = new Thread(new thread());
    t1.start();
}
} 