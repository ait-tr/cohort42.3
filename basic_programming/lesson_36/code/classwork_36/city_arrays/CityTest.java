package classwork_36.city_arrays;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

//     - найти индекс элемента в массиве Comparable объектов
//    - найти индекс элемента в массиве объектов, отсортированных с помощью Comparator
//    - скопировать часть массива в новый массив
//    - создать копию массива, увеличить его длину, вставить содержимое внутрь
//    - увеличить размер массива, отсортировать новый массив, найти в нем индекс, куда встанет добавляемый элемент
//    - вставить новый объект в массив, соблюдая порядок сортировки

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Berlin", 800_000, "USA", 7.0);
        cities[1] = new City("Berlin", 670_000, "USA", 7.5);
        cities[2] = new City("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City("Dallas", 1_300_000, "USA", 3.0);
    }



}