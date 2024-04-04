package homework18.books;

/*В классе BookAppl в методе main создайте массив типа Book и в нем 4 книги и 3 словаря. Выведите информацию о них
в консоль.
        Реализуйте методы, которые выдают:
- общее количество страниц во всех книгах;
- среднее значение количества слов в словарях;
- средний возраст всех изданий.*/

import homework18.books.model.Book;
import homework18.books.model.Dictionary;

public class BooksAppl {
    public static void main(String[] args) {

        Book[] books = new Book[7];

        books[0] = new Book("E. Onegin", "Pushkin", 1980, 1000L, 150);
        books[1] = new Book("Отцы и дети", "Тургенев", 1985, 1001L, 350);
        books[2] = new Book("Война и мир", "Толстой", 1990, 1002L, 5000);
        books[3] = new Book("Идиот", "Достоевский", 2000, 1004L, 3000);
        books[4] = new Dictionary("English", "Bonk", 2000, 1005L, 2000, "language", 3000);
        books[5] = new Dictionary("German", "Frank", 2005, 1006L, 2500, "language", 2500);
        books[6] = new Dictionary("French", "Balsak", 2010, 1007L, 3500, "language", 3500);

        System.out.println("============Books and dictionaries=====");
        printBooks(books);

        System.out.println("==============Total pages===========");
        int totalPages = getTotalPages(books);
        System.out.println("Total pages = " + totalPages);

        System.out.println("==============Total words in dictionaries ===========");
        int totalWords = getTotalWords(books);
        System.out.println("Words in dictionaries = " + totalWords);

        System.out.println("=============Average years of publishing==============");
        double avgEge = getAvgEge(books);
        System.out.println("Average years of publishing = " + avgEge);

    }

    private static double getAvgEge(Book[] books) {
        double avdEge = 0;
        for (int i = 0; i < books.length; i++) {
            avdEge += books[i].getYaerOfPublishing();
        }
        return  avdEge / books.length;
    }

    private static int getTotalWords(Book[] books) {
        int res = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] instanceof Dictionary){
                Dictionary dictionary = (Dictionary) books[i];
                res += dictionary.getWordQuantity();
            }
        }
        return res;
    }


    private static int getTotalPages(Book[] books) {
        int res = 0;
        for (int i = 0; i < books.length; i++) {
            res += books[i].getPageQuantity();
        }
        return res;
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }


}
