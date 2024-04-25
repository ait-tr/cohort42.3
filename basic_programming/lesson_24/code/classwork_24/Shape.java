package classwork_24;

// создайте иерархию классов для представления различных
// 5 геометрических фигур, используя абстрактные классы и методы.

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}


class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}


class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Square("red", 3),
            new Square("white", 11),
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}
