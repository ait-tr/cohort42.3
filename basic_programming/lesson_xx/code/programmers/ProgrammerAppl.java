package classwork_45.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    // Необходимо ответить на вопросы:
    // 1. Кто из программистов знает больше всего языков (поименно)
    // программист - > кол-во языков или кол-во языков -> программисты
    // 2. Какие языки пользуются популярностью среди наших программистов
    // Отчет: язык программирования - сколько программистов его знают

    public static void main(String[] args) {

        // get list of programmers
        List<Programmer> programmers = getProgrammers();

        System.out.println("///////////////// Most skilled programmers ////////////////////////");
        printMostSkilledProgrammers(programmers);

        System.out.println("========== Most popular technologies (languages) ===========");
        printMostPorularTechnologies(programmers);

    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        // соберем в map
        // key - частота, value - кол-во технологий, которые знает программист
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(t -> t.getTechnologies().length));
        System.out.println("============ Programmers and technologies  =========");
        Integer max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        System.out.println("Max of technologies: " + max );

        //       int max = 0;
//        for (Programmer programmer : programmers) {
//            int key = programmer.getTechnologies().length; // это ключ для мапы, то кол-во языков, которое он знает
//            max = key > max ? key : max; // обновили max, если он стал больше в ходе выполнения цикла
//            skilledProgrammers.putIfAbsent(key, new ArrayList<>()); // если такой key встретился 1-й раз, то создаем пустой лист
//            List<Programmer> programmerList = skilledProgrammers.get(key);
//            programmerList.add(programmer);
//        }
        System.out.println("////////////////////////////////////////////");

        // System.out.println(skilledProgrammers); // кол-во технологий, объект Programmer
        for (Integer p : skilledProgrammers.keySet()) {
            System.out.println("Quantity of technologies: " + p + " => Programmers " + skilledProgrammers.get(p));
        }

        // Преобразуем ключи в список и сортируем его в обратном порядке
        List<Integer> keys = new ArrayList<>(skilledProgrammers.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        // Выводим в обратном порядке
        System.out.println("\nReversed order:");
        for (Integer p : keys) {
            System.out.println("Quantity of technologies: " + p + " => Programmers " + skilledProgrammers.get(p));
        }

        System.out.println("////////////////////////////////////////////");
    }

    private static void printMostPorularTechnologies(List<Programmer> programmers) {
        System.out.println("============ Print all technologies =========");
        // "вытащим" все языки программирования из programmers
        Iterable<String> technologies = programmers.stream()
                .map(p -> p.getTechnologies())// преобразование объекта programmer в одно его поле с массивом технологий
                .flatMap(t -> Arrays.stream(t)) // каждый из массивов преобразуем в отдельный стрим
                .collect(Collectors.toList()); // собираем результат стримов в лист

        // print all
        technologies.forEach(System.out::println);

        // убираем из списка повторы и печатаем их
        System.out.println("------------ Languages ------------------");

        StreamSupport.stream(technologies.spliterator(), false)
                .distinct() // убираем дубликаты
                .forEach(System.out::println);

        // grouping by programmers
        Map<String, Long> techFrequency = programmers.stream()
                .map(Programmer::getTechnologies)// из каждого programmer получили массив, это stream из массивов
                .flatMap(Arrays::stream)// вытряхиваем из массивов значения
                .collect(Collectors.groupingBy(t -> t, Collectors.counting())); // считаем повторы языков (технологий)

        // print
        System.out.println(techFrequency);

        // выделим лучших
        Long max = techFrequency.values().stream()
                .max(Long::compare)
                .orElse(0L);

        // отберем только те языки, которые часто повторяются у программистов
        techFrequency.entrySet().stream()
                .filter(el -> max.equals(el.getValue())) // оставили только тех, у кого кол-во повторов = max
                .forEach(el -> System.out.println(el.getKey())); // их распечатали
    }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
                new Programmer("John", "Python", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")
        );
    }
}
