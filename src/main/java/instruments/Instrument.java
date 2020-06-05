package instruments;

import interfaces.ISell;

public abstract class Instrument implements ISell {

    private String name;
    private String type;
    private String material;
    private String colour;
    private double costPrice;
    private double salePrice;

    public Instrument(String name, String type, String material, String colour, double costPrice, double salePrice) {
        this.name = name;
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
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

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getCostPrice();
    }
}
