import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {candyFlossStall = new CandyFlossStall("Floss Boss", "Bryan", "Scratchy Lot");
    }

    @Test
    public void hasName() {
        assertEquals("Floss Boss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Bryan",candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("Scratchy Lot", candyFlossStall.getParkingSpot());
    }
}
