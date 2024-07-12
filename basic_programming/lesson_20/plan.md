# Lesson plan No. 20 04/04/2024

1. What did we learn and do in the last lesson?
- compared objects of the Computer class using the equals method

- RULE: comparing objects using "==" is incorrect, because "==" formally compares references, i.e.
  object addresses. Objects must be compared using the equals method, which is overridden in each class.
- all objects are inherited from the class ..., which has a method ...

- scenarios with the equals method:
  - compare by primitive fields using == ;
  - compare by object fields using equals for this type of object, for example String;
  - there is a field with a unique value, then we leave only it, compare depending on its type either == or equals

**Important skills:**
- creating an object using a constructor (constructor...)

Array of objects of type Product products[]:

- “running around the array” - for loop:
  for (int i = 0; i < products.length; i++){
  ...
  }

- i-th (current) element of the array of objects
  products[i]

- getting the value of an object field
  products[i].get...

2. Homework - do you have any questions?

3. Topic of the lesson:

**We are developing an application.**

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
- create a Library type object for 10 books;
- add 4 books to the library;
- get the current library size (number of books);
- print all the books in the library;
- check the operation of the method of searching for a book by ISBN;
- remove a book from the library;
- check the number of books after deletion and print existing books.


---------------------------------

# План занятия №20 09.04.2024

1. Что мы узнали и сделали на прошлом занятии?
- сравнивали объекты класса Computer c помощью метода equals

- ПРАВИЛО: сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е.
  адреса объектов. Объекты необходимо сравнивать через метод equals, который переопределяется в каждом классе.
- все объекты наследуются от класса Object, в котором есть метод equals.

- сценарии c методом equals:
  - сравниваем по полям-примитивам (int, double, floaf, byte, short, boolean, long, char) через == ;
  - сравниваем по полям-объектам с помощью метода equals для этого типа объектов, например String;
  - есть поле с уникальным значением (id, serial number, bur_code), тогда оставляем только его, сравниваем в зависимости от его типа либо ==, либо equals

**Важные навыки:**
- создание объекта с помощью конструктора (конструктор ...)

Массив объектов типа Product products[]:

- "обегаем массив" - цикл for:
for (int i = 0; i < products.length; i++){
  ...
}

- i-й (текущий) элемент массива объектов
products[i]

- получение значения поля объекта
products[i].get...

2. Домашнее задание - есть ли вопросы?

3. Тема занятия:

**Разрабатываем приложение.**

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
- печать списка всех книг в библиотеке;
- получение кол-ва книг в библиотеке;
- поиска книги по ISBN;
- добавление книги в библиотеку;
- удаление книги из библиотеки.

Создать класс BookAppl, в котором используя методы класса Library:
- создать объект типа Library на 5-6 книг;
- добавить в библиотеку еще 1-2 книги;
- получить текущий размер библиотеки (кол-во книг);
- напечатать все книги, имеющиеся в библиотеке;
- проверить работу метода поиска книги по ISBN;
- удалить какую-нибудь книгу из библиотеки;
- проверить количество книг после удаления и распечатать имеющиеся книги.


