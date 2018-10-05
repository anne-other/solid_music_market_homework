import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("Drum Stick", 5.00, 8.99, "5A", "Hickory");
    }

    @Test
    public void hasDescription() {
        assertEquals("Drum Stick", drumStick.getDescription());
    }

    @Test
    public void hasAPriceBought() {
        assertEquals(5.00, drumStick.getPriceBought(), 0.01);
    }

    @Test
    public void hasAPriceToSell() {
        assertEquals(8.99, drumStick.getPriceToSell(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.99, drumStick.calculateMarkup(), 0.01);
    }

    @Test
    public void hasAWeight() {
        assertEquals("5A", drumStick.getSize());
    }

    @Test
    public void hasAMaterial() {
        assertEquals("Hickory", drumStick.getMaterial());
    }
}
