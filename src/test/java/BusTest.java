import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person1;
    Person person2;
    ArrayList<Person> passengers;

    @Before
    public void before(){
        person1 = new Person();
        person2 = new Person();
        passengers = new ArrayList<>();
//        passengers.add(person1);
//        passengers.add(person2);
        bus = new Bus("Glasgow", 100, passengers);

    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
}
