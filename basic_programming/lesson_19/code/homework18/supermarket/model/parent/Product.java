package homework18.supermarket.model.parent;

/*Создать класс Product, с полями:
- private double price
- private String name
- private long barCode;*/

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product: " + " name=" + name + ", price= " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если это тот продукт, который мы ищем, то возвращаем true
        if (o == null || getClass() != o.getClass()) return false; // не из нашего класса, то false
        Product product = (Product) o; // делаем casting до нужного нам класса Product
        return barCode == product.barCode; // сравниваем баркоды
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }
}
