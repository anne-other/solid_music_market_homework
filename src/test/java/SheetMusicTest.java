import org.junit.Before;
import org.junit.Test;
import stock_item.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet Music", 4.00, 4.99, "Made Of Scars", true);
    }

    @Test
    public void hasDescription() {
        assertEquals("Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void hasAPriceBought() {
        assertEquals(4.00, sheetMusic.getPriceBought(), 0.01);
    }

    @Test
    public void hasAPriceToSell() {
        assertEquals(4.99, sheetMusic.getPriceToSell(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.99, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void hasATitle() {
        assertEquals("Made Of Scars", sheetMusic.getTitle());
    }

    @Test
    public void checkIsTabs() {
        assertEquals(true, sheetMusic.isTabs());
    }
}
