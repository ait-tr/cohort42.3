<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 34 06/03/2024

1. What we did in the last lesson:

- created the CompanyAppl application, in which:
- created a company object based on the CompanyImpl class, which implemented the Company interface, in which we specified the methods that we needed.
- developed an application based on this object and its methods (methods are called in the following way: we write the object and put . and the method appears)

- got acquainted with new topics:
- **Generics** (abstract classes, abstract methods, **abstract types**)

- **Sorting an array of objects** - Comparable<T> and Comparator<T> interfaces
  see Theory section

2. Questions about homework:
- Books - sort by author, year of publication
- Computers - sort by RAM capacity, brand

3. New topic:
   Enum - see the Theory section.

4. Workshop on Enum

**Task 1.**
Set ENUM seasons - seasons.
// Try methods on it:
// .values()
// .toString
// .ordinal()
// .valueOf()

**Task 2.**
Set emun Month, determine the months, their names and the number of days in them.
Implement a method that allows you to add months to the selected one, getting the correct month.
Example: AUG + 6 month = FEB
Check the method in the application.

**Task 3.**
Using enum, write a program to sell 4 types of coffee:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Offer the user a choice of coffee, and based on the selection results, inform the cost of the drink.

_______________________

# План занятия №34 03.06.2024

1. Что мы сделали на прошлом занятии:

- создали приложение CompanyAppl, в котором:
  - создали объект company на базе класса CompanyImpl, который имплементировал интерфейс Company, в котором мы прописали методы, которые нам необходимы. 
  - разработали приложение на базе этого объекта и его методов (методы вызываются сл. образом: пишем объект и ставим . и появляется метод)

- познакомились с новыми темами:
- **Generics** (абстрактные классы, абстрактные методы, **абстрактные типы**)

- **Сортировка массива объектов** - интерфейсы Comparable<T> и Comparator<T>
  см. раздел Теория

2. Вопросы по домашнему заданию:
- Books - отсортировать по автору, году издания
- Computers - отсортировать по объему ОЗУ, бренд

3. Новая тема: 
Enum - см. раздел Теория.

4. Практикум на Enum

**Задача 1.**
Задать ENUM seasons - времена года.
// Опробовать на нем методы:
// .values()
// .toString
// .ordinal()
// .valueOf()

**Задача 2.**
Задайте emun Month, определите месяца, их наименования и количество в них дней.
Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
Пример: AUG + 6 month = FEB
Проверьте работу метода в приложении.

**Задача 3.**
Используя enum, напишите программу для продажи 4-х видов кофе:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.