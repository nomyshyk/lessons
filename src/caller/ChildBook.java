package caller;

import library.Book;

public class ChildBook extends Book {
    public static void main(String[] args) {
        ChildBook childBook = new ChildBook();
        childBook.needToRepair = false;
    }
}
