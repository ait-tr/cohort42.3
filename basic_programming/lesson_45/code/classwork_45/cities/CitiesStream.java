package classwork_45.cities;

// Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
// преобразуйте их в верхний регистр и выведите в алфавитном порядке.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CitiesStream {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Berlin", "Augsburg", "Munich", "Cologne", "Ulm", "Bremen", "Bonn");
        char filterLetter = 'B';

        List<String> result = filterAndTransformNames(cities, filterLetter);

        result.forEach(System.out::println);
    }

    public static List<String> filterAndTransformNames(List<String> names, char filterLetter) {
        return names.stream()
                .filter(name -> name.toLowerCase().startsWith(String.valueOf(filterLetter).toLowerCase()))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }
}
