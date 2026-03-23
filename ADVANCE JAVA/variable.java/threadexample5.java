class Table{
    boolean flag = true;

    public synchronized void table3(int n){
        while(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("table of " + n);
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
        flag = false;
        notify();
    }

    public synchronized void table7(int n){
        while(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("table of " + n);
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
        flag = true;
        notify();
    }
}

class A implements Runnable {
    Table t;
    A(Table t){
        this.t = t;
    }

    public void run(){
        for(int i=0;i<5;i++){
            t.table3(3);
        }
    }
}

class B implements Runnable {
    Table t;
    B(Table t){
        this.t = t;
    }
    public void run(){
        for(int i=0;i<5;i++){
            t.table7(7);
        }
    }
}

public class threadexample5 {
    public static void main(String[] args) {
        Table table = new Table();
        A a1 = new A(table);
        B b1 = new B(table);

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();
    }
}