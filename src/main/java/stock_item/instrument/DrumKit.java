package stock_item.instrument;

public class DrumKit extends Instrument implements Playable {

    public DrumKit(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType) {
        super(description, priceBought, priceToSell, material, colour, InstrumentType);
    }

    public String play(){
        return "Boom";
    }
}
