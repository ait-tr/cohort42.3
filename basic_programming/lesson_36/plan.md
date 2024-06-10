# Lesson plan No. 36 06/10/2024

1. What we did in the last lesson:
- studied the Java Time API

- **Working with dates:**
- find out the current date and time: you can use the method ...
- is there a date, what day of the week was it? day of the month? day of the year? we use the method...
- there is a date, how can I find out if it was earlier? or later? we use the method...

- **Time travel**
- to the future ...
- to the past...
- using ChronoUnit, what they are...

- **Getting a time interval**
- between method
- compareTo method

- **Sort array by time**
- what class and method is used for this?

2. We analyze homework:
- Books
- Cars

3. New topic:
   Java Time API
- **Date Formatter** and **parsing date from string**

- inserting an object while maintaining the sort order:
- Step 1: use BinarySearch to find the index to insert the element
- Step 2: use the Arrays.copyOf, Arrays.copyOfRange, System.arraycopy methods

4. Workshop:

- **Date Formatter** and **parsing date from string**

- array of objects **City**: inserting an object while maintaining the sort order
- use of the Arrays.copyOf, Arrays.copyOfRange, System.arraycopy methods

- **Album** application - development using a UML diagram

---------------------------------------------------

# План занятия №36 10.06.2024

1. Что мы сделали на прошлом занятии:

- научились сортировать массив по двум полям;

- изучили Java Time API.

- **Работа с датами:**
    - узнать текущую дату и время: можно с помощью метода: Класс.now() 
    - есть дата, какой это был день недели? день месяца? день года?  используем метод Класс.of()
    - есть дата, как узнать, это было раньше? или позже?  используем методы:
      - .plusDay()
      - .minusDay()
      - .get...

- **Путешествие во времени**
    - в будущее ...
    - в прошлое ...
    - использование ChronoUnit, какие они бывают ...
  это Enum 
    - YEARS, DAY, HALFDAY, CENTURY, DECADES, ... 

- **Получение интервала времени**
  - способ 1: метод .between
  - способ 2: метод .compareTo

- **Сортировка массива по времени**
    - какой класс и метод для этого используется?
  Arrays - обертка над всеми массивами
  Arrays.sort

2. Разбираем домашние задания:
- Books 
- Cars

3. Новая тема: 
Java Time API
- **Date Formatter** и **парсинг даты из строки**

- вставка объекта с сохранением порядка сортировки:
  - Шаг 1: используем BinarySearch для поиска индекса для вставки элемента
  - Шаг 2: используем методы Arrays.copyOf, Arrays.copyOfRange, System.arraycopy 

4. Практикум:

- **Date Formatter** и **парсинг даты из строки**
  - необходимо научиться извлекать из строки дату, то есть получать тип данных LocalDate

- массив объектов **City**: вставка объекта с сохранением порядка сортировки
  - использование методов Arrays.copyOf, Arrays.copyOfRange, System.arraycopy:
    - найти индекс элемента в массиве Comparable объектов
    - найти индекс элемента в массиве объектов, отсортированных с помощью Comparator
    - скопировать часть массива в новый массив
    - создать копию массива, увеличить его длину, вставить содержимое внутрь
    - увеличить размер массива, отсортировать новый массив, найти в нем индекс, куда встанет добавляемый элемент
    - вставить новый объект в массив, соблюдая порядок сортировки

- приложение **Album** - разработка по UML-схеме

