import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class threadexample6 {

    static class Pizza {
        final int id;
        final String type;

        Pizza(int id, String type) {
            this.id = id;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Pizza#" + id + "(" + type + ")";
        }
    }

    static class PizzaBox {
        private final Queue<Pizza> queue = new LinkedList<>();
        private final int capacity;
        private boolean closed = false;

        PizzaBox(int capacity) {
            this.capacity = capacity;
        }

        public synchronized void put(Pizza p) throws InterruptedException {
            while (queue.size() == capacity) {
                wait();
            }
            queue.add(p);
            System.out.println("Chef placed " + p + " in the box. (size=" + queue.size() + ")");
            notifyAll();
        }

        public synchronized Pizza take() throws InterruptedException {
            while (queue.isEmpty()) {
                if (closed) return null; // no more pizzas will arrive
                wait();
            }
            Pizza p = queue.remove();
            System.out.println(Thread.currentThread().getName() + " took " + p + ". (size=" + queue.size() + ")");
            notifyAll();
            return p;
        }

        public synchronized void close() {
            closed = true;
            notifyAll();
        }
    }

    static class Chef implements Runnable {
        private final PizzaBox box;
        private final int total;
        private final Random rnd = new Random();
        private final String[] menu = {"Margherita", "Pepperoni", "Veggie", "BBQ Chicken"};

        Chef(PizzaBox box, int total) {
            this.box = box;
            this.total = total;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= total; i++) {
                    Thread.sleep(200 + rnd.nextInt(400)); // make time
                    Pizza p = new Pizza(i, menu[rnd.nextInt(menu.length)]);
                    box.put(p);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                box.close();
                System.out.println("Chef finished preparing pizzas.");
            }
        }
    }

    static class Customer implements Runnable {
        private final PizzaBox box;
        private final Random rnd = new Random();

        Customer(PizzaBox box) {
            this.box = box;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Pizza p = box.take();
                    if (p == null) break; // no more pizzas coming and box empty
                    // simulate eating
                    System.out.println(Thread.currentThread().getName() + " is eating " + p);
                    Thread.sleep(300 + rnd.nextInt(500));
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(Thread.currentThread().getName() + " is done.");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PizzaBox box = new PizzaBox(3); // capacity
        int totalPizzas = 10;
        Thread chef = new Thread(new Chef(box, totalPizzas), "Chef");
        Thread customer1 = new Thread(new Customer(box), "Customer-1");
        Thread customer2 = new Thread(new Customer(box), "Customer-2");
        Thread customer3 = new Thread(new Customer(box), "Customer-3");

        chef.start();
        customer1.start();
        customer2.start();
        customer3.start();

        chef.join();
        customer1.join();
        customer2.join();
        customer3.join();

        System.out.println("All done. Shop is closed.");
    }
}
