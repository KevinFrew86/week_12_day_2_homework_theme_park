import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostTrainTest {

    GhostTrain ghostTrain;

    @Before
    public void before() {ghostTrain = new GhostTrain("Spookyrail");
    }

    @Test
    public void hasName() {
        assertEquals("Spookyrail", ghostTrain.getName());
    }
}
