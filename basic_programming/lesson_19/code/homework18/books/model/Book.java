package homework18.books.model;

public class Book {
    private String title;
    private String author;
    private int yaerOfPublishing;
    private long isbn;
    private int pageQuantity;

    public Book(String title, String author, int yaerOfPublishing, long isbn, int pageQuantity) {
        this.title = title;
        this.author = author;
        this.yaerOfPublishing = yaerOfPublishing;
        this.isbn = isbn;
        this.pageQuantity = pageQuantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYaerOfPublishing() {
        return yaerOfPublishing;
    }

    public void setYaerOfPublishing(int yaerOfPublishing) {
        this.yaerOfPublishing = yaerOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yaerOfPublishing=" + yaerOfPublishing +
                ", isbn=" + isbn +
                ", pageQuantity=" + pageQuantity +
                '}';
    }
}
