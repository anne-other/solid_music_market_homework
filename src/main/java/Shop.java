import stock_item.StockItem;

import java.util.ArrayList;

public class Shop {

    ArrayList<StockItem> stockItems;

    public Shop(ArrayList<StockItem> stockItems) {
        this.stockItems = stockItems;
    }

    public int stockCount() {
        return stockItems.size();
    }


    public void addStock(StockItem stockItem) {
        stockItems.add(stockItem);
    }
}
