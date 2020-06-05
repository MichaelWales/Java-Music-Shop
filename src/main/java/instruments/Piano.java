package instruments;

public class Piano extends Instrument{

    private String size;

    public Piano(String type, String material, String colour, String size) {
        super(type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }
}
