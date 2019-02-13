import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {iceCreamStall = new IceCreamStall("Cold Guys", "Davey", "Itchy Lot");
    }

    @Test
    public void hasName() {
        assertEquals("Cold Guys", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Davey",iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("Itchy Lot", iceCreamStall.getParkingSpot());
    }
}
