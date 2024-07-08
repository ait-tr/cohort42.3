package classwork19.beverages;

public class Beverages {
    private double volume; // объем
    private String packingType; // упаковка
    private double price; // цена

    public Beverages(double volume, String packingType, double price) {
        this.volume = volume;
        this.packingType = packingType;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "volume=" + volume +
                ", packingType='" + packingType + '\'' +
                ", price=" + price +
                '}';
    }
}
