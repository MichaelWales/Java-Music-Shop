package instruments;

import interfaces.IPlay;

public class Guitar extends Instrument implements IPlay{

    private int strings;

    public Guitar(String name, String type, String material, String colour, int strings, double costPrice, double salePrice) {
        super(name, type, material, colour, costPrice, salePrice);
        this.strings = strings;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }

    public String play(Instrument instrument) {
        return "Brrrmmmmm! I'm a " + instrument.getName() + "!";
    }
}
