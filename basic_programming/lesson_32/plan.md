<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 32 05/27/2024

1. What we did in the last lesson:
- repeated what abstract classes are:
- mechanism - INHERITANCE
- the main word is extends
- repeated what interface is:
- mechanism - INHERITANCE
- the main word is implements
2. How we solved the **problem of developing an application** for company management:
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

3. Practice:
   IMPLEMENTED:
- create an abstract class Employee and an abstract method calcSalary;
- create child classes Manager, SalesManager, Worker and implement calcSalary methods in them;
- create the Company interface with methods:
- add employee addEmplyee
- remove employee removeEmployee
- find an employee findEmployee
- number of employees size
- FOT totalSalare
- average salary averageSalary
- sales volume totalSales
- print a list of employees printEmployees
- create the CompanyImpl class, which implements Company
- create the CompanyImplTest class, in which we create tests for methods

FINISHING:
- implement methods in the CompanyImpl class and check their operation in tests
- create an application EmployeeAppl, in which we create employees and use the developed methods.

___

# План занятия №32 27.05.2024

1. Что мы сделали на прошлом занятии:
- повторили, что такое абстрактные классы:
  - механизм - НАСЛЕДОВАНИЕ
  - главное слово - extends
- повторили, что такое interface:
  - механизм - НАСЛЕДОВАНИЕ
  - главное слово - implements
2. Как мы решали **задачу разработки приложения** для управления компанией:
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

3. Практика:
РЕАЛИЗОВАНО:
- создаем абстрактный класс Employee и абстрактный метод calcSalary;
- создаем дочерние классы Manager, SalesManager, Worker и реализуем в них методы calcSalary;
- создаем интерфейс Company с методами:
    - добавить сотрудника addEmplyee
    - удалить сотрудника removeEmployee
    - найти сотрудника findEmployee
    - кол-во сотрудников size
    - ФОТ totalSalare
    - средняя з/п averageSalary
    - объем продаж totalSales
    - напечатать список сотрудников printEmployees
- создаем класс CompanyImpl, который implements Company
- создаем класс CompanyImplTest, в котором создаем тесты для методов

ДОДЕЛЫВАЕМ:
- реализуем методы в классе CompanyImpl и проверяем их работу тестам
- создаем приложение EmployeeAppl, в котором создаем сотрудников и используем разработанные методы.