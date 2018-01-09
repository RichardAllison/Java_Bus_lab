public class Bus {
    private String destination;
    private int capacity;
    
    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
}
