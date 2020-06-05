package instruments;

import interfaces.IPlay;

public class Timpani extends Instrument implements IPlay {

    String clutch;

    public Timpani(String name, String type, String material, String colour, String clutch, double costPrice, double salePrice) {
        super(name, type, material, colour, costPrice, salePrice);
        this.clutch = clutch;
    }

    public String getClutchType() {
        return this.clutch;
    }

    public String play(Instrument instrument) {
        return "BOOM! BOOM! BOOM! I'm a " + instrument.getName() + "!";
    }
}
