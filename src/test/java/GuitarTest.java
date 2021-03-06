import org.junit.Before;
import org.junit.Test;
import stock_item.instrument.Guitar;
import stock_item.instrument.Instrument;
import stock_item.instrument.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Guitar", 150.00, 199.99, "Ebony", "Black", InstrumentType.STRINGS, 6, true);
    }

    @Test
    public void hasDescription() {
        assertEquals("Guitar", guitar.getDescription());
    }

    @Test
    public void hasAPriceBought() {
        assertEquals(150.00, guitar.getPriceBought(), 0.01);
    }

    @Test
    public void hasAPriceToSell() {
        assertEquals(199.99, guitar.getPriceToSell(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(49.99, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void hasmaterial() {
        assertEquals("Ebony", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void canBePlayed() {
        assertEquals("Strum", guitar.play());
    }

    @Test
    public void hasSixStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void checkIsElectric() {
        assertEquals(true, guitar.isElectric());
    }

    @Test
    public void checkIsAcoustic() {
        Guitar guitar1 = new Guitar("Guitar", 200.00, 249.99, "Mahogany", "Brown", InstrumentType.STRINGS, 6, false);
        assertEquals(false, guitar1.isElectric());
    }
}
