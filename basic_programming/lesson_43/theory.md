<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# JCF: Map

## Map - briefly
Another part of JCF is the Map interface.

Map<K, V> is an interface that defines functionality for a data structure of type set of key-value pairs.
Key is a key, a unique element of a set.
Value is a value, some value from the collection.

All keys in maps are unique.

**Attention!!!**
Maps are not iterable over an object of type Map<K, V>, since Map does not inherit Iterable.
A Map can be iterated over multiple keys or values.

The main methods of the Map interface are given in the JCF presentation.

By analogy with sets, there are two types of maps: HashMap and TreeMap.

-------------------------------------------------- ------------

## Map - details

Inside the Map structure/collection, data is stored in the “key” - “value” format, that is, in pairs.
Any complex(?) types can act as both keys and values
- numbers, strings or even objects of other classes.
  ATTENTION!!! The key must be **unique**!

What does **Hash** have to do with it?
Hash is calculated for the key and stored in the Hash table.
Internally, HashMap stores elements in a table like this:
Hash(key) | Meaning
Hash(key) | Meaning
...
Key hash calculation **provides guaranteed speed of access to the element**
(pair of values) in the collection.
There is a possibility that the key hashes will match.
This situation is called a **collision**. HashMap takes care of this situation,
creating a LinkedList (see below).
Moreover, a HashMap can have two or more matching values ​​(but not key!)
collection elements.

**Examples of Maps (useful key-value pairs):**
address - all residents at this address
article - quantity of this in stock
name - number of such names in the group
word - number of repetitions in speech
what is searched for - number of search results
...

#### Operations with HashMap elements
nameMap.put (key , value) - adding and **updating** an element
nameMap.get (key) - getting value by key
nameMap.remove (key) - removing a value by key
nameMap.size() - getting the size (number) of elements


#### Syntax for creating a new Map
Map<keyType, valueType> nameMap = new HashMap<keyType, valueType>();
Map<keyType, valueType> nameMap = new TreeMap<keyType, valueType>();

#### Loop through HashMap elements
// Print keys - pass through all keys
for (String key : nameMap.keySet()) {
System.out.println(key);
}

// Print values - pass through all values
for (String value : nameMap.values()) {
System.out.println(value);
}

// Print keys and values - pass through all keys and their values
for (String key : nameMap.keySet()) {
System.out.println("key: " + key + " value: " + nameHashMap.get(i));
}

There are no numerical indexes, as in arrays or lists, in HashMap - element access
collections are carried out using a **key** (I remind you that it must be unique).


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# JСF: Map

## Map - кратко
Еще одной частью JCF является интерфейс Map.

Map<K, V> это интерфейс определяющий функциональность для структуры данных типа множество пар ключ-значение.
Key - это ключ, уникальный элемент множества.
Value - это значение, какое-то значение из коллекции.

Все ключи в мапах являются уникальными. 

**Внимание!!!**
Мапы не итерируемы по объекту типа Map<K, V>, так как Map не наследует Iterable.
Map можно итерировать по множеству ключей или по значениям.

Основные методы интерфейса Map приведены в презентации по JCF.

По аналогии с сетами, имеются две разновидности мап: HashMap и TreeMap.

--------------------------------------------------------------

## Map - подробно 

Внутри структуры/коллекции Map данные хранятся в формате "ключ" - "значение", то есть по парам.
И в качестве ключей, и в качестве значений могут выступать любые сложные(?) типы
— числа, строки или даже объекты других классов.
ВНИМАНИЕ!!! Ключ должен быть **уникален**!

А при чем здесь **Hash**?
Hash вычисляется для ключа и храниться в Hash-таблице.
Внутри себя HashMap хранит элементы в таблице вида:
Hash (ключа) | Значение
Hash (ключа) | Значение
...
Вычисление хеша ключа **обеспечивает гарантированную скорость доступа к элементу**
(паре значений) в коллекции.
Вероятность, что хеши ключей совпадут, имеется.
Такая ситуация называется **коллизией**. Эту ситуацию HashMap берет на себя,
создавая связанный список LinkedList (см. ниже).
При этом в HashMap могут быть два и более совпадающих по значению (но не по ключу!)
элементов коллекции.

**Примеры Map(мапов) (полезные пары ключ - значение):**
адрес - все жильцы по этому адресу
артикул - количество этого на складе
имя - кол-во таких имен в группе
слово - кол-во повторений в речи
что ищется в поиске - кол-во результатов поиска
...

#### Операции с элементами HashMap
nameMap.put (key , value) - добавление и **обновление** элемента
nameMap.get (key) - получение значения по ключу
nameMap.remove (key) - удаление значения по ключу
nameMap.size () - получение размера (количества) элементов


#### Синтаксис создания новой Map
Map<keyType, valueType> nameMap = new HashMap<keyType, valueType>();
Map<keyType, valueType> nameMap = new TreeMap<keyType, valueType>();

#### Цикл по элементам HashMap
// Print keys - проход по всем ключам
for (String key : nameMap.keySet()) {
System.out.println(key);
}

// Print values - проход по всем значениям
for (String value : nameMap.values()) {
System.out.println(value);
}

// Print keys and values - проход по всем ключам и их значениям
for (String key : nameMap.keySet()) {
System.out.println("key: " + key + " value: " + nameHashMap.get(i));
}

Номерных индексов, как в массивах или списках, в HashMap нет — доступ к элементу
коллекции осуществляется по **ключу** (напоминаю, что он должен быть уникальным).


</details>






