**Task 1.**
Create a Cube class that describes a cube with side a.
Implement in it methods for determining the perimeter p (the sum of the lengths of all edges),
area s (the sum of the areas of all faces) and volume v.
Create a CubeAppl application in which to create several instances of the Cube class.
For each instance, call the methods of the Cube class and calculate p, s and v.

**Task 2.**
Create a ``Book`` class in the ``ait.book.model`` package. In this class, define the fields:
``private long isbn; private String title; private String author; private int yearOfPublishing;``
Create constructors to initialize all fields, and a constructor to initialize the field when
absence of the author. The rest of the designers are at your discretion. Create getters and setters,
based on logic and necessity.
Create a ``public void display()`` method to print book information to the console.

Create a class ``BookAppl`` in the package ``ait.book`` with the main method.
In the main method, create several instances of ``Book`` and display the result of the display method for each of them.

**Task 3.(*)**
The barcode has a strictly regulated length, that is, the number of digits
which it contains (usually 8 or 13 digits).
Create a Code class in which to implement the methods:
- lengthCode(long code), which returns the length of the barcode
- controlSum(long code), which returns the sum of all digits of the barcode
- isValid(long code), which checks the barcode for the correct number of digits

-----------------------------------------------------------

**Задача 1.**
Создать класс Cube, описывающий куб cо стороной a.
Реализовать в нем методы определения периметра p (сумма длин всех ребер),
площади s (сумма площадей всех граней) и объема v.
Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

**Задача 2.**
Создать класс ``Book`` в пакете ``book.model``. В этом классе определить поля:
``private long isbn; private String title; private String author; private int yearOfPublishing;``
Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при
отсутствии автора. Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры,
исходя из логики и необходимости.
Создать метод ``public void display()`` для печати в консоль информации о книге.

Создать класс ``BookAppl`` в пакете ``ait.book`` с методом main.
В методе main создать несколько экземпляров ``Book`` и вывести для каждого из них результат работы метода display.

**Задание 3.(*)**
Штрих-код имеет строго регламентированную длину, то есть количество цифр,
которое в нем содержится (обычно это 8 или 13 цифр).
Создать класс Code, в котором реализовать методы:
- lengthCode(long code), который возвращает длину штрих-кода
- controlSum(long code), который возвращает сумму всех цифр штрих кода
- isValid(long code), который проверяет штрих-код на правильное количество цифр