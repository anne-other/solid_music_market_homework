package stock_item.instrument;

public class Guitar extends Instrument implements Playable {

    private int numberOfStrings;

    public Guitar(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType, int numberOfStrings) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Strum";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
