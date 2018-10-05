package stock_item;

public class SheetMusic extends StockItem {

    private String title;

    public SheetMusic(String description, double priceBought, double priceToSell, String title) {
        super(description, priceBought, priceToSell);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
