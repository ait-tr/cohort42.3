package classwork_41.set;

import java.util.TreeSet;

public class TreeSetExampleNumbers {
    public static void main(String[] args) {
        // Создание TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавление элементов в TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(1);
        numbers.add(15);

        // Вывод всех элементов TreeSet
        System.out.println("Элементы TreeSet: " + numbers);

        // Удаление нескольких элементов из TreeSet
        numbers.remove(5);
        numbers.remove(15);
        System.out.println("После удаления элементов: " + numbers);

        // Нахождение и вывод наименьшего и наибольшего элементов
        Integer smallest = numbers.first();
        Integer largest = numbers.last();
        System.out.println("Наименьший элемент: " + smallest);
        System.out.println("Наибольший элемент: " + largest);

        // Проверка наличия заданного элемента
        int searchElement = 10;
        boolean containsElement = numbers.contains(searchElement);
        System.out.println("TreeSet содержит " + searchElement + ": " + containsElement);
    }
}
