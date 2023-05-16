import java.util.ArrayList;

public class BusStop {

    private ArrayList<Passenger> queue;

    public BusStop(){
        this.queue = new ArrayList<>();
    }

    public void addToQueue(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removeFromQueue() {
        if (getQueueSize() >= 1) {
            return this.queue.remove(0);
        } else {
            return null;
        }
    }

    public int getQueueSize() {
        return this.queue.size();
    }
}
