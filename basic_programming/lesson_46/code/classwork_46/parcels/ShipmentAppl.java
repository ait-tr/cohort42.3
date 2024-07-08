package classwork_46.parcels;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShipmentAppl {

    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;

    public static void main(String[] args) {

        Random random = new Random();

        // задумываем количество Containers
        int numContainers = random.nextInt(MIN_CONTAINERS,MAX_CONTAINERS + 1);

        // создаем список контейнеров
        List<Container> containers = Stream.generate(()-> new Container("Alex & Co", random.nextInt(MIN_BOXES, MAX_BOXES + 1)))
                .limit(numContainers)
                .toList();

        // делаем номера для этих контейнеров
        List<Integer> numberOfContainer = IntStream.range(1, numContainers + 1)
                .boxed()
                .toList();

        // print номера контейнеров
        System.out.println("------------- number of containers -----------------");
        numberOfContainer.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        // print containers
//        IntStream.range(0, numContainers).forEach(index -> {
//            Container container = containers.get(index);
//            System.out.println("Container " + numberOfContainer.get(index) + " : " + container.getLabel());
//            container.getBoxes().forEach(box -> {
//                System.out.println("Box with " + box.parcels.size() + " parcels");
//                box.parcels.forEach(parcel ->
//                        System.out.println("Parcel with weight: " + parcel.getWeight() + " kg"));
//            });
//            System.out.println();
//        });

        // считаем кол-во посылок
        int totalParcel = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .sum();
        System.out.println("Total parcels in all boxes and containers: " + totalParcel);

        // считаем общий вес
        double totalWeight = containers.stream()
                .flatMap(container-> container.getBoxes().stream())
                .flatMap(box->box.getParcels().stream())
                .mapToDouble(parcel->parcel.getWeight())
                .sum();
        System.out.println("Total weight of all parcels: " + totalWeight);

        // ищем контейнер с максимальным количеством посылок
        int maxParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .max()
                .orElse(0);
        System.out.println("Max parcels in container: " + maxParcels + " parcels");

        System.out.println("----------------------------------------");
        System.out.println("Containers with maximum parcels: ");
        containers.stream()
                .filter(c-> c.getTotalParcels() == maxParcels)
                .forEach(System.out::println);
    }
}
