package classwork.computer17;

import classwork.computer17.model.Computer;
import classwork.computer17.model.Laptop;
import classwork.computer17.model.Phone;

public class ComputerCompareAppl {
    public static void main(String[] args) {
        Computer[] comp = new Computer[3];
        comp[0] = new Computer("i5", 12, 512, "HP", 1000);
        comp[1] = new Laptop("i7", 16, 512, "Samsung", 800, 15, 2.2, 8);
        comp[2] = new Phone("Snapdragon 8 Gen 2", 64, 2042, "Samsung", 1200, 11, 0.3, 20, "Android 14", true);

        printArray(comp);

        Computer computer = new Computer("i5", 12, 512, "HP", 1000);
        System.out.println(computer);
        System.out.println(comp[0]);
        boolean check = computer == comp[0];
        System.out.println(check);
        System.out.println("---------------------------");
        System.out.println(computer.equals(comp[0]));

    }

    public static void printArray(Object[] comp) {
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }
}
