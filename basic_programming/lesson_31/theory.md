<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Theory

## Abstract classes and methods
1. It can be very useful to create a class from which other classes should inherit, but at the same time it is necessary to prohibit the creation of objects of this parent class.
   In this case, you can declare the parent class as abstract by using the abstract keyword before the class name. Objects of an abstract class cannot be created (the compiler does not allow it).

2. You can create abstract methods in abstract classes. These are methods that have the abstract keyword in their signature and no method body. Abstract methods must be overridden in child classes (polymorphism). If a child class does not override an abstract method, then it (the class) must also be declared abstract, etc.

**Example:**
Abstract class Shape (geometric figure).
Abstract methods: calculateArea, calculatePerimeter

Child classes Circle, Square, Triangle
Each child class will need to define (implement) its own calculateArea and calculatePerimeter methods.


## Interfaces

- interfaces:
- In Java, you can create a structure (New Java Class, select Interface) in which only abstract methods are specified - these are methods that have only a signature and no body.

Such structures are called **interfaces**, and are defined using the **interface** keyword.
Classes can implement interfaces using the **implements** keyword.

In Java, classes can only extend one class, BUT they can implement
(implements) several interfaces. In this case, the implemented interfaces are listed separated by commas.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Теория

## Абстрактные классы и методы
1. Бывает очень полезным создать класс от которого должны наследоваться другие классы, но при это надо запретить создание объектов этого родительского класса.

В этом случае можно объявить родительский класс как **абстрактный**, используя ключевое слово **abstract** перед именем класса. Объекты абстрактного класса создавать нельзя (компилятор не позволяет).

2. В абстрактных классах можно создавать абстрактные методы. Это методы у которых в сигнатуре присутствует ключевое слово abstract и отсутствует тело метода. Абстрактные методы должны быть переопределены в дочерних классах (полиморфизм). Если дочерний класс не переопределяет абстрактный метод, то он (класс) тоже должен быть объявлен как абстрактный и т.д.

**Пример:**
Абстрактный класс Shape (геометрическая фигура).
Абстрактные методы: calculateArea, calculatePerimeter

Дочерние классы Circle, Square, Triangle
В каждом дочернем классе потребуется определить (реализовать) свои методы calculateArea, calculatePerimeter.


## Интерфейсы

- интерфейсы:
  - В Java можно создать структуру (New Java Class, выбираем Interface), в которой указаны только абстрактные методы - это методы, у которых есть только сигнатура и нет тела.

Такие структуры называются **интерфейсами**, и определяются при помощи ключевого слова **interface**.
Классы могут имплементировать интерфейсы при помощи ключевого слова **implements**.

В Java классы могут расширять (extends) только один класс, НО могут имплементировать
(implements) несколько интерфейсов. В этом случае имплементируемые интерфейсы перечисляются через запятую.

</details>

