# Methods

**Methods** are the basic “building blocks” in Java for implementing various functionality.
DRY (Don’t repeat yourself) is the basic principle of software development.

# Variables
- identifiers that are assigned specific values
- name with a small letter
- when declaring, it is necessary to indicate the **type of data** that will be stored in this variable

Java is a strongly typed language! All variables must be explicitly declared before use, with an EXPLICIT indication of their type.

# Primitive data types:

There are **8 primitive data types** in Java:
+ byte - an integer takes up 1 byte in memory
+ short - an integer takes up 2 bytes in memory
+ char - positive integer takes up 2 bytes in memory
+ int - an integer takes up 4 bytes in memory
+ long - an integer takes up 8 bytes in memory
+ float - a floating point number takes 4 bytes in memory
+ double - floating point number takes 8 bytes in memory
+ boolean - a special logical type that takes one of two values: true or false

String is a non-primitive data type; it is responsible for a string (a set of characters).

# Basic arithmetic operations:
     - + addition
     - - subtraction
     - * multiplication

     - / integer division (we get the integer part from the division)
     Examples:

     - % division with remainder (we get the remainder of the division)


---------------------------------

# Методы

**Методы** - основные "строительные кирпичики" в Java, для реализации различных функциональностей.
DRY (Don’t repeat yourself - не повторяйся) - основной принцип разработки программного обеспечения.

# Переменные
- идентификаторы, которым присваиваются конкретные значения
- называть с маленькой буквы
- при объявлении обязательно необходимо указывать **тип данных**, которые будут храниться в этой переменной

Java - строго типизированный язык! Все переменные должны быть явно объявлены перед использованием с ЯВНЫМ указанием их типа.

# Примитивные типы данных:

В Java существует **8 примитивных типов данных**:
+ byte - целое число занимает в памяти 1 байт (8 бит = 8 ячеек, которые могут содержать только 0 или 1)
  11111111 - это число в двоичной системе счисления 128
+ short (короткий) - целое число занимает в памяти 2 байта
+ char (символ) - целое положительное число занимает в памяти 2 байта
+ int (integer - целый) - целое число занимает в памяти 4 байта
  11111111 11111111 11111111 11111111
+ long (длинное целое) - целое число занимает в памяти 8 байт
  11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111 ... 
+ float (плавающий) - число с плавающей точкой занимает в памяти 4 байта
+ double (двойная точность) - число с плавающей точкой занимает в памяти 8 байт

+ boolean () - специальный логический тип принимающий одно из двух значений: true или false

String - это не примитивный тип данных, отвечает за строку (набор символов).

# Основные арифметические операции:
    - + сложение
    - - вычитание
    - * умножение

    - / деление нацело(**получаем целую часть от деления**)
    Примеры:
        25 / 7 = 3
        37 / 6 = 6
        100 / 25 = 4
        101 / 25 = 4

    - % деление с остатком (получаем остаток от деления)
    Примеры:
        25 % 7 = 4 (7 * 3 = 21 , 25 - 21 = 4)
        37 % 6 = 1
        100 % 25 = 0
        101 % 25 = 1

        13 % 4 = 1 (3 * 4 = 12, 1 в остатке)

        20 % 2 = 0 - это четное число
        21 % 2 = 1 - эно числн нечетное
    