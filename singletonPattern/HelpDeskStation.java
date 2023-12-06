package singletonPattern;

public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer(QueuingSystem queuingSystem) {
        Customer nextCustomer = queuingSystem.serveNextCustomer();
        if (nextCustomer != null) {
            System.out.println("Help Desk Station " + stationName + " is serving customer with queue number: " + nextCustomer.getQueueNumber());
        } else {
            System.out.println("Help Desk Station " + stationName + " has no customers to serve.");
        }
    }

    public void resetQueueNumber(QueuingSystem queuingSystem, int newNumber) {
        queuingSystem.resetQueueNumber(newNumber);
    }
}