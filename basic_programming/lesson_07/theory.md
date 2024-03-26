# Symbols in computer memory
Any set of data in the computer's RAM is stored as a binary number.
This applies to both characters (numbers, letters, punctuation marks, etc.) and strings that consist of characters.

When a character is stored in memory, it is first converted into a digital code.
And then this digital code is stored in memory as a binary or hexadecimal number.

Over the years, various encoding schemes have been developed to represent characters in computer memory.
Historically, the most important of these encoding schemes is the encoding scheme
ASCII (American Standard Code for Information Interchange).

**ASCII Character Table**
ASCII is a set of 128 numeric codes that represent English letters,
various punctuation marks and other symbols.
For example, the ASCII code for the uppercase English letter "A" (Latin) is 65.
When you type the letter "A" in upper case on your computer keyboard,
The number 65 is stored in memory (as a binary number, of course).
The ASCII code for an English uppercase "B" is 66, for an uppercase "C" it is 67, etc.
There are exactly 7 bits per character in ASCII.

The ASCII character set was developed in the early 1960s and eventually adopted
almost all computer manufacturers. However, the ASCII encoding scheme has limitations,
because it only defines codes for 128 characters. In order to fix this,
in the early 1990s, the Unicode character set (Unicode) was developed.
It is a broad ASCII-compatible encoding scheme that can also represent characters from many of the world's languages.
Today, Unicode is quickly becoming the standard character set used in the computer industry.

**Unicode Character Table**
The Unicode character table is a set of numeric characters that include
symbols of almost all written languages of the world. The standard was proposed in 1991 by a non-profit organization
"Unicode Consortium". The use of this standard allows you to encode a very large number of characters
from different writing systems: in documents encoded according to the Unicode standard, they can coexist
Chinese characters, mathematical symbols, letters of the Greek alphabet, Latin and Cyrillic alphabet, symbols
musical notation.

The standard consists of two main parts: a universal character set and a family of encodings
(Unicode transformation format, UTF). The Universal Character Set lists those allowed by the Unicode standard
characters and assigns a code to each character as a non-negative integer.
An encoding family defines how character codes are converted for storage on a computer and transmission.

New characters are being added to Unicode all the time, and the size of this table itself is not limited and will only grow,
Therefore, currently, storing one Unicode character in memory may require from 1 to 8 bytes.
The lack of restrictions led to the appearance of symbols for all occasions.

Note 1. Official website of the Unicode character table: https://home.unicode.org
Note 2: Unicode is not an encoding. This is exactly a symbol table.

How characters with corresponding codes will be stored in computer memory depends on the specific encoding,
Unicode-based, such as UTF-8.
You can read about the difference between the Unicode character table and the UTF-8 encoding here: https://developer.roman.grinyov.name/blog/104

Note 3: The first 128 codes of the Unicode character table are the same as ASCII.

## Working with symbols in Java

You can set the value of a char variable in the following way:

char a = 'A'; // Variable a will contain the Latin letter A.
char a = 65; // Variable a will contain the Latin letter A. Its code is exactly 65.

char a = 0x41; // Variable a will contain the Latin letter A. // Its code is 65, which is equal to 41 in hexadecimal.
char a = 0x0041; // Two extra zeros don't change anything.
char a ='\u0041'; // Pointer to Unicode code

Note:
one character - an object of type char - is written in single quotes ('a'),
and several characters - a string - in double ("str").

-------------------------------------------------- -----------------------
# Algorithm for solving programming problems

**Step 1.**
What is given?
Write down everything that is given in the problem, think about the types and names of the necessary variables.

**Step 2**
What should be done?
Write down everything that needs to be found or done as part of the task.
Think over the types and names of the necessary variables, think over the possible necessary methods.

**Step 3.**
How has this already been resolved?
Find fragments of similar code, solutions to similar problems from which you can build and solve your problem “by analogy.”

**Step 4.**
What is the most important, difficult moment in the task?
Think over and write step by step a key algorithm that allows you to solve the problem.

**Step 5.**
How will the program work?
Think over the user interface.

Having the answers to all 5 questions in your head, having gone through these 5 steps, you can begin to writing code.

____________________________________________________

# Символы в памяти компьютера
Любой набор данных в оперативной памяти компьютера храниться в виде двоичного числа.
Это относится и к символам (цифры, буквы, знаки препинания и т.д.), и к строкам, которые состоят из символов.

Когда символ сохраняется в памяти, он сначала преобразуется в цифровой код.
И затем этот цифровой код сохраняется в памяти как двоичное или 16-тиричное число.

За прошедшие годы для представления символов в памяти компьютера были разработаны различные схемы кодирования.
Исторически самой важной из этих схем кодирования является схема кодирования
ASCII (American Standard Code for Information Interchange – американский стандартный код обмена информацией).

**Таблица символов ASCII**  
ASCII представляет собой набор из 128 цифровых кодов, которые обозначают английские буквы,
различные знаки препинания и другие символы.
Например, код ASCII для прописной английской буквы «А» (латинской) равняется 65.
Когда на компьютерной клавиатуре вы набираете букву «А» в верхнем регистре,
в памяти сохраняется число 65 (как двоичное число, разумеется).
Код ASCII для английской «В» в верхнем регистре равняется 66, для «С» в верхнем регистре – 67 и т. д.
На один символ в ASCII отводится ровно 7 бит.

Набор символов ASCII был разработан в начале 1960-х годов и в конечном счете принят
почти всеми производителями компьютеров. Однако схема кодирования ASCII имеет ограничения,
потому что она определяет коды только для 128 символов. Для того чтобы это исправить,
в начале 1990-х годов был разработан набор символов Юникода (Unicode).
Это широкая схема кодирования, совместимая с ASCII, которая может также представлять символы многих языков мира.
Сегодня Юникод быстро становится стандартным набором символов, используемым в компьютерной индустрии.

**Таблица символов Unicode**  
Таблица символов Юникод представляет собой набор цифровых символов, которые включают в себя
символы почти всех письменных языков мира. Стандарт предложен в 1991 году некоммерческой организацией
«Консорциум Юникода». Применение этого стандарта позволяет закодировать очень большое число символов
из разных систем письменности: в документах, закодированных по стандарту Юникод, могут соседствовать
китайские иероглифы, математические символы, буквы греческого алфавита, латиницы и кириллицы, символы
музыкальной нотной нотации.

Стандарт состоит из двух основных частей: универсального набора символов и семейства кодировок
(Unicode transformation format, UTF). Универсальный набор символов перечисляет допустимые по стандарту Юникод
символы и присваивает каждому символу код в виде неотрицательного целого числа.
Семейство кодировок определяет способы преобразования кодов символов для хранения на компьютере и передачи.

В Юникод все время добавляются новые символы, а сам размер этой таблицы не ограничен и будет только расти,
поэтому сейчас при хранении в памяти одного юникод-символа может потребоваться от 1 до 8 байт.
Отсутствие ограничений привело к тому, что стали появляться символы на все случаи жизни.

Примечание 1. Официальный сайт таблицы символов Unicode: https://home.unicode.org
Примечание 2. Юникод — это не кодировка. Это именно таблица символов.

То, как символы с соответствующими кодами будут храниться в памяти компьютера, зависит от конкретной кодировки,
базирующейся на Юникоде, например UTF-8.
Про отличие таблицы символов Unicode от кодировки UTF-8 можно почитать тут: https://developer.roman.grinyov.name/blog/104

Примечание 3. Первые 128 кодов таблицы символов Unicode совпадают с ASCII.

## Работа с символами в Java

Задать значение переменной типа char можно следующим способом:

char a = 'A'; // Переменная а будет содержать латинскую букву А.
char a = 65; // Переменная а будет содержать латинскую букву А. Ее код как раз 65.

char a = 0x41; // Переменная а будет содержать латинскую букву А. // Ее код 65, что равно 41 в шестнадцатеричной системе.
char a = 0x0041; // Два лишних нуля ничего не меняют.
char a ='\u0041'; // Указание на код Unicode

Обратите внимание:
один символ — объект типа char — записывается в одинарных кавычках ('a'),
а несколько символов — строка — в двойных ("str").

-------------------------------------------------------------------------

# Алгоритм для решения задач по программированию

**Шаг 1.**
Что дано?
Выписать все, что дано в задаче, продумать типы и имена необходимых переменных.

**Шаг 2**
Что нужно сделать?
Выписать все, что нужно найти или сделать в рамках задачи.
Продумать типы и имена необходимых переменных, продумать возможные необходимые методы.

**Шаг 3.**
Как это уже решали?
Найти фрагменты похожего кода, решения похожих задач от которых можно оттолкнуться и решить "по аналогии" свою задачу.

**Шаг 4.**
Какой самый важный, сложный момент в задаче?
Продумать, написать по шагам ключевой алгоритм, который позволяет решить поставленную задачу.

**Шаг 5.**
Как будет работать программа?
Продумать интерфейс взаимодействия с пользователем.

Имея в голове ответы на все 5 вопросов, пройдя эти 5 шагов, можно приступать к написанию кода!