<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 33 05/31/2024

1. What we did in the last lesson:
   We solved the **problem of developing an application** for company management:
- created the package structure:
- dao (data access objects)
- models (entity)
- tests
- created an abstract class Employee and an abstract method calcSalary in the model package;
- in the DZ - created the Book class
- created the Company interface
- in DZ - created the Library interface
- inside these interfaces we described a SET OF METHODS that is needed to work with the class (Employee, Book)
- created the CompanyImpl class, which implements Company
- LibraryImpl was created in the DZ
- created the CompanyImplTest class in the tests package
- LibraryImplTest was created in the DZ
-----------
- implement methods in the CompanyImpl class and check their operation in tests
-----------
- create an application EmployeeAppl, in which we create employees and use the developed methods based on the CompanyImpl class

2. New topic:
- **Generics** (abstract classes, abstract methods, **abstract types**)

- **Sorting an array of objects** - Comparable<T> and Comparator<T> interfaces
  see Theory section

3. **Practice:**

- **JsonWrapper** - implementation without parameterization and with parameterization (with generics)

- the **Cat** class and sorting an array of class objects (we train on cats).
  // Create a class Cat, 4 fields maximum
  // standard constructor, getters and setters
  // toString, equals - standard
  // Create a class for testing
  // create an array with class representatives
  // add comparable to the Cat class, override the compareTo method
  // sort the array of cats in the chosen way

___________________________________

# План занятия №33 31.05.2024

1. Что мы сделали на прошлом занятии:
Мы решали **задачу разработки приложения** для управления компанией:
- создали структуру пакетов:
  - dao (data access objects)
  - models (entity - сущности)
  - tests
- создали абстрактный класс Employee и абстрактный метод calcSalary в пакете model;
- в ДЗ - создали класс Book
- создали интерфейс Company
- в ДЗ - создали интерфейс Library
  - внутри этих интерфейсов мы описали НАБОР МЕТОДОВ, который нужен для работы с классом (Employee, Book) 
  - создали класс CompanyImpl, который implements Company
  - в ДЗ создали LibraryImpl
  - создали класс CompanyImplTest в пакете tests
  - в ДЗ создали LibraryImplTest
-----------
- реализуем методы в классе CompanyImpl и проверяем их работу тестам
-----------
- создаем приложение EmployeeAppl, в котором создаем сотрудников и используем разработанные методы на базе класса CompanyImpl

2. Новая тема:
- **Generics** (абстрактные классы, абстрактные методы, **абстрактные типы**)

- **Сортировка массива объектов** - интерфейсы Comparable<T> и Comparator<T>
  см. раздел Теория

3. **Практика:**

- **JsonWrapper** - реализация без параметризации и с параметризацией (с generics)

- класс **Cat** и сортировка массива из объектов класса (тренируемся на кошечках).
  // Cоздать класс Cat, 4 поля максимум
  // стандартные конструктор, геттеры и сеттеры
  // toString, equals - стандартно
  // Создать класс для тестирования
  // создать массив с представителями класса
  // добавить comparable в класс Cat, переопределить метод compareTo
  // отсортировать массив кошек выбранным способом