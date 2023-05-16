import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Passenger passenger;

    @Before
    public void before() {
        busStop = new BusStop();
        passenger = new Passenger();
    }

    @Test
    public void testBusStopQueueSize() {
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void testAddPassenger() {
        busStop.addToQueue(passenger);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void testRemovePassenger() {
        busStop.addToQueue(passenger);
        Passenger removedPassenger = busStop.removeFromQueue();
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void testRemovePassengerFromEmptyStop() {
        busStop.removeFromQueue();
        assertEquals(0, busStop.getQueueSize());
    }

}
