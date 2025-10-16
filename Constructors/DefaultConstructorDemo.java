class Item {
    String name;
    // If you don't use a constructor, Java provides a default constructor
    // Default constructor has no parameters and does nothing
    // Therefore the output will be null
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        // Create a book instance using the class Item
        Item book = new Item();

        System.out.println("Book name: " + book.name); // Output: Book name: null
    }
}
