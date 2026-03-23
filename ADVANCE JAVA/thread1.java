class thread2 extends Thread{
    public void run(){
        System.out.println("Thread is running");

    }
    
}
public  class thread1 {
    public static void main(String args[]){
        thread2 t1 = new thread2();
        thread2 t2 = new thread2();
        t2.start();
        t1.start(); 

        
    }
}
