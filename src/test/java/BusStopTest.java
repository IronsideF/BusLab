import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop myBusStop;
    private Person myPassenger;
    private Person secondPassenger;
    private Bus myBus;

    @Before
    public void before(){
        myBusStop = new BusStop("Princes Street");
        myPassenger = new Person();
        secondPassenger = new Person();
        myBus = new Bus("Canonmills", 1);
    }
    @Test
    public void hasProperties(){
        assertEquals("Princes Street", myBusStop.getName());
        assertEquals(0, myBusStop.getPassengersWaiting());
    }
    @Test
    public void canAddPassenger(){
        myBusStop.add(myPassenger);
        assertEquals(1, myBusStop.getPassengersWaiting());
    }
    @Test
    public void canRemovePassenger(){
        myBusStop.add(myPassenger);
        myBusStop.removePassenger();
        assertEquals(0, myBusStop.getPassengersWaiting());
    }
    @Test
    public void canPickUp(){
        myBusStop.add(myPassenger);
        myBus.pickUp(myBusStop);
        assertEquals(0, myBusStop.getPassengersWaiting());
        assertEquals(1, myBus.getPassengerCount());
    }

}
