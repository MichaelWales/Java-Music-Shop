package instruments;

public abstract class Instrument{

    private String name;
    private String type;
    private String material;
    private String colour;

    public Instrument(String name, String type, String material, String colour) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
