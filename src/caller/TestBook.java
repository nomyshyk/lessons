package caller;


import library.Book;

public class TestBook {
    public static void main(String[] args) {
        Book book =
                new Book("Л.Н Толстой", "Война и мир", "1");

        book.correctChangeOfBook
                ("Платонов", "Котлован", 200, "2");

        System.out.println(book);


    }
}
