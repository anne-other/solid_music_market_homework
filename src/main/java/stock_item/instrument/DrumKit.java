package stock_item.instrument;

public class DrumKit extends Instrument implements Playable {

    private int numberOfDrums;

    public DrumKit(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType, int numberOfDrums) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
        this.numberOfDrums = numberOfDrums;
    }

    public String play(){
        return "Boom";
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
}
