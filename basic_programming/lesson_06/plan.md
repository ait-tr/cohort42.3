# Lesson plan No. 6 02/20/2024
1. What did we learn and do in the last lesson?
- how do the numbers compare?
- how are symbols compared?
- logical expressions, comparison operations (let's give examples)
- truth table for A^B

- conditional operator:
  - not complete

  - full

Let's draw some flowcharts.

2. Homework:
- triangle inequality;
- discounted purchase price.

3. New topic:

Conditional statements, continued:
- ternary operator
- switch ... case

Keyboard input using the Scanner class.

Data types:
- char (character),
- String (string, that is, a set of characters)

See the theory section.

3. Practice:

- Task 1.
  The program specifies two integers.
  Find the minimum of them using the ternary operator.
  Supplement the program with the ability to enter numbers by the user.

- Task 2.
  Parents allow their child to play on the computer for 1 hour.
  Write a program that will respond to the grade received at school:

1. “Well done!”, the time for playing games on the computer is increased by 30 minutes.
2. "Okay", you can play on the computer for the usual 60 minutes.
3. “Mediocre.”, time for games is reduced by 30 minutes.
4. “Bad!”, no games on the computer today.
5. “Shame on the family!”, no games on the computer for 2 days.

- Task 3.
  Write a program that, based on the entered number from 1 to 7, determines the day of the week.
  The second option - on numbers from 1 to 5 the program reports that it is a weekday, and on numbers 6 and 7 that it is a weekend.

- Task 4.
  Write a program for a "Coffee machine" that allows the user to select a drink:
- Espresso
- Americano
- Latte
- Cappuccino
  After selection, the program should report the cost of the selected drink.


---------------------------------

# План занятия №6 20.02.2024

1. Что мы узнали и сделали на прошлом занятии?
- как сравниваются числа?
отнимаем одно от другого, сравниваем результат с 0 (положительный или отрицательный),
результат всегда либо TRUE(1), либо FALSE(0)

- как сравниваются символы?
a < z потому что код символа a = 97, код z = 122, 97 - 122 = -25 < 0 , значит a < z - это TRUE.

- логические выражения, операции сравнения (давайте приведем примеры)
boolean - это логический тип данных
x == y , x >= y , x != y

Логические союзы:
И, AND, &, && - это логический союз "И"
ИЛИ, OR, |, || - это логический союз "ИЛИ"
^ - XOR, "исключительное ИЛИ"

- таблица истинности для A ^ B
И ^ И = Л
И ^ Л = И
Л ^ И = И
Л ^ Л = Л

- условный оператор:
  - не полный
`if ( И ) {
  ...
  ...
  ...
  }`
...
  
    - полный
  ...
`if ( И  ) {
    ...
    ...
    ...
    } else {
      ...
      ...
      ...
  }`
...

Давайте нарисуем блок-схемы.

2. Homework:
- неравенство треугольника;
- стоимость покупки со скидкой.

3. Новая тема:

Уcловные операторы, продолжение:
- тернарный оператор
- switch ... case

Ввод данных с клавиатуры с помощью класса Scanner.

Типы данных:
- char (символ),
- String (строка, то есть набор символов)

См. раздел теория.

4. Практика:

- Задание 1.
В программе задаются два целых числа.
Найдите минимальное из них с помощью тернарного оператора.
Дополните программу возможностью ввода чисел пользователем.

- Задание 2.
Родители позволяют ребенку играть на компьютере 1 час.
Напишите программу, которая будет реагировать на полученную в школе оценку:

1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
3. "Посредственно.", время для игр уменьшается на 30 мин.
4. "Плохо!", сегодня никаких игр на компьютере.
5. "Позор семьи!", никаких игр на компьютере 2 дня.

- Задание 3.
Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
Второй вариант - на цифры от 1 до 5 программа сообщает, что это будний день, а на 6 и 7, что это выходной.

- Задание 4.
Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
- Эспрессо
- Американо
- Латте
- Капучино
После выбора программа должна сообщить стоимость выбранного напитка.
