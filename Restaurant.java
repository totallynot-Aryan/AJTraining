/*
class Restaurant {
    private String orderName;
    private boolean isOrderReady;

    public synchronized void foodOrder(String orderName) {
        while (!isOrderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Waiter received the order: " + orderName);
        isOrderReady = false;
        notifyAll();
    }

    public synchronized void cookedOrder(String orderName) {
        while (isOrderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chef has received the order: " + orderName);
        System.out.println("Order is being prepared...");
        isOrderReady = true;
        notifyAll();
    }

    public synchronized void receivedOrder(String orderName) {
        while (isOrderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Customer received the order: " + orderName);
        isOrderReady = true;
        notifyAll();
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant rst = new Restaurant();

        Thread waiter = new Thread(() -> { rst.foodOrder("Burger");}, "Waiter");
        Thread cook = new Thread(() -> { rst.cookedOrder("Burger");}, "Chef");
        Thread customer = new Thread(() -> { rst.receivedOrder("Burger");}, "Customer");

        waiter.start();
        cook.start();
        customer.start();
    }
}
*/