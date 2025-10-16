class Product {
    String name;
    double price;

    // Default constructor
    Product() {
        this.name = "Unnamed Product";
        this.price = 0.0;
    }

    // Parameterized constructor - only name
    Product(String name) {
        this.name = name;
        this.price = 0.0;
    }

    // Parameterized constructor - name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Smartphone", 1200000.50);

        System.out.println("Product 1: " + p1.name + ", Price: " + p1.price);
        System.out.println("Product 2: " + p2.name + ", Price: " + p2.price);
        System.out.println("Product 3: " + p3.name + ", Price: " + p3.price);
    }
    
}
