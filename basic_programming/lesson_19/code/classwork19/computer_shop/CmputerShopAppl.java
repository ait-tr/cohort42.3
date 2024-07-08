package classwork19.computer_shop;


import classwork19.computer_shop.model.Computer;
import classwork19.computer_shop.model.Laptop;
import classwork19.computer_shop.model.SmartPhone;

public class CmputerShopAppl {
    public static void main(String[] args) {


        Computer computer = new Computer("Core i7", 8, 512, "Asus", 1200);
        Laptop laptop = new Laptop("M2", 16, 1024, "Apple", 3000, 14.1, 2.6, 10);
        System.out.println(computer);
        System.out.println(laptop);

        Computer[] computers = new Computer[7];
        computers[0] = new Computer("Core i7", 8, 512, "Asus", 1200);
        computers[1] = new Computer("Core i5", 4, 512, "Acer", 800);
        computers[2] = new Computer("Core i9", 16, 512, "HP", 1600);
        computers[3] = new Laptop("M2", 16, 1024, "Apple", 3000, 14.1, 2.6, 10);
        computers[4] = new Laptop("M1", 8, 512, "Apple", 2400, 12.1, 1.6, 12);
        computers[5] = new Laptop("M3", 32, 2048, "Apple MacBook Pro", 5200, 16, 3.6, 16);
        computers[6] = new SmartPhone("M3", 32, 2048, "Apple MacBook Pro", 5200, 16, 0.6, 16, 15, 100l);

        int sumSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            sumSsd = sumSsd + computers[i].getSsd();
        }
        System.out.println("Toatal ssd: " + sumSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();
        }
        System.out.println("Total amount of money: " + totalPrice);

        System.out.println("====================================");
        System.out.println(computers[0].getBrand());

        System.out.println("/////////////////////////////////////");
        System.out.println(computers[6]);

        // необходимо подсчитать общий вес лаптопов,
        // а на самом деле нужно выполнить операцию с полями объектов их дочерних классов

        System.out.println("Weight of laptops");
        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            Computer myComputer = computers[i];
            Laptop myLaptop = (Laptop) myComputer;
            totalWeight = totalWeight + myLaptop.getWeight();
        }

//        for (int i = 0; i < computers.length; i++) {
//            if(computers[i] instanceof Laptop){
//                Laptop mylaptop = (Laptop) computers[i];
//                totalWeight += mylaptop.getWeight();
//            }
//        }
        System.out.println("Total weight = " + totalWeight);

    }
}
