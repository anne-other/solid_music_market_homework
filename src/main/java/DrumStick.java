public class DrumStick extends StockItem {

    private String size;
    private String material;

    public DrumStick(String description, double priceBought, double priceToSell, String size, String material) {
        super(description, priceBought, priceToSell);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
