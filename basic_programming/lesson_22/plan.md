# Lesson plan No. 22 04/16/2024




---------------------------------

# План занятия №20 09.04.2024

1. Что мы узнали и сделали на прошлом занятии?
- классы-обертки Integer, Byte, Character, Double, Boolean, ...
  - константы классов
  - методы ParseInt, ParseDouble
- запуск приложения с аргументами командной строки
  - main(String[] args){
      args[0] = ...; // это ...
      args[1] = ...; // это ...
      ...
  
  }

2. Домашнее задание - есть ли вопросы?
- BigInteger
- приложение с аргументами типов данных int, byte, short, ...

3. Тема занятия:
   класс String и его методы:
   length, charAt, equalsIgnoreCase, toUpperCase, toLowerCase, indexOf, lastIndexOf, substring, replace

4. Практика:

- Упражнения с методами класса String.

- Практическая работа: создание класса User с полями email, password и методами валидации email и password.

Валидация email:
1) @ exists and only one
2) dot after @
3) after last dot minimum 2 symbols
4) alphabetic, digits, _ , - , . , @

Валидация password:
1) min 8 symbols
2) min one symbol of uppercase
3) min one symbol of lowercase
4) min one digit
5) min one special symbol (!%@*&)
