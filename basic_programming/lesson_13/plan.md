# Lesson plan No. 13 03/14/2024

## Arrays, repetition:

Given an array int[] array = new array[10];

What is the length of the array - ?
Index of the 1st element of the array - ?
The index of the last element of the array is ?

How to find out the length of an array? -

What element is at the beginning of the array? -

What element is at the end of the array? -

What does the current array element look like? -

What does the next array element after the current one look like? -

What does the previous one before the current array element look like? -

## Filling an array with random data

* double a = Math.random(); - generates a random number in the range from [0, 1) - parentheses from mathematics
  [ => 0 - maybe ) => 1 - can't be

* double x = (Math.random() * (b-a) ) + a - generates a random number in the interval from [a, b) (a<b)
  a - maybe, b - can't be

* int n = (int)(Math.random() * (b - a + 1) + a) - generates a random **integer** number in the interval [a, b]
  a - maybe, b - maybe

## The for loop loops through all the elements of the array

         for( i = 0, i < array.length, i++) {
             doSomething;
         }


1. What did we learn and do in the last lesson?
- public, static modifiers, calling methods from another class;
- sorting the array using the bubble sort method;
- use of a random number sensor.

2. Homework - analysis of problems:
- a new array consisting of the shortest and longest line of the original array;
- copyOfArray method - copy the old array to a new one with a new length;
- dice with 6 sides 20 throws, check the probability of sides falling out.

3. Topic of the lesson:
- algorithms and their properties

**Main properties of the algorithm:**
1. Discretion (broken into steps).
   “Top-down” methodology, “An elephant must be eaten in parts.”
2. Effectiveness (there is a result at every step and at the end).
3. Determinism (unambiguity, there is no possibility of “interpretation”).
4. Finiteness (the algorithm necessarily ends).

- Binary search algorithm for an element in an array;
- search in an array of elements by criterion.

4. Practice:

Exercise 1.
Watch the video: https://youtu.be/SW_UCzFO7X0?list=PLawfWYMUziZqyUL5QDLVbe3j5BKWj42E5&t=1006

- Write a method that performs a binary search for a number in an array of integers;
- Create an array of integers with 20 elements, fill it with random integers in the range from 1 to 100;
- Sort the array;
- Check the operation of binary search on the numbers available in the array;
- Check the operation of binary search on numbers missing in the array;
- How will the method work on an unsorted array?

Task 2.
Create an array of 20 random integers in the range from -100 to 100.
How many negative numbers did it contain?
Form them into a new array.


---------------------------------

# План занятия №13 14.03.2024

## Массивы, повторение:

Задан массив int[] array = new array[10]; 

Какова длина массива - ? 
Индекс 1-го элемента массива - ? 
Индекс последнего элемента массива - ?

Как узнать длину массива? - 

Какой элемент стоит в начале массива? - 

Какой элемент стоит в конце массива? - 

Как выглядит текущий элемент массива? - 

Как выглядит следующий за текущим элементом массива? - 

Как выглядит предыдущий перед текущим элементом массива? - 

## Заполнение массива случайными данными

* double a = Math.random(); - генерирует случайное число в интервале от [0, 1) - скобки из математики
  [ =>  0 - может быть, ) => 1 - не может быть

* double x = (Math.random() * (b-a) ) + a  - генерирует случайное число в интервале от [a, b) (a<b)
  a - может быть, b - не может быть

* int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
  a  - может быть, b  - может быть

## Цикл for обеспечивает "обегание" всех элементов массива

        for( i = 0, i < array.length, i++) {
            doSomething;
        }
-----------------------------------------------------------------

1. Что мы узнали и сделали на прошлом занятии?
- модификаторы public, static, вызов методов из другого класса;
- сортировка массива методом bubble sort;
- использование датчика случайных чисел.

2. Домашнее задание - разбор задач:
- новый массив, состоящий из самой короткой и самой длинной строки изначального массива;
- метод copyOfArray - копируем старый массив в новый с новой длиной;
- кубик с 6-ю гранями 20 бросков, вероятность выпадения граней.

3. Тема занятия:
- алгоритмы и их свойства

**Главные свойства алгоритма:**
1. Дискретность (разбит на шаги).
   Методология "сверху - вниз", "Слона надо есть по частям."
2. Результативность (имеется результат на каждом шагу и по итогу).
3. Детерминированность (однозначность, отсутствует возможность "толкования").
4. Конечность (алгоритм обязательно завершается).

- алгоритм бинарный поиск (Binary search) элемента в массиве;
- поиск в массиве элементов по критерию.

4. Практика:

Задание 1.
Смотрим ролик: https://youtu.be/SW_UCzFO7X0?list=PLawfWYMUziZqyUL5QDLVbe3j5BKWj42E5&t=1006 

- Написать метод, выполняющий бинарный поиск числа в массиве целых чисел;
- Создать массив целых чисел на 20 элементов, заполнить его случайными целыми числами в интервале от 1 до 100;
- Выполнить сортировку массива;
- Проверить работу бинарного поиска на имеющихся в массиве числах;
- Проверить работу бинарного поиска на отсутствующих в массиве числах;
- Как будет работать метод на неотсортированном массиве?

Задание 2.
Создать массив из 20 случайных целых чисел в интервале от -100 до 100.
Сколько в нем получилось отрицательных чисел? 
Сформируйте из них новый массив.



