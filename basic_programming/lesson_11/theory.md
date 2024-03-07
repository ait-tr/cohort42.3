# Arrays and methods
Arrays and methods.
Arrays as objects. The concept of a link in Java. Stack and Heap.
Passing arguments to a method by reference and by value

1. Unlike primitives, **objects** are complex structures that combine a variety of
   data that characterizes the state of an object and the functionality (methods) responsible for its behavior. More details in a week, when there will be OOP.
2. Arrays in Java are objects.

An array is a container object containing a **fixed number** of values of **the same type**.

3. Java uses two types of memory: Stack and Heap.
- The Stack stores data that has a clearly defined size in bytes. For example, primitives.
- The size of data stored in Heap can change dynamically.
  All Java objects are stored in Heap.

7. A variable with an address (array name) is stored in the Stack, since an address in memory always has a fixed length of
   bytes An array variable is the name of the array, stores the address of the array in Heap, i.e. it is a link to the array.

The array (cell values) is stored in Heap.

8. When calling a method, the arguments of the primitive type (int, double) are copied, i.e. their value is passed (pass by value).
   When passing **objects** as arguments, such as arrays, only addresses (links) are copied. The objects themselves are not copied. Object arguments are said to be passed by reference.

----------------------------------------------

# Массивы и методы
Массивы и методы.
Массивы как объекты. Понятие ссылки в Java. Stack and Heap.
Передача аргументов в метод по ссылке и по значению

1. В отличие от примитивов, **объекты** представляют собой сложные структуры, объединяющие в себе разнообразные
   данные, которые характеризуют состояние объекта и функциональность (методы), отвечающие за его поведение. Подробнее - через неделю, когда будет ООП.

2. Массивы в Java являются объектами.

Определение из документации:
Массив – это объект-контейнер, содержащий **фиксированное количество** значений **одного типа**.

3. Java использует два типа памяти: Stack и Heap.
- В Stack хранятся данные имеющие четко заданный размер в байтах. Например, примитивы.
- Размер данныx, хранящихся в Heap, может динамически меняться. 
Все объекты Java хранит в Heap.

7. Переменная с адресом (имя массива), хранится в Stack, т. к. адрес в памяти всегда имеет фиксированную длину в
   байтах. Переменная типа массив - имя массива, хранит в себе адрес массива в Heap, т. е. является ссылкой на массив.

   Массив (значения в ячейках) хранится в Heap.

8. При вызове метода, аргументы примитивного типа (int, double) копируются, т. е. передается их значение (pass by value).
   При передаче в качестве аргументов **объектов**, например массивов, копируются только адреса (ссылки). Сами объекты не копируются. Говорят, что аргументы объекты передаются по ссылке (pass by reference).