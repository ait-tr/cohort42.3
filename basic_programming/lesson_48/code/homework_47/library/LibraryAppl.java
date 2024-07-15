package homework_47.library;

import homework_47.library.dao.LibraryImpl;
import homework_47.library.model.Author;
import homework_47.library.model.Book;
import homework_47.library.model.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryAppl {
    public static void main(String[] args) {

        System.out.println("Welcome to our Library!");

        LibraryImpl library = new LibraryImpl(100);
        boolean validInput = true;
        boolean flag = true;
        Menu.printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (flag) {

            try {
                choice = scanner.nextInt();
                validInput = true; // Ввод корректный, выходим из цикла
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Очистка неверного ввода
            }

            switch (choice) {
                case 1: {
                    // Ввод данных о книге
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    // Ввод данных об авторе
                    System.out.print("Enter author name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter author email: ");
                    String lastName = scanner.nextLine();
                    Author author = new Author(name, lastName);

                    // Ввод года издания
                    System.out.print("Enter year of publishing: ");
                    int yearOfPublishing = 0;
                    while (true) {
                        try {
                            yearOfPublishing = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.print("Invalid input. Please enter a valid year: ");
                        }
                    }

                    // Ввод статуса аренды
                    System.out.print("Is the book rented? (true/false): ");
                    boolean isRented = false;
                    while (true) {
                        String isRentedInput = scanner.nextLine().toLowerCase();
                        if (isRentedInput.equals("true") || isRentedInput.equals("false")) {
                            isRented = Boolean.parseBoolean(isRentedInput);
                            break;
                        } else {
                            System.out.print("Invalid input. Please enter 'true' or 'false': ");
                        }
                    }
                    // Создание объекта Book
                    Book book = new Book(isbn, title, author, yearOfPublishing, isRented);
                    library.addBook(book);
                }

                case 7: {
                    flag = false;
                }

            }
        }
    }
}
