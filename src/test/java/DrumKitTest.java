import org.junit.Before;
import org.junit.Test;
import stock_item.instrument.DrumKit;
import stock_item.instrument.Instrument;
import stock_item.instrument.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void setUp() throws Exception {
        drumKit = new DrumKit("Drum Kit", 250.00, 499.99, "Cherry Wood", "Red", InstrumentType.PERCUSSION, 5, 4);
    }

    @Test
    public void hasDescription() {
        assertEquals("Drum Kit", drumKit.getDescription());
    }

    @Test
    public void hasAPriceBought() {
        assertEquals(250.00, drumKit.getPriceBought(), 0.01);
    }

    @Test
    public void hasAPriceToSell() {
        assertEquals(499.99, drumKit.getPriceToSell(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(249.99, drumKit.calculateMarkup(), 0.01);
    }

    @Test
    public void hasmaterial() {
        assertEquals("Cherry Wood", drumKit.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", drumKit.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drumKit.getInstrumentType());
    }

    @Test
    public void canBePlayed() {
        assertEquals("Boom", drumKit.play());
    }

    @Test
    public void hasfiveDrums() {
        assertEquals(5, drumKit.getNumberOfDrums());
    }

    @Test
    public void hasfourSymbols() {
        assertEquals(4, drumKit.getNumberOfSymbols());
    }
}
