package homework_43;

//Соберите в структуру Map порядка 20 стран, по несколько страны из разных континентов Земли.
//Подсчитайте количество стран на континентах из полученного списка.

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        Map<String, String> countriesMap = new TreeMap<>();

        countriesMap.put("Germany", "Europe");
        countriesMap.put("France", "Europe");
        countriesMap.put("Spain", "Europe");
        countriesMap.put("Italy", "Europe");
        countriesMap.put("UK", "Europe");
        countriesMap.put("China", "Asia");
        countriesMap.put("Japan", "Asia");
        countriesMap.put("India", "Asia");
        countriesMap.put("Iran", "Asia");
        countriesMap.put("South Korea", "Asia");
        countriesMap.put("Thailand", "Asia");
        countriesMap.put("Egypt", "Africa");
        countriesMap.put("Ghana", "Africa");
        countriesMap.put("South Africa", "Africa");
        countriesMap.put("Kenia", "Africa");
        countriesMap.put("USA", "North America");
        countriesMap.put("Canada", "North America");
        countriesMap.put("Mexico", "North America");
        countriesMap.put("Chili", "South America");
        countriesMap.put("Brasilia", "South America");
        countriesMap.put("Argentina", "South America");

        System.out.println(countriesMap.size());

        // print map
        System.out.println("============= Print Map (keys) - Countries ==================");
        Set<String> keys = countriesMap.keySet();
        for (String str : keys) {
            System.out.println("Country: " + str);
        }

        System.out.println("============= Print Map (values) - continents ==================");
        Collection<String> continents = countriesMap.values();
        // Collections.sort(continents);
        for (String str : continents) {
            System.out.println("Continent: " + str);
        }

        // Calculate frequency - let's do next Map<String, Integer>

        Map<String, Integer> countriesOnContinent = new HashMap<>();

        for (String continent : countriesMap.values()) { // проходим по всем значениям
//            countriesOnContinent.putIfAbsent(continent, 1);

            if(!countriesOnContinent.containsKey(continent)){ // такое слово еще не встречалось
                countriesOnContinent.put(continent, 1); // пишем в мапу континент и 1
            } else {
                countriesOnContinent.put(continent, countriesOnContinent.get(continent) + 1);
            }

        }

        // распечатаем содержимое полученной map
        System.out.println("======= Print Map Continent -> Number of Countries========");
        Set<String> keySet = countriesOnContinent.keySet();
        for (String key : keySet) {
            System.out.println(key + " -> " + countriesOnContinent.get(key));
        }

    }
}
