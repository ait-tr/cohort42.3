package classwork.computer17;

//Задание1.
//        Создать "семейство" классов Computer, Laptop, Phone.
//        Реализовать метод, который посчитает общий объем RAM в имеющихся на складе устройствах.
//        Реализовать метод, который посчитает общий вес имеющихся на складе устройств.

import classwork.computer17.model.Computer;
import classwork.computer17.model.Laptop;
import classwork.computer17.model.Phone;

public class ComputerAppl {
    public static void main(String[] args) {

        double d = 3.0;
        int d1 = (int) d;
        double d2 = (double) d1;

        Computer[] comp = new Computer[3];
        comp[0] = new Computer("i5", 12, 512, "HP", 1000);
        comp[1] = new Laptop("i7", 16, 512, "Samsung", 800, 15, 2.2, 8);
        comp[2] = new Phone("Snapdragon 8 Gen 2", 64, 2042, "Samsung", 1200, 11, 0.3, 20, "Android 14", true);

        printArray(comp);

        int totalRAM = getToatalRAM(comp);
        System.out.println("Total RAM: " + totalRAM);

        Laptop laptop = (Laptop) comp[1]; // down casting приведение к нужному типу
        System.out.println(laptop.getWeight());

//        Computer1 computer1 = (Laptop1) comp[0];
//        System.out.println(computer1);

        double totalWeight = getTotalWeight(comp);
        System.out.println("Total weight = " + totalWeight);


    } // end of main

    private static double getTotalWeight(Computer[] comp) {
        double res = 0;
        for (int i = 0; i < comp.length; i++) {
            if(comp[i] instanceof Laptop){
                Laptop laptop1 = (Laptop)comp[i];
                res += ((Laptop) comp[i]).getWeight();
            }

        }
        return res;
    }


    private static int getToatalRAM(Computer[] comp) {
        int res = 0;
        for (int i = 0; i < comp.length; i++) {
            res += comp[i].getRam();
        }
        return res;
    }

    public static void printArray(Computer[] comp){
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }


}// end of class
