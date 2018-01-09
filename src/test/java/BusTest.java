import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    BusStop busStop;
    Person person1;
    Person person2;
    ArrayList<Person> passengers;

    @Before
    public void before(){
        person1 = new Person();
        person2 = new Person();
        busStop = new BusStop("Edinburgh");
        passengers = new ArrayList<>();
//        passengers.add(person1);
//        passengers.add(person2);
        bus = new Bus("Glasgow", 1, passengers);

    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addPerson(person1);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void wontAddPassengerWhenBusFull(){
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        bus.pickUpPassenger(busStop);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPerson(person1);
        bus.pickUpPassenger(busStop);
        bus.removePassenger(person1);
        assertEquals(0, bus.passengerCount());
    }

}
