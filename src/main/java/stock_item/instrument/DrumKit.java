package stock_item.instrument;

public class DrumKit extends Instrument implements Playable {

    private int numberOfDrums;
    private int numberOfSymbols;
    private int numberOfPedals;

    public DrumKit(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType, int numberOfDrums, int numberOfSymbols, int numberOfPedals) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
        this.numberOfDrums = numberOfDrums;
        this.numberOfSymbols = numberOfSymbols;
        this.numberOfPedals = numberOfPedals;
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

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
