package instruments;

public class Guitar extends Instrument{

    private int strings;

    public Guitar(String type, String material, String colour, int strings) {
        super(type, material, colour);
        this.strings = strings;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }
}
