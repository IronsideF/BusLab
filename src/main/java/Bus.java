import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getPassengerCount(){
        return passengers.size();
    }
    public void add(Person passenger){
        if (getPassengerCount()<capacity){
            passengers.add(passenger);
        }
    }
    public Person removePassenger(){
        return passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        passengers.add(busStop.removePassenger());
    }
}
