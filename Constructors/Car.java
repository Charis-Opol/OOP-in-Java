public class Car {
    String model;
    int year;
    String color;

    // 1. Constructor that calls the main constructor
    public Car(String model, int year) {
        this(model, year, "White"); // default color
    }

    // 2. Main constructor that sets all fields
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("Car object fully initialized.");
    }

    // Function to display car details
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Sedan", 2023, "Red");
        Car c2 = new Car("SUV", 2024);

        c1.displayInfo();  // Output: Model: Sedan, Year: 2023, Color: Red
        c2.displayInfo();  // Output: Model: SUV, Year: 2024, Color: White
    }
}
