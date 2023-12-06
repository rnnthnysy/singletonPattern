package singletonPattern;

public class Customer {
    private int queueNumber;

    public Customer(int queueNumber){
        this.queueNumber = queueNumber;
    }
    public int getQueueNumber(){
        return queueNumber;
    }
    @Override
    public String toString() {
        return "Customer with queue number: " + queueNumber;
    }
}