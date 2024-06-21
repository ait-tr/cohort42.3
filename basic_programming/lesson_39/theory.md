<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Java Collections Framework

The Java Collections Framework (JCF) is an important part of Java Standard Edition (Java SE) and is a set of classes and interfaces that are designed to work with groups (sets) of objects.
Collections make working with data easier by providing methods for storing, sorting, searching, and accessing items.

The "iteration" property = "iteration" is the base (parent) property of all classes and interfaces that are available in JCF.

## Iterator
An iterator and iterations are a correct and safe way to iterate over the entire set of available elements.

**System problem:**
If an object encapsulates some set of elements within itself and there is a need to iterate
all the elements of this set, then this may be a problem.
If we create a getter to pass this set, then by returning the reference, we are essentially giving an unsafe
accessing the elements of a set outside the object.
A programmer who has received this access can modify an object (set of elements) without our knowledge - change the composition of elements, reduce its size, etc.

**If you return a copy of the set, this can have a significant and negative impact on performance.**

To solve this problem, there is an **Iterator pattern** (Iterable<> interface).

The essence of the pattern is to create a third-party object that “knows how to iterate” (iterate) a set
elements encapsulated in the original object.

An iterator object must have two functionality (essentially methods):
1) know how to determine whether there is a next element (boolean method);
2) return the current element and move on to the next one (a method that returns the next element of the set).

In Java, there is an Iterator<T> interface with two abstract methods:
- boolean hasNext(), returning true if there are still elements, and false if we have reached the end of the set, and
- T next(), returning the current element, and moving the "pointer" to the next element.

The Iterator interface has an additional default method, void remove(),
which has an empty body. But if we need to implement the functionality of correct deletion
current element during iteration, the remove method must be overridden.

The class encapsulating the set that needs to be iterated implements (inherits) the Iterable<T> interface,
which has an abstract interface Iterator<T> iterator() and defines a method that returns an iterator for objects
of this class.

## Collection interface
The Collection interface in Java is the base interface for all collections in the Java Collections Framework (JCF).
It provides basic methods for working with groups of objects, such as adding, removing, checking for elements, and converting to an array.

The Collection interface extends the Iterable interface, meaning all collections are iterable.
The Collection interface defines a basic set of methods for working with collections of data.
This is a set of CRUD operations: adding, deleting, searching, updating and other methods, for example, getting the number of elements in a collection, etc.

This interface is the basis for more specialized interfaces such as:
- List
- Set (set)
- Queue

## Java Collection Framework

Java Collection Framework (JCF) - a set (set) of classes and interfaces that are most often implemented
data structures used.

JCF consists of two large subsections: **Collection** and **Map**.
We begin our study of JCF with collections.

The **List<E>** interface contains methods for **lists**.
- Provides work with an ordered collection of elements that **allows storing duplicates**.
- Orderliness means that:
- elements in the list are stored in the order in which they were added (**new elements are placed at the end of the list** as they are added, sorting does not occur when inserting).
- Main methods:
- get an element by its index using the get(int index) method
- insert element add(int index, E element)
- remove elements by index remove(int index)
- update element by index set(int index, E element)
- Search and selection of elements:
- int indexOf(Object o);
- int lastIndexOf(Object o);
- List<E> subList(int fromIndex, int toIndex);

Implementations of the List<T> interface:

- **ArrayList<T>**:
- Array based.
- Quick access by index is its “+”.
- Slowly deleting and inserting elements in the middle of the list is its "-".

- **LinkedList<T>**:
- Based on doubly linked list.
- Quick insertion and removal of elements is its “+”
- Slow index access is its "-".

The Set interface contains methods for sets - a collection of **unique** elements.

----------------------------------------------

For Iterable objects you can use a for-each loop.
Its syntax is:

`for(T e: set_of_T){
do something;
}
`
In the body of this loop, the variable "e" takes in turn the value of each element from set_of_T

**ATTENTION!!!**
Modifications cannot be made in a for-each loop.

----------------------------------------------

# ArrayList - what is it and why?

## Array concept:
TYPE[] array_name = new TYPE[size];
Arrays store data of the SAME TYPE (int, String, double, ...).

Data can be stored in an array and then manipulated:
**C - create, R - read, E|U - edit or update, D - delete = CRUD.**
BUT arrays are "difficult" to work with - you need to keep an eye on the size.

### Collections Framework:
**Collection** in Java is a structure that provides
architecture for storing and managing a group of **Objects**.

**Collections** allow you to store groups of Objects, this is a much more general level abstraction,
than arrays. Storing and managing collections is ultimately more convenient and simpler than arrays.

To manage data in collections, you need **Interfaces** - methods of management/manipulation
objects in collections. In general, interfaces provide approximately the same thing - **CRUD** of objects
in collections, but their implementation can be specific due to differences in objects in collections.

Someone on the Java Architects team thought very hard and identified a common property
for stored data - **ITTERABLE**.

The **Iterable** interface is the “parent” of three types of interfaces:
- List
- Queue
- Set (Set),
  which allow you to work with collections.

Our task at this stage is to start working with the **ArrayList** class,
which implements the List interface:
* A list is a collection in which all elements have a serial number (index).

The **ArrayList** class allows us to create objects of this class and use them.

### The syntax for creating an ArrayList is:
import java.util.ArrayList;

ArrayList<Type>Arrayname = new ArrayList<>();

**examples:**
ArrayList<Integer> myNumbersList = new ArrayList<>(); // list of integers
ArrayList<String> myNamesList = new ArrayList<>(); // list of strings

# ArrayList details
In a regular array (Array), we **cannot change the size**; it is set when the array is created.
The ArrayList structure from JCF is dynamically sized, it expands automatically as more are added
elements into it. When creating your own list based on ArrayList, the size is not specified.

## Question: Is ArrayList a dynamic array?
ArrayList - implemented on the basis of the standard Array.
ArrayList creates a new array on the fly, rather than changing the size of the old one,
and transfers the contents of the old array into it.
The size of the array increases by 1.5 times each time a list element is added.
**The size of an in-memory array cannot be changed on the fly in any programming language.**

## Question: why is ArrayList better than just Array?
- Adding and removing elements is easier in an ArrayList - no need to think about the size of the array
- Searching, checking an element for presence is easier - we use the built-in contains() method
- Sorting for ArrayList is implemented using standard methods in Collections; for Array you don’t need to write it yourself
- Is it possible to add null to an ArrayList - the answer is YES
- Is it possible to add duplicate(s) to ArrayList - the answer is YES
- you can use a for each loop to go through the elements of the array, there are modification restrictions
  at the time of traversal (it is not advisable to delete collection elements)

## Question: is there an ArrayList of two or more dimensions?
The answer is, roughly speaking, no, they don’t do that.
In theory we can build an ArrayList<ArrayList1>.
In practice, for tasks with multidimensional arrays it is better to use the standard Array[][].

## ArrayList - direct filling with the asList method
ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Peter","Vladimir","Stepan"));
System.out.println(namesList);

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Java Collections Framework

Java Collections Framework (JCF) является важной частью Java Standard Edition (Java SE) и представляет собой набор классов и интерфейсов, которые предназначены для работы с группами (наборами) объектов. 
Коллекции упрощают работу с данными, обеспечивая методы для хранения, сортировки, поиска и доступа к элементам.

Свойство "**перебираемость**" = "**итерируемость**" - это базовое (родительское) свойство всех классов и интерфейсов, которые имеются в JCF.

## Итератор
Итератор и итерации - это корректный и безопасный способ перебора всего набора имеющихся элементов.

**Системная проблема:**
Если объект инкапсулирует внутри себя какой-то набор элементов и есть необходимость перебрать
все элементы этого набора, то с этим может возникнуть проблема.
Если для передачи этого набора создать геттер, то возвращая ссылку, мы по сути даем небезопасный доступ к элементам набора за пределами объекта. 
Получивший этот доступ программист может без нашего ведома модифицировать объект (набор элементов) - изменить состав элементов, сократить его размер и т.д.

**Если же возвращать копию набора, то это может сильно и негативно повлиять на производительность.**

Для решения этой проблемы существует **паттерн "Итератор"** (интерфейс Iterable<>).

Суть паттерна в том, чтобы создать сторонний объект, который "знает как перебирать" (итерировать) множество
элементов, инкапсулированных в исходном объекте.

Объект итератор должен иметь две функциональности (по сути - метода):
1) знать как определить есть ли следующий элемент (метод типа boolean);
2) вернуть текущий элемент и перейти к следующему (метод, возвращающий следующий элемент множества).

В Java существует интерфейс Iterator<T> с двумя абстрактными методами:
- boolean hasNext(), возвращающий true, если еще есть элементы, и false если дошли до конца множества, и 
- T next(), возвращающий текущий элемент, и переводящий "указатель" к следующему элементу.

В интерфейсе Iterator существует еще дополнительный дефолтный метод void remove(),
который имеет пустое тело. Но если нам надо реализовать функциональность корректного удаления
текущего элемента в процессе итерирования, то метод remove надо переопределить.

Класс инкапсулирущий множество, которое надо итерировать, имплементирует (наследует) интерфейс Iterable<T>,
у которого имеется абстрактный интерфейс Iterator<T> iterator() и в нем определен метод, возвращающий итератор для объектов
данного класса.

## Интерфейс Collection
Интерфейс Collection в Java является базовым интерфейсом для всех коллекций в Java Collections Framework (JCF). 
Он предоставляет основные методы для работы с группами объектов, таких как добавление, удаление, проверка на наличие элементов и преобразование в массив.

Интерфейс Collection расширяет интерфейс Iterable, т. е. все коллекции итерируемые.
Интерфейс Collection определяет некоторый основной набор методов для работы с коллекциями данных.
Это набор CRUD-операций: добавление, удаление, поиск, обновление и другие методы, например, получение колличества элементов в коллекции и т. д.

Этот интерфейс является основой для более специализированных интерфейсов, таких как:
- List (список)
- Set (множество)
- Queue (очередь)

## Java Collection Framework

Java Collection Framework (JCF) - множество(набор) классов и интерфейсов которые реализуют наиболее часто
используемые структуры данных.

JCF состоит из двух больших подразделов: **Collection** и **Map**.
Мы начинаем наше изучение JCF с коллекций.

Интерфейс **List<E>** содержит в себе методы для **списков**.
- Обеспечивает работу с упорядоченной коллекцией элементов, которая **допускает хранение дубликатов**.
- Упорядоченность означет, что:
  - элементы в списке хранятся в том порядке, в котором они добавлены (**новые элементы встают в конец списка** по мере их добавления, сортировки при вставке не происходит). 
  
  - Главные методы:
    - получить элемент по его индексу методом get(int index)
    - вставить элемент add(int index, E element)
    - удалить элементы по индексу remove(int index)
    - обновить элемент по индексу set(int index, E element)
    
  - Поиск и выборка элементов:
    - int indexOf(Object o); - возвращает индекс первого найденного такого объекта из возможных
    - int lastIndexOf(Object o); - возвращает первый найденный с конца списка
    - List<E> subList(int fromIndex, int toIndex); - возвращает фрагмент (часть) листа

Реализации интерфейса List<T>:

- **ArrayList<T>**:
  - Основан на массиве.
  - Быстрый доступ (O(1)) по индексу - это его "+".
  - Медленное удаление и вставка элементов в середину списка - это его "-":
    - добавление в конец списка - сложность O(1)
    - добавление в начало списка или вставка в список - O(n)

- **LinkedList<T>**:
  - Основан на двусвязном списке (Node, каждый узел знает своих соседей - слева и справа)
  - Быстрая вставка и удаление элементов (O(1) или O(n)) - это его "+"
  - Медленный доступ (O(n)) по индексу - это его "-".

Интерфейс Set содержит в себе методы для множеств - набора **уникальных** элементов.
Set - на сл. занятии.

----------------------------------------------

Для Iterable объектов можно использовать цикл for-each. 
Его синтаксис таков:

`for(T e: set_of_T){
    do something;
}
`
В теле этого цикла переменная "e" принимает поочередно значение каждого элемента из set_of_T

**ВНИМАНИЕ!!!**
В цикле for-each нельзя модифицировать итерируемое множество.

---------------------------------------------

# ArrayList - что это и зачем?

## Концепция массива Array:
ТИП[] имя_массива = new ТИП[размер];
Массивы хранят данные ОДНОГО ТИПА (int, String, double, ...).

В массиве данные можно сохранить и затем ими управлять:
**C - создать, R - прочитать, E|U - отредактировать или обновить, D - удалить = CRUD.**
НО с массивами "трудно" работать - необходимо следить за размером.

### Концепция коллекций Collection (Collections Framework):
**Коллекция (Collection)** в Java — это структура, которая обеспечивает
архитектуру для хранения и управления группой **Объектов (Objects)**.

**Коллекции** позволяют хранить группы Объектов, это абстракция гораздо более общего уровня,
чем массивы. Хранить и управлять коллекциями в конечном счёте удобнее, проще, чем массивами.

Для управления данными в коллекциях нужны **Интерфейсы** - способы управления/манипулирования
объектами в коллекциях. В целом интерфейсы обеспечивают примерно одно и то же - **CRUD** объектов
в коллекциях, но их реализация бывает специфична из-за различий объектов в коллекциях.

Кто-то в группе архитекторов Java очень хорошо подумал и выявил общее свойство
для хранимых данных - **ПЕРЕБИРАЕМОСТЬ(ITERABLE)**.

Интерфейс **Iterable** - "родитель" трех видов интерфейсов:
- List (Список)
- Queue (Очередь)
- Set (Множество),
  которые позволяют работать с коллекциями.

Наша с вами задача на данном этапе начать работать с классом **ArrayList**,
который имплементирует (наследует) интерфейс List:
* Список - это коллекция, в которой все элементы имеют порядковый номер (индекс).

Класс **ArrayList** позволяет нам создавать объекты такого класса и ими пользоваться.

### Синтаксис создания ArrayList:
import java.util.ArrayList;

ArrayList<Тип> имяМассива = new ArrayList<>();

**примеры:**
ArrayList<Integer> myNumbersList = new ArrayList<>(); // список целых чисел
ArrayList<String> myNamesList = new ArrayList<>(); // список строк

# ArrayList подробно
В обычном массиве (Array) мы **не можем изменить размер**, он задается при создании массива.
Структура ArrayList из JCF имеет динамический размер, она расширяется автоматически по мере добавления
в него элементов. При создании собственного списка на базе ArrayList размер не указывается.

## Вопрос: ArrayList - это динамический массив?
ArrayList - реализован на базе стандартного Array.
ArrayList "на лету" создает новый массив, а не меняет размер старого,
и переносит в него содержимое старого массива.
Размер массива при каждом добавлении элемента списка увеличивается в 1,5 раза.
**Размер находящегося в памяти массива ни в одном языке программирования "на лету" изменить нельзя.**

## Вопрос: чем ArrayList лучше, чем просто Array?
- Добавление и удаление элементов легче в ArrayList - не надо думать о размере массива
- Поиск, проверка элемента на наличие легче - используем встроенный метод contains()
- Сортировка для ArrayList реализована стандартными методами в Collections, для Array не надо писать самим
- Можно ли в ArrayList добавить null - ответ ДА
- Можно ли в ArrayList добавить дубликат(ы) - ответ ДА
- можно использовать цикл for each для пробегания по элементам массива, есть ограничения по модификации
  в момент обхода (нежелательно удалять элементы коллекции)

## Вопрос: бывает ли ArrayList двух и более мерным?
Ответ - грубо говоря, нет, так не делают.
В теории мы можем построить ArrayList<ArrayList1>.
На практике для задач с многомерными массивами лучше использовать стандартный Array[][].

## ArrayList - прямое заполнение методом asList
ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Peter","Vladimir","Stepan"));
System.out.println(namesList);

</details>