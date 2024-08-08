package CollectionFramework.LibraryDemo_UsingCollection;

import org.jetbrains.annotations.NotNull;

public class Books implements Comparable<Books> {

    private static int idCounter=101;
    private int bookId;
    private String title;
    private String author;
    private int quantity;
    private boolean isAvailable;

    public Books(String title, String author, int quantity) {
        this.bookId = ++idCounter;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String displayBooks() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public int compareTo(Books other) {
        return this.title.compareTo(other.title); // Compare by title
    }
}
