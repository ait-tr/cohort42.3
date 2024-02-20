# Theory

## Algorithms (general concept and basic properties)
Watch the video: https://www.youtube.com/watch?v=cDA3_5982h8
- Who is the programmer?
- Who is the computer?
- What exactly are the problems?

**Algorithm** is a _clear_ _sequence_ of _actions_, the implementation of which gives some
known _result_.

**Main properties of the algorithm:**
1. Discretion (broken into steps).
   “Top-down” methodology, “An elephant must be eaten in parts.”
2. Effectiveness (there is a result at every step and at the end).
3. Determinism (unambiguity, there is no possibility of “interpretation”).
4. Limb (completed).

## Java programming language

**Java** is a high-level programming language originally developed by
Sun Microsystems and released in 1995.
Works on various platforms such as Windows, Mac OS,
as well as various versions of UNIX.

**Java** is a general-purpose programming language designed to enable programmers to:
- could write once and run anywhere (WORA).
  This means that the compiled Java code
- Can run on all platforms that support Java without the need for recompilation.

Learning a programming language usually starts with the 'Hello, World!' program, which displays this text on the screen.
```console
Hello, World!
```
In Java, this program would look like this:
```java
   class Main {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
```

The text *Hello, World!* appears on the screen thanks to the command
`System.out.println()`,
where `println()` is short for *print line*. It displays the value specified in parentheses
`("Hello, World!")`, in this case a string. The string is always surrounded by double quotes "". If this is not done, the compiler will indicate a syntax error.

**It is very important to know and remember the following rules in the syntax of the Java language:**

**Case Sensitivity**
– Java is case sensitive, meaning the identifier Hello and hello have different meanings.
x, X are different identifiers!

Class names – for all **the first letter must be in upper case**.

If multiple words are used to form a class name, the first letter of each internal word
must be in upper case, for example, "MyJavaClass".
Method names – In Java syntax, all method names must begin with a lowercase letter. If multiple words are used to form a method name or variable name, then
The first letter of each internal word must be in upper case, for example, "myMethodName()", and the very first letter must be in small case.

**Program file name = class name**
– the name of the program file must exactly match(!) the name of the class.
When saving a file, you should save it using the class name (remember to be case sensitive) and add ".java" to the end of the name (if the names don't match, your program won't compile), for example,
"MyJavaProgram" is the name of the class, then the file should be saved as "MyJavaProgram.java".

This naming style is called CamelCase.

public static void main(String args[]) – program processing begins with the main() method, which is a required part of every program. Identifiers are names used for classes, variables and methods.

**All Java components require a name.**

There are several rules in Java syntax that you need to remember about the identifier.
They are as follows:
* Each identifier must begin with "A" before "Z" or "a" before "z", "$" or "_".
  After the first character can have any combination of characters. The keyword cannot be used as an identifier.

* The most important thing is that the identifier in Java is case sensitive!
  Example of correct spelling: age, $salary, _value, __1_value.
  An example of incorrect spelling: 123abc, -salary (you cannot start a name with the numbers 0 to 9 and special characters).

* In Java (as in all programming languages) **there cannot be two identical identifiers**, the compiler will show an error.

**Keywords**
A total of **50 service (key)** words are reserved in Java.

List of keywords in alphabetical order:

abstract assert
boolean - logical variable
break byte case catch
char is a character, for example a, b, c, $, %...
class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Important!** The keyword cannot be used as a constant or variable, or any other
identifier names.

**Helpful!** Create your own mini-dictionary with translations of key words.

---------------------------------

# Теория

## Алгоритмы (общее понятие и основные свойства)
Cмотрим ролик: https://www.youtube.com/watch?v=cDA3_5982h8 
- Кто программист?
- Кто компьютер?
- В чем, собственно, проблемы?

**Алгоритм** — это _четкая_ _последовательность_ _действий_, выполнение которой дает какой-то заранее
известный _результат_.

**Главные свойства алгоритма:**
1. Дискретность (разбит на шаги). 
Методология "сверху - вниз", "Слона надо есть по частям."
2. Результативность (имеется результат на каждом шагу и по итогу).
3. Детерминированность (однозначность, отсутствует возможность "толкования").
4. Конечность (завершается).

## Язык программирования Java

**Java** – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году.
Работает на различных платформах, таких как Windows, Mac OS,
а также различных версиях UNIX.

**Java** – это язык программирования общего назначения, предназначенный для того, чтобы программисты:
- могли писать один раз и запускать где угодно (WORA). 
Это означает, что скомпилированный код Java 
- может работать на всех платформах, поддерживающих Java, без необходимости повторной компиляции.

Изучать язык программирования обычно начинают с программы 'Hello, World!', которая выводит этот текст на экран.
```console
Hello, World!
```
В языке Java эта программа будет выглядеть так:
```java
  class Main { 
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
```

Текст *Hello, World!* появляется на экране благодаря команде 
`System.out.println()`,
где `println()` - это сокращение от английского *print line*. Она выводит на экран значение, указанное в скобках
`("Hello, World!")`, в данном случае строку. Строка всегда обрамляется двойными кавычками "". Если этого не сделать, то компилятор укажет на синтаксическую ошибку.

**Очень важно знать и помнить следующие правила в синтаксисе языка Java:**

**Чувствительность к регистру**
– язык Java чувствителен к регистру, то есть идентификатор Hello и hello имеют разный смысл.
x, X - это разные идентификаторы!

Название классов – для всех **первая буква должна быть в верхнем регистре**.

Если несколько слов используются, чтобы сформировать название класса, первая буква каждого внутреннего слова
должна быть в верхнем регистре, например, «MyJavaClass». 
Название методов – в синтаксисе Java все имена методов должны начинаться с буквы нижнего регистра. Если несколько слов используются, чтобы сформировать имя метода или название переменной, то
первая буква каждого внутреннего слова должна быть в верхнем регистре, например, «myMethodName()», а самая первая - в малом.

**Название файла программы = название класса**
– наименование файла программы должно точно совпадать(!) с именем класса.
При сохранении файла, Вы должны сохранить его, используя имя класса (помните о чувствительности к регистру)и добавить «.java» в конце имени (если имена не совпадают, Ваша программа не будет компилироваться), например,
«MyJavaProgram» – это название класса, тогда файл должен быть сохранен как «MyJavaProgram.java».

Этот стиль наименования называется CamelCase.

public static void main(String args[]) – обработка программы начинается с метода main(), который является обязательной частью каждой программы. Идентификаторы – имена, используемые для классов, переменных и методов.

**Все компоненты Java требуют наличие имени.**

Существует несколько правил в синтаксисе языка Java, которые необходимо помнить об идентификаторе.
Они следующие:
* Каждый идентификатор должен начинаться с «A» до «Z» или «a» до «z», «$» или «_».
После первого символа может иметь любую комбинацию символов. Ключевое слово не может быть использовано в качестве идентификатора.

* Самое важное – идентификатор в Java чувствителен к регистру!
Пример правильного написания: age, $salary, _value, __1_value. 
Пример неправильного написания: 123abc, -salary (нельзя начинать имя с цифры 0 до 9 и специальных символов).

* В Java (как и во всех языках программирования) **не может быть двух одинаковых идентификаторов**, компилятор покажет ошибку.

**Ключевые слова**
Всего зарезервировано **50 служебных (ключевых)** слов в Java.

Список ключевых слов по алфавиту:

abstract assert 
boolean - логическая переменная 
break byte case catch 
char - это символ, например, a, b, c, $, % ...
class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Важно!** Ключевое слово не может быть употреблено в качестве константы или переменной, или любых других
имен идентификаторов.

**Полезно!** Составить свой мини-словарь с переводом ключевых слов.