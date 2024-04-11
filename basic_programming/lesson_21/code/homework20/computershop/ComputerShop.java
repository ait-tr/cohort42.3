package homework20.computershop;

import homework20.computershop.controller.Stock;
import homework20.computershop.model.Computer;

public class ComputerShop {
    public static void main(String[] args) {

        Stock stock = new Stock(29);

        stock.addComputer(new Computer("HP", "AMD Ryzen", 8, 100_000_000_000_000L));
        stock.addComputer(
                new Computer("Hyrican", "Ryzen5", 32, 200_000_000_000_000L));
        stock.addComputer(new Computer("Samsung", "i3", 8, 300_000_000_000_000L));
        System.out.println(stock.getSize());
        stock.printComputer();

        stock.addComputer(new Computer("Apple", "M1Chip", 8, 400_000_000_000_000L));
        System.out.println(stock.getSize());
        stock.printComputer();

        stock.removeComputer(100_000_000_000_000L);
        System.out.println(stock.getSize());
        stock.printComputer();
    }
}
