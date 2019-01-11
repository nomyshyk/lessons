package library;

public class ApiUser {
    public static void main(String[] args) {
        Book book =
                new Book("Л.Н Толстой", "Война и мир", "1");
        book.fromWho = "От добрых людей";
        book.needToRepair = true;
    }
}
