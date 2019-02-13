import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {tobaccoStall = new TobaccoStall("Smokey Boys", "Babs", "Poochy Lot");
    }

    @Test
    public void hasName() {
        assertEquals("Smokey Boys", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Babs", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("Poochy Lot", tobaccoStall.getParkingSpot());
    }
}
