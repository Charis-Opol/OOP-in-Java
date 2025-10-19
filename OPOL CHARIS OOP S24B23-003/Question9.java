import java.util.ArrayList;

// Creating class Book with attributes title, author, and price.
class Book{
    String title;
    String author;
    int price;

    // Constructor to initialize Book object
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    public void displayBookInfo(){
        System.out.println("Book title: " + this.title + "\nBook Author: " + this.author + "\nBook Price: " + this.price);
    }
}

public class Question9 {
    public static void main(String[] args) {
        // Creating an ArrayList to store Book objects
        ArrayList<Book> Bookarray = new ArrayList<>();

        // Creating Book objects and adding them to the ArrayList
        Book book1 = new Book ("Good to Great", "Jim Collins", 100000);
        Bookarray.add(book1);
        Book book2 = new Book ("Leaders Eat Last", "Simon Sinek", 80000);
        Bookarray.add(book2);
        Book book3 = new Book ("Philsophy", "Collin Brown", 50000);
        Bookarray.add(book3);
        
        // Displaying information of each book in the ArrayList
        for (Book book: Bookarray){
            System.out.println("Book Information\n");
            book.displayBookInfo();
        }
    }
}
