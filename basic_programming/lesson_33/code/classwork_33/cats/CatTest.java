package classwork_33.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[] cat;

    @BeforeEach
    void setUp() {

        cat = new Cat[4];
        cat[0] =  new Cat(101, "Tishka", "brit", 5, 3.5);
        cat[1] =  new Cat(102, "Genny", "sfinks", 1, 1.2);
        cat[2] =  new Cat(103, "Murzik", "pers", 9, 5.0);
        cat[3] =  new Cat(104, "Motya", "maikun", 2, 8.5);

    }

    @Test
    void testCatSort() {
        System.out.println("===========Test Cat sorting===========");
        printArray(cat);
        Arrays.sort(cat); // производим сортировку в соответствии с тем полем, которое указано в методе compareTo
        System.out.println("--------After sorting by age------------");
        printArray(cat);
    }


    @Test
    void testCatComparator(){
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName()); // сортируем по имени (по алфавиту)
            }
        };
        System.out.println("===========Test Cat sorting by Comparator===========");
        printArray(cat); // печатаем как есть
        System.out.println("--------------------------");
        Arrays.sort(cat, catComparator); // сортируем
        printArray(cat); // печатаем после сортировки

    }

    @Test
    void testCatComparator2(){
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return (int) (o1.getWeight() - o2.getWeight()); // сортируем весу
            }
        };
        System.out.println("===========Test Cat sorting by Comparator===========");
        printArray(cat); // печатаем как есть
        System.out.println("--------------------------");
        Arrays.sort(cat, catComparator); // сортируем
        printArray(cat); // печатаем после сортировки

    }



    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}