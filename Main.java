public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS-101", 3);
        System.out.println("Bus Number: BUS-101");
        System.out.println("Initial Seating Arrangement:");
        bus.display();
        System.out.println("Available Seats: " + bus.countseat());
 
        bus.reserveseat(2);
        bus.reserveseat(6);
        bus.reserveseat(11);
        bus.reserveseat(6);

        System.out.println("Updated Seating Arrangement:");
        bus.display();
        System.out.println("Available Seats: " + bus.countseat());
 
        Bus defaultBus = new Bus();
        System.out.println("Default Bus:");
        defaultBus.display();
        System.out.println("Available Seats: " + defaultBus.countseat());
    }
}
