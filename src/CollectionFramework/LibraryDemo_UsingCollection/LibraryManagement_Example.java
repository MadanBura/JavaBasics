package CollectionFramework.LibraryDemo_UsingCollection;

public class LibraryManagement_Example {

    public static void main(String[] args) {

        LibraryRegister library = new LibraryRegister();

        // Add books
        library.addBook(new Books("Midnight's Children", "Salman Rushdie", 10));
        library.addBook(new Books("The God of Small Things", "Arundhati Roy", 5));
        library.addBook(new Books("Train to Pakistan", "Khushwant Singh", 8));
        library.addBook(new Books("A Fine Balance", "Rohinton Mistry", 7));
        library.addBook(new Books("The White Tiger", "Aravind Adiga", 6));

        // Printing book titles
        library.printBookTitles();

        // Printing book details
        library.printBooks();

    }

}
