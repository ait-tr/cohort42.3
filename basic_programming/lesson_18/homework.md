# Homework

**Task 1**

Create a class Product, with fields private double price; private String name; private long barCode;
Create a Food class that extends the Product class with a private String expDate field that stores the expiration date.
Create a MeatFood class that extends the Food class with a private String meatType field that stores the type of meat from which the product is made.
Create a MilkFood class extending the Food class with private String milkType fields,
private double fat, which store the type of milk and fat content of the product, respectively.
In all classes, override the toString method.
In the main method, create an array that stores one object for each product.
Create a method that prints all products from the array, and a method that returns the sum of the prices of all products.

**Task 2.**
In Task 1, override the equals method to compare objects.
In the ProductsAppl class, create a method that prints all non-food products to the console.
In the ProductsAppl class, create a method that accepts a barcode and returns a product with this barcode.
In the main method, call new methods. Print the result of their work to the console.


_______________________________________________________

# Домашнее задание

## Задание 0.
Читать теорию!

**Задача 1.**
Создать класс Product, с полями:
- private double price 
- private String name
- private long barCode;
Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности.
Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса из которого 
изготовлен продукт.
Создать класс MilkFood расширяющий класс Food с полями private String milkType,
private double fat, которые хранят тип молока и жирность продукта соответственно.
Во всех классах переопределить метод toString.
В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.

**Задача 2.**
В Задаче 1 переопределить метод equals для сравнения объектов.
В классе ProductsAppl создать метод печатающий в консоль все не пищевые продукты.
В классе ProductsAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом.
В методе main вызвать новые методы. Результат их работы напечатать в консоль.