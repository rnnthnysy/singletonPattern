package singletonPattern;

public class CentralizedQueuingSystemDemo {
    public static void main(String[] args) {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        HelpDeskStation station1 = new HelpDeskStation("1");
        HelpDeskStation station2 = new HelpDeskStation("2");
        HelpDeskStation station3 = new HelpDeskStation("3");

        // Simulating customers arriving at the office
        Customer customer1 = queuingSystem.enqueueCustomer();
        Customer customer2 = queuingSystem.enqueueCustomer();

        // Simulating serving customers at help desk stations
        station1.serveNextCustomer(queuingSystem);
        station2.serveNextCustomer(queuingSystem);

        // Displaying current queued numbers
        System.out.println("Current Queued Numbers: " + queuingSystem.getQueue());

        // Simulating resetting queue numbers
        station1.resetQueueNumber(queuingSystem, 100);

        // Simulating serving more customers
        station3.serveNextCustomer(queuingSystem);
        Customer customer3 = queuingSystem.enqueueCustomer();

        // Displaying current queued numbers after the reset
        System.out.println("Current Queued Numbers: " + queuingSystem.getQueue());
    }
}
