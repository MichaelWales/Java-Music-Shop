package instruments;

import interfaces.IPlay;

public class Flute extends Instrument implements IPlay {

    private int keys;

    public Flute(String name, String type, String material, String colour, int keys, double costPrice, double salePrice) {
        super(name, type, material, colour, costPrice, salePrice);
        this.keys = keys;
    }

    public int getNumberOfKeys() {
        return this.keys;
    }

    public String play(Instrument instrument) {
        return "Tu-re-lu-re-lu! I'm a " + instrument.getName() + "!";
    }
}
