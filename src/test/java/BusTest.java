import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person1;
    Person person2;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 100);
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, bus.getCapacity());
    }
}
