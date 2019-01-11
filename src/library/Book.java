package library;

public class Book {
    private String author;
    private String title;
    private int numOfPages;
    String fromWho;
    private String codeId;
    protected boolean needToRepair;

    public Book(String author, String title, String shifr){
        this.author = author;
        this.title = title;
        this.codeId = shifr;
        //this.codeId = String.valueOf(this.hashCode());
    }
    public Book(){}

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private int getNumOfPages() {
        return numOfPages;
    }

    private void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    private String getCodeId() {
        return codeId;
    }

    private void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public void correctChangeOfBook(String author, String title,
                                    int numOfPages, String shifr){
        this.author = author;
        this.title = title;
        this.codeId = shifr;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "library.Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", codeId='" + codeId + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                '}';
    }
}
