package accessories;

import interfaces.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double costPrice;
    private double salePrice;

    public Accessory(String description, double costPrice, double salePrice) {
        this.description = description;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
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
