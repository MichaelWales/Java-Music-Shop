package instruments;

public class Flute extends Instrument{

    private int keys;

    public Flute(String type, String material, String colour, int keys) {
        super(type, material, colour);
        this.keys = keys;
    }

    public int getNumberOfKeys() {
        return this.keys;
    }
}
