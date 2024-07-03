package сlasswork_44.stream_intro;

import java.util.ArrayList;
import java.util.List;

public class StreamAppl {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(11, -9, 122, -17, 32, 458, -5, 6, 7 ));

        numbers.stream()
                .filter(n -> n>0) // filter
                .sorted((n1, n2) -> - Integer.compare(n1, n2))
                .forEach(System.out::println);// print


        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
