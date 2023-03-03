import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private final String publisher;
    private int publishingYear;

    public Book (Author author, String publisher, String bookName, int publishingYear){
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Book " + bookName + ", publisher " + publisher  + ", published in " + publishingYear + " ** " + author;
    }
}
