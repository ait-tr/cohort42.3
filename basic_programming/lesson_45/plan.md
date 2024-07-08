<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 45 07/05/2024

1. What we did in the last lesson:
- Collections class and its methods;
- functional programming:
- lambda expressions;
- method reference syntax.
- Stream API.


2. Homework:
- read articles and presentation

3. New topic:
- introduction to StreamAPI
- intermediate and terminal operations
- transformations
- getting the result

4.Workshop:

**Exercise 1.**
Streams of primitives Integer, Long, Double
- get random integers in the range from min to max in the required quantity
- obtaining simple statistical data using summaryStatistics
- lottery simulation 6 out of 49

**Task 2.**
Take a list of cities, filter only those names that start with a given letter,
convert them to uppercase and output them in alphabetical order.

**Task 2.**
Create a Container class with fields:
String label and List<Box> - a list of boxes with parcels.
Create a Box class with a field:
List<Parcel> - list of parcels.
The Container and Box classes are iterable.
Create a Parcel class with a double weight field - the weight of the parcel.
Create a ShipmentAppl class with a main method.
Think of a random number of containers (10 to 20).
In each container, consider a random number of boxes (from 10 to 20).
In each box, think of a random number of parcels (from 5 to 10).
Let's assume that each parcel weighs on average = 2 kg.

1. Count the total number of parcels in all containers, boxes and their total weight.
2. Find the label of the container that contains the maximum number of parcels.
3. Find all containers with the maximum number of packages.

**Task 3.**
Solving the problem of Programmers and Technologies.
There is a class in which the fields are encapsulated:
- String name; // programmer name
- String[] technologies; // programming languages he speaks (Java, Phyton, etc.)

You need to answer the following questions:
- Which programmers speak which programming languages?
- what programming languages are most popular among the company’s programmers?

___

# План занятия №45 05.07.2024

1. Что мы сделали на прошлом занятии:
- класс Collections и его методы;
- функциональное программирование:
  - лямбда-выражения;
  - синтаксис method reference.
- Stream API.


2. Домашнее задание:
- прочитать статьи и презентацию

3. Новая тема:
- знакомство со StreamAPI
  - промежуточные и терминальные операции
  - преобразования
  - получение результата

4.Практикум:

**Задание 1.**
Стримы примитивов Integer, Long, Double
- получить случайные целые числа в интервале от min до max в нужном количестве
- получение простейших статистических данных с помощью summaryStatistics
- моделирование лотереи 6 из 49

**Задание 2.**
Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
Требуется из этого списка отобрать только простые числа.

**Задание 3.**
Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
преобразуйте их в верхний регистр и выведите в алфавитном порядке.

**Задание 4.**
Создайте класс Container с полями: 
String label (маркировка) и List<Box> - список коробок с посылками.
Создайте класс Box с полем: 
List<Parcel> - список посылок.
Классы Container и Box являются итерируемыми.
Создайте класс Parcel (посылка) с полем double weight - вес посылки.
Создайте класс ShipmentAppl с методом main.
Задумайте случайное количество контейнеров (от 10 до 20).
В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
В каждой коробке задумайте случайное количество посылок (от 5 до 10).
Предположим, что каждая посылка в среднем имеет вес = 2 кг.

1. Подсчитайте общее количество посылок во всех контейнерах, коробках и их общий вес.
2. Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
3. Найдите все контейнеры с максимальным количеством посылок.
