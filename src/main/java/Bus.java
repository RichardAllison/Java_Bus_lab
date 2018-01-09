import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
    
    public Bus(String destination, int capacity, ArrayList<Person> passengers){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = passengers;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }
}
