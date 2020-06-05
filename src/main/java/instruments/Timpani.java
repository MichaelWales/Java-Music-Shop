package instruments;

public class Timpani extends Instrument{

    String clutch;

    public Timpani(String type, String material, String colour, String clutch) {
        super(type, material, colour);
        this.clutch = clutch;
    }

    public String getClutchType() {
        return this.clutch;
    }
}
