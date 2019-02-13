import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {dodgems = new Dodgems("Smashy Bashy");
    }

    @Test
    public void hasName() {
        assertEquals("Smashy Bashy", dodgems.getName());
    }
}
