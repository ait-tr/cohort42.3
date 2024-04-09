# OOP - object-oriented programming (OOP)

## Upper, down casting for reference type variables. instanceof operator.

1. A reference of a parent type can refer to an object of a child type. In this case Java itself
   will conduct upper casting. If you try to assign a link value to a child type link
   parent type, the compiler will require explicit down casting. Wherein,
   if a parent type reference points to another child object, then at runtime
   code, an error will occur. You can check type matching using the instanceof operator.

2. Comparing objects using "==" is incorrect, because "==" formally compares references, i.e.
   object addresses. But you need to compare “field by field”.
   All objects in Java are descendants of the Object class.
   To compare objects, the Object class defines the equals method.
   If we want objects of our class to be compared with each other according to the fields we need, then we need
   override the equals method in our class, specifying in it the logic for comparing the given object with
   to others.

3. Objects of the String class created using double quotes are strings
   constants. This means that when we specify a string with the same content each time in
   double quotes, a new object is not created. We get a reference to the same object.


## OOP - object oriented programming (OOP)
(for repetition)

OOP:
- Class:
  a class unites objects, fields are specified in the class - these are the characteristics of its objects.

- objects and their methods:
  objects are like “nouns” in a language, they describe the state of an object;
  methods are “verbs”, they are responsible for the behavior of class objects.

A class is a file with a .java extension and must be named with a capital letter.
A class contains a "template" for its objects.
Object and its fields: These are a set of variables that describe the object. Variables
there is always a data type and a name.
Methods: perform the necessary actions, are tools for changing the state of an object.

## Inheritance

1. Inheritance (English inheritance) - the concept of object-oriented programming,
   according to which the created data type can inherit data and functionality
   from some already existing type, promoting the reuse of components
   software.

A simpler and more practical definition of inheritance:
a new class being created can inherit fields and methods from an existing class.
In the child class, the composition of the fields is expanded, and the methods are **overridden**.

2. To initialize inheritance from another class, use the service word **extends**.

Examples:

public class Laptop extends Computer{
...
}
______________________________________________

public class Dog extends Pet {
...
}

public class Cat extends Pet {
...
}

The parent class is also called a super class (**super**). The successor class is called a child class.
You can only inherit from one class.

Using inheritance in Java, you can build complex class hierarchies.

3. A successor class, inherits the fields and methods of the super class.
   In a child class, you can override the methods of the parent class if necessary
   change or define new functionality in them.
   Constructors are not inherited (except for the default one, if other constructors
   No).
   In addition to the public and private modifiers, there are also protected and package modifiers
   protected (which is the default modifier).

4. If it is necessary to prohibit inheritance from a class, then the final modifier is used.

final class SuperMan {
...
}

5. All classes that do not have a superclass explicitly specified are inherited from the **Object** class.
   That is, the Object class is the parent of all classes in Java by default.
   In particular, all classes inherit from the Object class the toString method, which returns a string
   representation of the object (fields and their values in one line).

6. Check type correspondence (relatedness of objects of different classes),
   can be done using the **instanceof** operator.

__________________________________________________

## Upper, down casting для переменных ссылочного типа. Оператор instanceof.

1. Ссылка родительского типа может ссылаться на объект дочернего типа. В этом случае Java сама
   проведет upper casting. Если попытаться ссылке дочернего типа присвоить значение ссылки
   родительского типа, то компилятор потребует явно провести кастинг (down casting). При этом,
   если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения
   кода, произойдет ошибка. Проверить соответствие типов, можно при помощи оператора instanceof.

2. Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е.
   адреса объектов. А нужно сравнивать "по полям". 
   Все объекты в Java являются наследниками класса Object. 
   Для сравнения объектов в классе Object определен метод equals. 
   Если хотим, чтобы объекты нашего класса сравнивались между собой по нужным нам полям, то надо
   переопределить метод equals в нашем классе, указав в нем логику сравнения заданного объекта с
   другим.

3. Объекты класса String создаваемые при помощи двойных кавычек, являются стринговыми
   константами. Это означает, что когда мы каждый раз указываем стринг с одинаковым содержимым в
   двойных кавычках, то новый объект не создается. Мы получаем ссылку на один и тот же объект.

4. Если необходимо запретить наследование от класса, то используется модификатор final.

final class SuperMan {
...
}

5. Все классы у которых явно не указан супер-класс, наследуются от класса **Object**.
   То есть класс Object является родителем всех классов в Java по умолчанию.
   В том числе, все классы наследуют от класса Object метод toString, возвращающий строковое
   представление объекта (поля и их значения в одной строчке).

6. Проверить соответствие типов (родство объектов разных классов),
      можно при помощи оператора **instanceof**.


## ООП - объектно ориентированное программирование (OOP)
(для повторения)

ООП:
- класс: 
класс объединяет объекты, в классе задаются поля - это характеристики его объектов.

- объекты и их методы:
объекты - это как "существительные" в языке, они описывают состояние объекта;
методы - это "глаголы", они отвечают за поведение объектов класса.

Класс - это файл с расширением .java, он обязательно называется с большой буквы.
Класс содержит "шаблон" для его объектов.
Объект и его поля: это набор переменных, которые описывают объект. У переменных
  всегда есть тип данных и имя.
Методы: делают необходимые действия, являются инструментами для изменения состояния объекта.

## Наследование

1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования,
   согласно которой создаваемый тип данных может наследовать данные и функциональность
   от некоторого уже существующего типа, способствуя повторному использованию компонентов
   программного обеспечения.

Более простое и практичное определение наследования:
создаваемый новый класс может наследовать поля и методы от уже существующего класса.
В дочернем классе состав полей расширяется, а методы **переопределяются**.

2. Для инициализации наследования от другого класса используют служебное слово **extends**.

Примеры:

public class Laptop extends Computer{
...
}
______________________________________________

public class Dog extends Pet {
...
}

public class Cat extends Pet {
...
}

Родительский класс называют еще супер-классом (**super**). Класс наследник, называют дочерним классом.
Наследовать разрешено только от одного класса.

При помощи наследования, в Java, можно строить сложные иерархии классов.

3. Класс-наследник, наследует поля и методы супер-класса.
   В дочернем классе можно переопределить методы родительского класса, если необходимо
   изменить, или определить в них новую функциональность.
   Конструкторы не наследуются (кроме дефолтного, если других конструкторов
   нет).
   Кроме модификаторов public, private, существуют еще модификаторы protected и package
   protected (являющийся дефолтным модификатором).

   
