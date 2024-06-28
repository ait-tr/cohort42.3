<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan No. 42 06/28/2024

1. What we did in the last lesson:
- created a TreeSet with integers
- created a TreeSet with strings
- created a TreeSet with objects of type Car

What are the advantages of TreeSet?
- ...
- ...

What are the advantages of ArrayList?
- no need to think about the size, it expands itself as needed (initial capacity 10 elements, 1.5 times)
- no need to think about reindexing when inserting an element
- each element has an index
- quick addition to the end of the list
- you can make duplicates
- can be sorted
  Flaws:
- slowly adding an element to the middle or beginning of the list
- allows for duplicates

What are the advantages of HashSet?
- does not contain duplicates
- quick insertion, element search
  Flaw:
- no order
- no access by index
- sorting is not possible

2. Homework:

Implement the Garage application according to the UML diagram.

3.Workshop:
Change GarageImpl implementation:
- there is Car[] cars;
- must be replaced with ArrayList;
- evaluate the computational load of the new implementation.

___

# План занятия №42 28.06.2024

1. Что мы сделали на прошлом занятии:
- создали TreeSet c целыми числами
- создали TreeSet cо строками
- создали TreeSet с объектами типа Car

В чем преимущества TreeSet?
- ...
- ...

В чем преимущества ArrayList?
- не надо думать о размере, он сам расширяется по мере необходимости (initial capacity 10 элементов, в 1,5 раза)
- не надо думать о переиндексации при вставке элемента
- каждый элемент имеет индекс
- быстрое добавление в конец списка
- можно вносить дубликаты
- можно отсортировать 
Недостатки:
- медленное добавление элемента в середину или начало списка
- допускает наличие дубликатов

В чем преимущества HashSet?
- не содержит дубликатов
- быстрая вставка, поиск элемента
Недостаток:
- нет порядка
- нет доступа по индексу
- не возможна сортировка 

2. Домашние задания:

Реализовать приложение Garage согласно UML-схеме.

3.Практикум:
Изменить реализацию GarageImpl:
- имеется Car[] cars;
- необходимо заменить на ArrayList;
- оценить вычислительную нагрузку новой имплементации.

 





