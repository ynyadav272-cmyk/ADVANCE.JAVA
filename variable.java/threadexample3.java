class Thread4 implements Runnable {
        

    int a=6;
    public  void run(){
        synchronized(this){
        
        a--;
        System.out.println("value of a after decrement: "+a);
        }
    }
public int geta(){
    return a;
}

}

public class threadexample3 {
public static void main(String[] args) throws InterruptedException {
    Thread4 th = new Thread4();
    Thread t1 = new Thread(th, "one");
    Thread t2 = new Thread(th, "two");
    System.out.println();
    
    t1.start();
    t2.start();

    try{
    t1.join();
    t2.join();
        }  catch(InterruptedException e){
    Thread.currentThread().interrupt();

        System.out.println("Final value of a: " + th.geta());



}

}
    
}
