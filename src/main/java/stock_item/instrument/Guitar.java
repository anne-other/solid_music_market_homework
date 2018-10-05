package stock_item.instrument;

public class Guitar extends Instrument implements Playable {

    public Guitar(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
    }

    public String play() {
        return "Strum";
    }
}
