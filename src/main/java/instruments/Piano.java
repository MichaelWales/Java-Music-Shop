package instruments;

import interfaces.IPlay;

public class Piano extends Instrument implements IPlay{

    private String size;

    public Piano(String name, String type, String material, String colour, String size, double costPrice, double salePrice) {
        super(name, type, material, colour, costPrice, salePrice);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public String play(Instrument instrument) {
        return "Plink! Plonk! I'm a " + instrument.getName() + "!";
    }
}
