package classwork_41.set;

import java.util.TreeSet;

public class TreeSetExampleString {
    public static void main(String[] args) {
        // Создание TreeSet
        TreeSet<String> words = new TreeSet<>();

        // Добавление элементов в TreeSet
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("mango");
        words.add("pear");

        // Вывод всех элементов TreeSet
        System.out.println("Элементы TreeSet: " + words);

        // Удаление нескольких элементов из TreeSet
        words.remove("banana");
        words.remove("pear");
        System.out.println("После удаления элементов: " + words);

        // Нахождение и вывод наименьшего и наибольшего элементов
        String smallest = words.first();
        String largest = words.last();
        System.out.println("Наименьший элемент: " + smallest);
        System.out.println("Наибольший элемент: " + largest);

        // Проверка наличия заданного элемента
        String searchElement = "apple";
        boolean containsElement = words.contains(searchElement);
        System.out.println("TreeSet содержит " + searchElement + ": " + containsElement);
    }
}

