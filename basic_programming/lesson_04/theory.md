We start the method name with a small letter.
camelCase is a naming style when the 1st letter is small, and then the “words” begin with a capital letter.

toDoSomething is the correct method name, which is verb style.

ToDoOne - by convention it should not be called that.

We start the class name with a capital letter.

-------------------------------------------------- -------

## Methods
A method that accepts nothing (empty) and returns nothing BUT does what it says when called looks like this:

public static void methodName(){
doSomething();
}
// void indicates that the method does not return anything

-------------------------------------------------- -------

A method that takes parameters (arguments) and returns nothing BUT does what it says when called looks like this:

public static void methodName(Type1 t1, Type2 t2){
doSomething();
t1 = ...;
t2 = ...;
}
// Type1 t1 - an explicit indication of the type and name of the variable with which the method will work
// void indicates that the method does not return anything

-------------------------------------------------- --------

A method that takes parameters (arguments) and returns a result of type Type looks like this:

public static Type methodName(Type t1, Type t2){
doSomething;
return ...; // response, result from/from the method
}

The method can only return ONE TYPE of data.
The result of a method that returns data can and should be taken into a variable of the appropriate type.

Any method is called by its name either without parameters () or with parameters (a, b) that are passed
into method.
`int size;` is a variable declaration
`int size()` is a method declaration that returns an integer

---------------------------------

## Methods arguments. Return.

Имя метода начинаем с маленькой буквы.
camelCase - это стиль наименования, когда 1-я буква - маленькая, а далее "слова" начинаются с большой.

toDoSomething - это верное название метода, что в стиле глагола.

ToDoOne - по соглашению так называть не следует.

Имя класса начинаем с Большой буквы.

---------------------------------------------------------

## Методы
Метод, который ничего не принимает (пусто) и ничего не возвращает, НО делает то, что в нем написано, когда его вызывают, выглядит так:

public static void methodName(){ 
    doSomething();
}
// void указывает на то, что метод ничего не возвращает

---------------------------------------------------------

Метод, который принимает параметры (аргументы) и ничего не возвращает, НО делает то, что в нем написано, когда его вызывают, выглядит так:

public static void methodName(Type1 t1, Type2 t2){
    doSomething();
    t1 = ...;
    t2 = ...;
}
// Type1 t1 - явное указание на тип и название переменной, с которой будет работать метод
// void указывает на то, что метод ничего не возвращает

----------------------------------------------------------

Метод, который принимает параметры (аргументы) и возвращает результат типа Type выглядит так:

public static Type methodName(Type t1, Type t2){
    doSomething;
    return ...; // ответ, результат из/от метода
}

Метод может вернуть данные только ОДНОГО ТИПА. 
Результат работы метода, который возвращает данные, можно и нужно принимать в переменную соответствующего типа.

Любой метод вызывается по его имени либо без параметров (), либо с параметрами (a, b), которые передаются
в метод.
        `int size;` - это объявление переменной
        `int size()`- это объявление метода, который возвращает целое число

