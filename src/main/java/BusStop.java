import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getPassengersWaiting(){
        return queue.size();
    }
    public void add(Person passenger){
        queue.add(passenger);
    }
    public Person removePassenger(){
        return queue.remove(0);
    }
}
