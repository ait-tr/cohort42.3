<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

The **try ... catch** construction is used when the program terminates.
incorrect, the program exit code is different from 0.

### Syntax
`try { // try
// Block of code to try

}
catch(Exception e) { // catch
// Block of code to handle errors
}`

#### Explanations
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

You can handle many exceptions and user errors yourself using if, BUT WHY?
Java developers provide standard tools for this -
this is the Throwable class (a descendant of the Object class) and its methods.

Examples:
1. Division by 0;
2. Going beyond the array;
3. Checking user input for correctness.

Good article with examples:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Algorithm for using try ... catch
1. If the program crashes (the termination code is not 0), work with the user stops
2. then we look at the diagnostics - what is printed at the moment the program crashes, there are indications of line numbers
   in the code where errors occur
3. These lines need to be “dressed” with a try ... catch construction

The abstract class Writer contains methods designed to write one character to a stream.
The FileWriter class extends the Writer class, and implements the methods of the parent class for writing a character to a file.

The abstract class Reader contains methods designed to read a single character from a stream. The FileReader class extends the Reader class, and implements the parent class's methods for reading a character from a file.

The BufferedReader and PrintWriter classes allow you to buffer the reading and writing of characters from/to a stream. That is, they contain methods designed to read/write a group of characters (String) at once.

System.in is an object of type InputStream associated with the console as a source. An object created as new BufferedReader(new InputStreamReader(System.in) allows you to read lines from the console using the readLine method.

# Serialization

Serialization is the process of converting an object into a sequence of bytes so that the object can be saved to a file, transmitted over a network, or stored in a database. Deserialization is the reverse process of reconstructing the original object from a sequence of bytes.

Basic Concepts
Serialization: Converting an object into a format suitable for storage or transmission.
Deserialization: Restoring an object from a serialized format.
Using Serialization
Saving object state: Objects can be saved to a file or database and restored later.
Transferring objects over a network: Objects can be transferred between different parts of a distributed system.
Object cloning: Serialization and deserialization can be used to deeply copy objects.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

Конструкция **try ... catch** используется в тот момент, когда программа завершает работу
некорректно, Code выхода из программы отличен от 0.

### Синтаксис
`try { // попытаться
//  Block of code to try

}
catch(Exception e) { // схватить
//  Block of code to handle errors
}`

#### Пояснения
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Многие исключения и ошибки пользователя можно обрабатывать самому с помощью if, НО ЗАЧЕМ?
Разработчики Java предоставляют стандартный инструментарий для этого -
это класс **Throwable** (потомок класса Object) и его методы.

Примеры:
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность.

Хорошая статья с примерами:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Алгоритм применения try ... catch
1. Ели программа падает (код окончания не равен 0), работа с пользователем прекращается
2. то смотрим на дигностику - то, что печатается в момент падения программы, там есть указания на номера строк
   в коде, в которых происходят ошибки
3. На эти строки надо "одеть" конструкцию try ... catch

# Потоки ввода-вывода в Java

Абстрактный класс Writer, содержит методы, предназначенные для записи одного символа в поток. Класс FileWriter расширяет класс Writer, и имплементирует методы родительского класса для записи символа в файл.

Абстрактный класс Reader, содержит методы, предназначенные для чтения одного символа из потока. Класс FileReader расширяет класс Reader, и имплементирует методы родительского класса для чтения символа из файла.

Класс BufferedReader и PrintWriter, позволяют буфферизировать чтение и запись символов из/в поток. Т. е. содержат методы, предназначенные для чтения/записи сразу группы символов (String).

System.in - объект типа InputStream связанный с консолью как источником. Объект созданный как new BufferedReader(new InputStreamReader(System.in) позволяет считывать строки с консоли при помощи метода readLine.

# Сериализация

Сериализация — это процесс преобразования объекта в последовательность байтов, чтобы объект мог быть сохранен в файл, передан по сети или сохранен в базе данных. Десериализация — это обратный процесс, когда из последовательности байтов восстанавливается исходный объект.

Основные понятия
Сериализация: Преобразование объекта в формат, пригодный для хранения или передачи.
Десериализация: Восстановление объекта из сериализованного формата.
Применение сериализации
Сохранение состояния объекта: Объекты могут быть сохранены в файл или базу данных и восстановлены позже.
Передача объектов по сети: Объекты могут быть переданы между разными частями распределенной системы.
Клонирование объектов: Сериализация и десериализация могут использоваться для глубокого копирования объектов.


</details>






