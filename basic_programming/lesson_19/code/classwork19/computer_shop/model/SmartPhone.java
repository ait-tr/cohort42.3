package classwork19.computer_shop.model;

public class SmartPhone extends Laptop {

    private int cameraResolution;
    private long imei;

    public SmartPhone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity, int cameraResolution, long imei) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryCapacity);
        this.cameraResolution = cameraResolution;
        this.imei = imei;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" +
                "cameraResolution=" + cameraResolution +
                ", imei=" + imei +
                '}';
    }
}
