package classwork.car.model;

public class Car {

    // цвет - String color = белый, красный, ...
    // марка (бренд) - String brand = Mercedes, BMW, VW, Audi,...
    // тип трансмиссии - boolean isManual = true, false
    // цена - int price = 100 000
    // год выпуска - int age = 2025, 2016, ...
    // пробег - int km = ...

    // fields - поля - это характеристики объекта, который есть в классе

    private String color;
    private String brand;
    private boolean isManual;
    private int price;
    private int age;
    private int km;

    // совокупность этих полей описывает (задает, формирует) объект

    // constructor
    public Car(String color, String brand, boolean isManual, int price, int age, int km) {
        this.color = color;
        this.brand = brand;
        this.isManual = isManual;
        this.price = price;
        this.age = age;
        this.km = km;
    }

    // getters and setters (геттеры и сеттеры)
    // геттеры - это методы, которые позволяют получить значения полей (get = получить)
    // сеттеры - это методы, которые позволяют установить значения полей (set = установить)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void moveCar(){
        System.out.println("Car is moving...");
    }

    public void displayCar(){
        System.out.println("Brand: " + brand + ", color: " + color + ", is manual: " + isManual + ", age: " + age + ", price: " + price);
    }

}
