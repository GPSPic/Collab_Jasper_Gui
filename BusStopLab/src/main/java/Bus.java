import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (getPassengerCount() < this.capacity) {
            this.passengers.add(passenger);
        } else {
            System.out.println("Bus full, bugger aff");
        }
    }

    public void removePassenger() {
        if (getPassengerCount() >= 1) {
            this.passengers.remove(0);
        }
    }
}
