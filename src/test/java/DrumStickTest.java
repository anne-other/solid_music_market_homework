import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("Drum Stick", 5.00, 8.99);
    }

    @Test
    public void hasDescription() {
        assertEquals("Drum Stick", drumStick.getDescription());
    }

    @Test
    public void hasAPriceBought() {
        assertEquals(5.00, drumStick.getPriceBought(), 0.01);
    }
}
