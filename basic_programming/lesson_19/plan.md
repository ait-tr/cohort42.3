# Lesson plan No. 19 04/04/2024

1. What did we learn and do in the last lesson?
- created classes:
  - Product
    -Food
    - MilkFood
      -MeatFood
- created the MarketAppl class, in which
  - created an array Product[] products = new Product[4]
  - created array elements - objects of the Product, Food, MilkFood, MeatFood classes, BUT the array itself is of type Product
  - implemented methods:
    - printing of all products
    - the sum of all costs
    - search by barcode

Important skills:
- object creation

- “running around the array” - for loop

- i-th element of the array of objects

- getting the value of an object field

2. Homework - analysis of problems:
- MarketAppl - a method that prints products with expiration dates
- Book, Dictionary, BookAppl
  - methods that produce:
    - the total number of pages in all books;
    - average number of words in dictionaries;
    - average age of all publications.
- vehicle fleet, calculation of the required area for cars with width a x b

3. Topic of the lesson:

3.1. Once again about the equals method
- compare computers, understand the operation of the equals method

- scenarios with the equals method:
  - compare by primitive fields using ==
  - compare by object fields using equals for this type of object, for example String
  - there is a field with a unique value - depending on its type either == or equals

3.2. Create and compare two variables of type String
- create using "" and new
- compare using ==, then using the equals() method
  to consolidate understanding.

3.3. We are developing an application.

Books, library, application:
- adding an object to an array of objects;
- removing an object from an array of objects;
- search for an object.

4. Practice:

Create a Book class with fields:
long isbn, String title, String author, int yearOfPublishing.
Check the ISBN for the correct number of digits = 13.

Create a Library class with fields:
Book[] books, int size.
Implement a class constructor.
Implement methods:
- printing of all books in the library;
- obtaining a number of books in the library;
- searching for a book by ISBN;
- adding a book to the library;
- removing a book from the library.

Create a class BookAppl, in which using the methods of the Library class:
- create an object of the Library type for 10 books;
- add 4 books to the library;
- get the current library size (number of books);
- print all the books in the library;
- check the operation of the method of searching for a book by ISBN;
- remove a book from the library;
- check the number of books after deletion and print existing books.


---------------------------------

# План занятия №19 04.04.2024

1. Что мы узнали и сделали на прошлом занятии?
- создали классы: 
  - Product
    - Food
      - MilkFood
      - MeatFood
- создали класс MarketAppl, в котором
  - создали массив Product[] products = new Product[4]
  - cоздали элементы массива - объекты классов Product, Food, MilkFood, MeatFood, НО сам массив типа Product 
  - реализовали методы:
    - печать всех продуктов
    - сумма всех стоимостей
    - поиск по штрих-коду

**Важные навыки:**
- создание объекта с помощью конструктора, конструктор совпадает по имени с именем класса и ничего не возвращает

- "обегаем массив" - цикл for:
for (int i = 0; i < products.length; i++){
  ...
}

- i-й (текущий) элемент массива объектов
products[i]

- получение значения поля объекта
products[i].get...

2. Домашнее задание - разбор задач:
- MarketAppl - метод, который печатает продукты со сроками годности

- Book, Dictionary, BookAppl
  - методы, которые выдают:
    - общее количество страниц во всех книгах;
    - среднее значение количества слов в словарях;
    - средний возраст всех изданий.
    
- автопарк, расчет необходимой площади под автомобили шириной a x b  

3. Тема занятия:

3.1. Еще раз про метод equals
- сравниваем компьютеры, понимаем работу метода equals:
  - метод equals есть у каждого объекта, объекты надо сравнивать только с помощью метода equals
  объект1.equals(объект2) - получаем либо true, либо false

- сценарии c методом equals:
  - сравниваем по полям-примитивам через == ;
  - сравниваем по полям-объектам с помощью equals для этого типа объектов, например String
  - есть поле с уникальным значением - в зависимости от его типа либо ==, либо equals

3.2. Создаем и сравниваем две переменных типа String
- создаем через "" и new
- сравниваем c помощью ==, затем с помощью метода equals() 
для закрепления понимания.

3.3. Разрабатываем приложение.

Книги, библиотека, приложение:
- добавление объекта в массив объектов;
- удаление объекта из массива объектов;
- поиск объекта.

4. Практика:

Создать класс Book с полями:
long isbn, String title, String author, int yearOfPublishing.
Проверить ISBN на корректное количество цифр = 13.

Создать класс Library с полями:
Book[] books, int size.
Реализовать конструктор класса.
Реализовать методы:
- печать всех книг в библиотеке;
- получение кол-ва книг в библиотеке;
- поиска книги по ISBN;
- добавление книги в библиотеку;
- удаление книги из библиотеки.

Создать класс BookAppl, в котором используя методы класса Library:
- создать объект типа Library на 10 книг;
- добавить в библиотеку 4 книги;
- получить текущий размер библиотеки (кол-во книг);
- напечатать все книги, имеющиеся в библиотеке;
- проверить работу метода поиска книги по ISBN;
- удалить какую-нибудь книгу из библиотеки;
- проверить количество книг после удаления и распечатать имеющиеся книги.


