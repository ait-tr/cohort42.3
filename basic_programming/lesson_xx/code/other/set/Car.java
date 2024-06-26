package classwork_41.set;

import java.util.Objects;

public class Car implements Comparable<Car>{
    @Override
    public int compareTo(Car o) {
        return this.regNumber.compareTo(o.regNumber);
    }

    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car [regNumber=" + regNumber + ", model=" + model + ", company=" + company + ", engine=" + engine
                + ", color=" + color + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumber);
    }
}
