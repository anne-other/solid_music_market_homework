package stock_item.instrument;

import stock_item.StockItem;

public abstract class Instrument extends StockItem {

    private String material;
    private String colour;
    private Enum InstrumentType;

    public Instrument(String description, double priceBought, double priceToSell, String material, String colour, Enum InstrumentType) {
        super(description, priceBought, priceToSell);
        this.material = material;
        this.colour = colour;
        this.InstrumentType = InstrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Enum getInstrumentType() {
        return InstrumentType;
    }
}

