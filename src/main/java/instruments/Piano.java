package instruments;

import interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private String size;

    public Piano(String name, String type, String material, String colour, String size) {
        super(name, type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public String play(Instrument instrument) {
        return "Plink! Plonk! I'm a " + instrument.getName() + "!";
    }
}
