package classwork_47.library.model;

public enum Menu {
    ADD_BOOK(1, "Add book"),
    FIND_BOOK_BY_AUTHOR(2, "Find book by author"),
    LIST_BOOKS(3, "List all books"),
    RENT_BOOK(4, "Rent a book"),
    GET_BACK_BOOK(5, "Get back book"),
    LOAD(6, "Start day"),
    EXIT(7, "End day")
    ;

    Menu(int item, String action) {
        this.item = item;
        this.action = action;
    }

    int item;
    String action;

}
