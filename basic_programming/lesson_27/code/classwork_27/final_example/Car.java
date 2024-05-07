package classwork_27.final_example;

public class Car {
    public String vendor;
    public int builtYear;

    public Car(String vendor, int builtYear) {
        this.vendor = vendor;
        this.builtYear = builtYear;
    }


    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }
}
