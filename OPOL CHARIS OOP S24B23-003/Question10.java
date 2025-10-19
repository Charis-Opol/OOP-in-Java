// Creating class Laptop with attributes brand, ramSize, and price.
class Laptop{
    String brand;
    double ramSize;
    int price;

    // Constructor to initialize Laptop object
    Laptop(String brand, double ramSize, int price){
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Method to compare price with another Laptop object
    public void comparePrice(Laptop otherLaptop){
        if(this.price < otherLaptop.price){
            System.out.println(this.brand + " is cheaper than " + otherLaptop.brand);
        } else if(this.price > otherLaptop.price){
            System.out.println(this.brand + " is more expensive than " + otherLaptop.brand);
        } else {
            System.out.println(this.brand + " and " + otherLaptop.brand + " have the same price.");
        }
    }
}

public class Question10 {
    public static void main(String[] args) {
        // Creating two Laptop objects
        Laptop laptop1 = new Laptop("Dell", 16, 800);
        Laptop laptop2 = new Laptop("HP", 8, 600);

        // Comparing prices of the two laptops
        laptop1.comparePrice(laptop2);
        laptop2.comparePrice(laptop1);
    }
}
