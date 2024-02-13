# Lesson plan No. 4 02/13/2024:

## What we learned and did in the last lesson:
**8 primitive data types**:
* byte: 8-bit signed integer. The range of values is from -128 to 127.
* short: 16-bit signed integer. The range of values is -32.768 to 32.767.
* int: 32-bit signed integer. Values range from -2^31 to (2^31)-1, where ^ denotes exponentiation.
* long: 64-bit signed integer. The range of values is from -2^63 to (2^63)-1.
* float: 32-bit single precision floating point number. The range of values is approximately -3.40282347E+38F to 3.40282347E+38F.
* double: 64-bit double precision floating point number. The range of values is approximately -1.7976931348623157E+308 to 1.7976931348623157E+308.
* char: A 16-bit data type representing a Unicode character. The range of values is from 0 to 65.535.
* boolean: a Boolean data type that accepts only two values: true or false.

# Variables
- identifiers that are assigned specific values
- name with a small letter
- when declaring, it is necessary to indicate the **type of data** that will be stored in this variable

Java is a strongly typed language!
All variables must be explicitly declared before use, with an **EXPLICIT** indication of their type.

RAM has two areas for storing data:
- area 1 - ...
- area 2 - ...

The identifier (name) of the variable is stored in ..., the value of the variable is stored in ...

Mathematical operations:
'+', '-', '*' - as usual.
'/' - whole division (**we get the whole part of the division**), 35 / 8 = ???
'%' - division with remainder (**get the remainder of the division**), 35% 8 = ???
-------------------------------------------------- --------------------------

## Plan for today's lesson: Methods arguments. Return.

### New topic - methods and their arguments, return - getting the result

- see the theory section.

### Practice:

**Tasks**

1. Create a method that returns an integer with the opposite sign.
   Example: number -46, method returns 46.

2. Create a method that returns the cube of a number.
   Example: the number is 20, the method returns 8,000.

3. Create a method that takes an integer and returns the remainder when divided by 2.
   Example: number 41, method returns 1.

4. Create a method that takes an integer and returns the integer part of dividing it by 5.
   Example: number 83, method returns 16.

5. Create a method that finds the sum of the digits of a two-digit integer.
   Example: number 23, sum of digits 5.

6. Division of double numbers, calculation of the arithmetic mean.
   Let's calculate the average age of our group.

7. Create a method that calculates the square of the hypotenuse over two legs (Pythagorean theorem).

**Additional tasks:**

**Task 1.**
Implement a method that takes as input an amount of money in euros and returns its value
in dollars. Set the exchange rate value inside the program.

**Task 2.**
1 English foot is equal to 0.3048 meters. Write a method that takes a length value as input
in feet, but returns in meters.

**Task 3.**
Write a program to calculate the average cost of a trip using a transport pass.
In the program, set the cost of a monthly pass and the number of working days in a month.
Assuming that on average there are two trips on a working day, and 1.5 trips on a weekend, calculate and
round the total number of trips per month and then calculate the average cost per trip according to
travel ticket.
Calculate for January 2024.

--------------------------------------------------

# План занятия №4 13.02.2024:

## Что мы узнали и сделали на прошлом занятии:
**8 примитивных типов данных**:
* byte: 8-битное целое число со знаком. 
Диапазон значений от -128 до 127.
* short: 16-битное целое число со знаком. 
Диапазон значений от -32,768 до 32,767.
* int: 32-битное целое число со знаком. Диапазон значений от 
-2^31 до (2^31)-1, где ^ обозначает возведение в степень.
* long: 64-битное целое число со знаком. Диапазон значений от -2^63 до (2^63)-1.
* float: 32-битное число с плавающей запятой одинарной точности. Диапазон значений примерно от 
-3.40282347E+38F до 3.40282347E+38F.
* double: 64-битное число с плавающей запятой двойной точности. Диапазон значений примерно от 
-1.7976931348623157E+308 до 1.7976931348623157E+308.
* char: 16-битный тип данных, представляющий символ Unicode. Диапазон значений от 0 до 65,535.
* boolean: логический тип данных, принимающий только два значения: true или false.

# Переменные
- идентификаторы, которым присваиваются конкретные значения
- называть с маленькой буквы
- при объявлении обязательно необходимо указывать **тип данных**, которые будут храниться в этой переменной

Java - строго типизированный язык! 
Все переменные должны быть явно объявлены перед использованием с **ЯВНЫМ** указанием их типа.

В оперативной памяти есть две области для хранения данных:
- область 1 - ...
- область 2 - ...

Идентификатор (имя) переменной хранится в ..., значение переменной хранится в ...

### Математические действия:
* '+', '-', '*' - как обычно.
* '/' - деление нацело (**получаем целую часть от деления**), 35 / 8 = ???
* '%' - деление с остатком (**получаем остаток от деления**), 35 % 8 = ???

----------------------------------------------------------------------------

## План на сегодняшнее занятие: Methods arguments. Return.

### Новая тема - методы и их аргументы, return - получение результата

- см. раздел теория.

### Практика:

**Задания**

1. Создайте метод, который возвращает целое число, противоположное по знаку.
   Пример: число -46, метод возвращает 46.

2. Создайте метод, который возвращает куб числа.
   Пример: число 20, метод возвращает 8 000.

3. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
   Пример: число 41, метод возвращает 1.

4. Создайте метод, который принимает целое число и возвращает целую часть от деления его на 5.
   Пример: число 83, метод возвращает 16.

5. Создайте метод, который находит сумму цифр двузначного целого числа.
   Пример: число 23, сумма цифр 5.

6. Деление чисел типа double, вычисление среднего арифметического.
  Давайте вычислим средний возраст нашей группы.

7. Создайте метод, который вычисляет квадрат гипотенузы по двум катетам (теорема Пифагора).

**Дополнительные задачи:**

**Задача 1.**
Реализовать метод, который принимает на вход сумму денег в евро, а возвращает ее значение
в долларах. Значение курса задать внутри программы.

**Задача 2.**
1 английский фут равен 0,3048 метра. Напишите метод, который принимает на вход значение длины
в футах, а возвращает в метрах.

**Задача 3.**
Написать программу для вычисления средней стоимости поездки по транспортному проездному.
В программе задать стоимость проездного на месяц и количество рабочих дней в месяце.
Считая, что в рабочий день в среднем две поездки, и 1.5 поездки в выходной, посчитать и
округлить общее число поездок в месяц и затем рассчитать среднюю стоимость одной поездки по
проездному билету.
Рассчитать для января 2024 года.


