import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Edinburgh");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Edinburgh", busStop.getName());
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.personCount());
    }

}
