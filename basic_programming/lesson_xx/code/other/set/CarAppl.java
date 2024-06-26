package classwork_41.set;

import classwork_41.car_garage.model.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class CarAppl {
    public static void main(String[] args) {

        Car[] cars;
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 0.2, "Green");

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (int) (o1.getEngine() - o2.getEngine());
            }
        };

        TreeSet<Car> carTreeSet = new TreeSet<>(carComparator);

        for (Car c: cars) {
            carTreeSet.add(c);
        }

        // Вывод всех элементов TreeSet
        System.out.println("Элементы TreeSet: " + carTreeSet);

    }
}
