<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 40 06/21/2024

1. What we did in the last lesson:

- finished developing the Album application:
- wrote the getAllPhotosFromAlbum(int albumId) method, used the Predicate class and its test method
- wrote a method getPhotoBetweenDates(LocalDate dateFrom, LocalDate dateTo), in which objects were selected according to the criterion of falling within a given time period.

- got acquainted with the concept of computational complexity:
  Complexity, big O notation
- performed standard operations with an array of integers:
- average - difficulty...
- linear search for an array element - complexity...
- bubble sort array sorting - complexity...
- array sorting Arrays.sort() - complexity...
- searching for an array element using binary search - complexity...

4. New topic:
   Java Collection Framework - see Theory section

5. Workshop:

ArrayList:
- create a list of city routes based on buses from the city fleet;
- calculate the total capacity of buses from the fleet.

___

# План занятия №40 21.06.2024

1. Что мы сделали на прошлом занятии:

Изучали теорию по JCF - это набор классов и интерфейсов, которые предназначены для работы с группами (наборами) объектов.

**Интерфейсы**:
- Iterable - содержит методы для переборки элементов наборов (коллекций) 
  - boolean hasNext()
  - T next()

- Collection - методы для наборов объектов

- List - методы для списков (имеется нумерация элементов)

- Set - методы для "множеств" (не содержат дубликатов)

**Классы, которые implements List**:
- ArrayList
- LinkedList

На основе ArrayList:
- создали список городских маршрутов автобусов из городского автопарка;
- подсчитали общую вместимость автобусов из автопарка.

В чем преимущества ArrayList?
- ...

2. Домашние задания:
- ToDoList - из марафона  
- алфавит
- планеты
- спортсмены (забег)
- удаление дубликатов

3. Новая тема:
Интерфейс Set, класс HashSet.

4.Практикум:

**Задача 1.**
- Создайте массив из 10 случайных чисел в интервале от 1 до 10. 
Необходимо удалить из него все дубликаты.
Сколько чисел осталось после удаления дубликатов?

**Задача 2.**
Выяснить, сколько уникальных слов в самом длинном в мире предложении Л.Н.Толстого.

**Задача 3.**
Написать приложение для почты, которое позволит понять, из каких мест на данную почту приходят письма по индексу письма.


