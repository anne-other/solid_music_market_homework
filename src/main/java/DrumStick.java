public class DrumStick extends StockItem {

    private String size;

    public DrumStick(String description, double priceBought, double priceToSell, String size) {
        super(description, priceBought, priceToSell);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
