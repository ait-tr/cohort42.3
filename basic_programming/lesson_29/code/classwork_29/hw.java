package classwork_29;

import java.util.ArrayList;
import java.util.List;

class BookShelf {
    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    void addBook(String title, String author, int year) {
        this.books.add(new Book(title, author, year));
    }

    class Iterator {
        private int cursor = 0;

        public Book nextBook() {
            // дописать
            // надо взять книжку с полки по индексу
            // перемещаем руку библиотекаря на следующую книгу
            // проверяем не вышла ли рука библиотекаря за пределы полки

            return null;
        }
    }

    // добавить метод toString
}


class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
        bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
        bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
        bookShelf.addBook("Война и мир", "Лев Толстой", 2024);

        // Создать объект внутреннего класса Iterator и вызвать на нем несколько раз метод nextBook
    }
}


// добавить метод toString в класс BookShelf
// написать метод nextBook в классе Iterator
// заполнить книжную полку в методе main класса Main
// создать в методе main класса Main объект итератора и вызвать на нем несколько раз метод nextBook