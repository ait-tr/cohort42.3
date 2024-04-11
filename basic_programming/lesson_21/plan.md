# Lesson plan No. 21 04/11/2024

1. What did we learn and do in the last lesson?
   **Decision protocol:**
   Implementing a LibraryAppl Application
- Book class with control over the creation of books with an ISBN consisting of 13 digits:
  - ... ... ...;
  - ... ... ...;
  - ... ... ...;
  - ... ... ...;
- Library class:
  - Book[] books,
  - int size,
  - constructor with the capacity parameter - library capacity,
  - methods:
    - ... ... addBook(... ...);
    - ... ... findBook(... ...);
    - ... ... printBook(... ...);
    - ... ... removeBook(... ...);
    - ... ... getSize();
- LibraryAppl class
  - created an object... based on the class..., it included the following fields:
    - array...
    - variable ..., which is responsible for ...
    - called methods:
      - addBook
        -printBook
      - getSize
        What did we end up with? (explain in your own words)
  - ...
  - ...

2. Homework - do you have any questions?
   Computer - Stock - ComputerShop

3. Topic of the lesson:
- wrapper classes Integer, BigInteger, Double, Character, Boolean and their methods
- launch the application with command line arguments

4. Practice:

Exercise 1.
Exercises with types from wrapper classes:
- create objects of these types;
- call methods from these classes.

Task 2.
Implement a method for finding the greatest common divisor (GCD) of two natural numbers.
Use Debugger to debug the solution.
Develop an application that is passed two integers as arguments at startup,
the application returns the gcd of these two numbers.

---------------------------------

# План занятия №20 09.04.2024

1. Что мы узнали и сделали на прошлом занятии?
**Протокол решения:**
Реализация приложения LibraryAppl
- класс Book с контролем создания книг с ISBN состоящим из 13 цифр:
  - private String title;
  - private String author;
  - private int yearOfPublishing;
  - private long isbn;
  конструкторы, геттеры и сеттеры, toString, equals & hashCode
  
- класс Library:
  - private Book[] books - это поле класса, это массив объектов типа Book 
  - private int size - это тоже поле, это поле отвечает за актуальное кол-во книг 
  - конструктор с параметром int capacity - вместимость библиотеки,
  - методы:
    - public boolean addBook(Book book);
    - public Book findBook(long isbn);
    - public void printBook();
    - public Book removeBook(long isbn);
    - public int getSize();
    
- класс LibraryAppl
  - создали объект library на базе класса Library, в него попали поля:
    - массив books
    - переменная size, которая отвечает за текущий размер библиотеки
    - вызвали методы:
      - addBook (new Book() )
      - printBook
      - getSize
      - 
Что в итоге мы получили? (объясните своими словами)
  - получили объект library;
  - получили возможность им управлять с помощью методов.

2. Домашнее задание - есть ли вопросы?
Computer - Stock - ComputerShop

3. Тема занятия:
- классы-обертки Integer, BigInteger, Double, Character, Boolean и их методы;
- запуск приложения с аргументами командной строки.

4. Практика:

Задание 1.
Упражнения с типами из классов-оберток:
- создаем объекты этих типов;
- вызываем методы из этих классов.

Задание 2.
Разработать приложение, которому на старте передаются аргументами два целых числа,
приложение возвращает произведение этих двух чисел.

Реализовать метод для нахождения наибольшего общего делителя (НОД) двух натуральных чисел.
Использовать Debugger для отладки решения.