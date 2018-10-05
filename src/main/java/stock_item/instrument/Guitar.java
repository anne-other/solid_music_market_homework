package stock_item.instrument;

public class Guitar extends Instrument implements Playable {

    private int numberOfStrings;
    private boolean electric;

    public Guitar(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType, int numberOfStrings, boolean electric) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
        this.numberOfStrings = numberOfStrings;
        this.electric = electric;
    }

    public String play() {
        return "Strum";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean isElectric() {
        return electric;
    }
}
