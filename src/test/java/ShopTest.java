import org.junit.Before;
import org.junit.Test;
import stock_item.DrumStick;
import stock_item.SheetMusic;
import stock_item.StockItem;
import stock_item.instrument.DrumKit;
import stock_item.instrument.Guitar;
import stock_item.instrument.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    
    Shop shop;
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet Music", 5.00, 9.99, "Wait And Bleed", true);
        DrumStick drumStick = new DrumStick("Drum Stick", 4.50, 8.99, "7B", "Acrylic");
        DrumKit drumKit = new DrumKit("Drum Kit", 500.00, 625.00, "Perspex", "Green", InstrumentType.PERCUSSION, 7, 8, 3);
        Guitar guitar = new Guitar("Guitar", 50.00, 75.00, "Beach", "Purple", InstrumentType.STRINGS, 4, true);

        ArrayList<StockItem> stockItems = new ArrayList<>();
        stockItems.add(sheetMusic);
        stockItems.add(drumStick);
        stockItems.add(drumKit);
        stockItems.add(guitar);

        shop = new Shop(stockItems);
    }

    @Test
    public void getStockSize() {
        assertEquals(4, shop.stockCount());
    }

    @Test
    public void canAddSheetMusicToStock() {
        shop.addStock(sheetMusic);
        assertEquals(5, shop.stockCount());
    }

    @Test
    public void canRemoveSheetMusicFromStock() {
        shop.removeStock(sheetMusic);
        assertEquals(3, shop.stockCount());
    }
}
