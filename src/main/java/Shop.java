import accessories.Accessory;
import instruments.Instrument;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double tillBalance;

    public Shop(String name, double tillBalance) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.tillBalance = tillBalance;
    }

    public String getName() {
        return name;
    }

    public int getStockLevels() {
        return stock.size();
    }

    public double getTillBalance() {
        return tillBalance;
    }

    public void setTillBalance(double newBalance) {
        this.tillBalance = newBalance;
    }

    public void buyInstrument(Instrument instrument) {
        if (this.tillBalance >= instrument.getCostPrice()) {
            this.setTillBalance(this.tillBalance -= instrument.getCostPrice());
            this.stock.add(instrument);
        }
    }

    public void sellInstrument(Instrument instrument) {
        this.setTillBalance(this.tillBalance += instrument.getSalePrice());
        this.stock.remove(instrument);
    }

    public void buyAccessory(Accessory accessory) {
        if (this.tillBalance >= accessory.getCostPrice()) {
            this.setTillBalance(this.tillBalance -= accessory.getCostPrice());
            this.stock.add(accessory);
        }
    }

    public void sellAccessory(Accessory accessory) {
        this.setTillBalance(this.tillBalance += accessory.getSalePrice());
        this.stock.remove(accessory);
    }
}
