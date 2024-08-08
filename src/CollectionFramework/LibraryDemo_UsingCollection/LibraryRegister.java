package CollectionFramework.LibraryDemo_UsingCollection;


import java.util.*;

public class LibraryRegister {

    //For Set
    private HashSet<Books> bookTitlesHashSet = new HashSet<Books>();
    private LinkedHashSet<Books> bookTitlesLinkedHashSet = new LinkedHashSet<Books>();
    private TreeSet<Books> bookTitlesTreeSet = new TreeSet<Books>();

    //For Map
    private HashMap<Integer, Books> booksHashMap = new HashMap<>();
    private LinkedHashMap<Integer, Books> booksLinkedHashMap = new LinkedHashMap<>();



    //Add Book using different types of set and maps
    // to demonstrate which follow insertion order which one not
    public void addBook(Books book) {
        bookTitlesHashSet.add(book);
        bookTitlesLinkedHashSet.add(book);
        bookTitlesTreeSet.add(book);
        booksHashMap.put(book.getBookId(), book);
        booksLinkedHashMap.put(book.getBookId(), book);
    }


    // Print book titles
    public void printBookTitles() {
        System.out.println("HashSet (unordered):");
        for (Books book : bookTitlesHashSet) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nLinkedHashSet (insertion order):");
        for (Books book : bookTitlesLinkedHashSet) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nTreeSet (sorted):");
        for (Books book : bookTitlesTreeSet) {
            System.out.println(book.getTitle());
        }
    }

    // Print all books
    public void printBooks() {
        System.out.println("\nHashMap (unordered):");
        for (Books book : booksHashMap.values()) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nLinkedHashMap (insertion order):");
        for (Books book : booksLinkedHashMap.values()) {
            System.out.println(book.getTitle());
        }
    }



}
