package homework_40;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyAppl {
    public static void main(String[] args) {
        Set<String> currencySet = new HashSet<>();
        String newCurrency;

        System.out.println("Welcome to the Bank Currency Manager!");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input next currency: ");
            newCurrency = scanner.nextLine();
            if (currencySet.add(newCurrency)) {
                System.out.println("Currency added");
            } else {
                System.out.println("Currency already exists");
            }
            System.out.println("Continue? y/n ");
            String choice = scanner.nextLine();
            if (choice.equals("n")) {
                System.out.println("Good bye");
                break;
            }

        } while (true);
        System.out.println("Currencies: ");
        System.out.println(currencySet); // they are hashset
    }
}
