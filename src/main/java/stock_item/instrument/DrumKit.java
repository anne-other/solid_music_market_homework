package stock_item.instrument;

public class DrumKit extends Instrument implements Playable {

    private int numberOfDrums;
    private int numberOfSymbols;

    public DrumKit(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType, int numberOfDrums, int numberOfSymbols) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
        this.numberOfDrums = numberOfDrums;
        this.numberOfSymbols = numberOfSymbols;
    }

    public String play(){
        return "Boom";
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }
}
