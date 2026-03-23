class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 5; i++){
        System.out.println("Thread Name: " + getName());
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
    public void run(int n){
        System.out.println(n);
    }
}
public class GetName{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("First");
        MyThread t2 = new MyThread("Second");
        Thread t3 = new Thread();
        t1.start();
        t2.start();
        t3.start();
        t1.setName("Third");
    System.out.println("After changing name of t1: "+ t1.getName());
    System.out.println(t1.getPriority());
    }
}

