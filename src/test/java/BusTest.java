import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus myBus;
    private Person myPassenger;
    private Person secondPassenger;
    @Before
    public void before(){
        myBus = new Bus("Canonmills", 1);
        myPassenger = new Person();
        secondPassenger = new Person();
    }

    @Test
    public void hasProperties(){
        assertEquals("Canonmills", myBus.getDestination());
        assertEquals(1, myBus.getCapacity());
        assertEquals(0, myBus.getPassengerCount());
    }
    @Test
    public void canAddPassenger(){
        myBus.add(myPassenger);
        assertEquals(1, myBus.getPassengerCount());
    }
    @Test
    public void willNotGoOverCapacity(){
        myBus.add(myPassenger);
        myBus.add(secondPassenger);
        assertEquals(1, myBus.getPassengerCount());
    }
    @Test
    public void canRemovePassenger(){
        myBus.add(myPassenger);
        myBus.removePassenger();
        assertEquals(0, myBus.getPassengerCount());
    }
}
