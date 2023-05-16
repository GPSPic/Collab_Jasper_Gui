import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;
    Passenger passenger2;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("The Jewel", 100);
        passenger = new Passenger();
        passenger2 = new Passenger();
        busStop = new BusStop();
    }

    @Test
    public void testGetPassengers() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void testAddPassenger() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void testBusFull() {
        Bus smallBus = new Bus("Nowhere", 1);
        smallBus.addPassenger(passenger);
        smallBus.addPassenger(passenger2);
        assertEquals(1, smallBus.getPassengerCount());
    }

    @Test
    public void testRemovePassenger() {
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void testPickUpFromStop() {
        busStop.addToQueue(passenger);
        bus.pickUp(busStop);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(0, busStop.getQueueSize());
    }

}
