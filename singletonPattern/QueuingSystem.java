package singletonPattern;
import java.util.LinkedList;
import java.util.Queue;

public class QueuingSystem {
    private static QueuingSystem instance;

    private Queue<Customer> queue;
    private int currentQueuedNumber;

    private QueuingSystem() {
        queue = new LinkedList<>();
        currentQueuedNumber = 1;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized Customer enqueueCustomer() {
        Customer customer = new Customer(currentQueuedNumber++);
        queue.add(customer);
        return customer;
    }

    public synchronized void resetQueueNumber(int newNumber) {
        currentQueuedNumber = newNumber;
        queue.clear();
        System.out.println("Queue numbers reset to: " + newNumber);
    }

    public synchronized Customer serveNextCustomer() {
        return queue.poll();
    }

    public synchronized int getCurrentQueuedNumber() {
        return currentQueuedNumber;
    }

    public synchronized Queue<Customer> getQueue() {
        return new LinkedList<>(queue);
    }
}
