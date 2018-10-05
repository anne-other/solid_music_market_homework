package stock_item;

public class SheetMusic extends StockItem {

    private String title;
    private boolean tabs;

    public SheetMusic(String description, double priceBought, double priceToSell, String title, boolean tabs) {
        super(description, priceBought, priceToSell);
        this.title = title;
        this.tabs = tabs;
    }

    public String getTitle() {
        return title;
    }

    public boolean isTabs() {
        return tabs;
    }
}
