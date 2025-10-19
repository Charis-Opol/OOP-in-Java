// Create a class Car with attributes brand and speed. 
class Car{
    String brand;
    int speed;

    // Constructor to initialize Car object
    Car(){
        this.brand = "Unkown";
        this.speed = 0;
    }

    // Overloaded constructor to initialize Car object with specific brand and speed
    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display car details
    public void displayCar(){
        System.out.println("Car brand: " + this.brand + "\nCar speed: " + this.speed + " mph.");       
    }
}

public class Question5 {
    public static void main(String[] args) {
    // Creating two Car objects
    Car car1 = new Car();
    Car car2 = new Car("Ferrari", 230);

    // Displaying car details
    car1.displayCar();
    car2.displayCar();
    }
}
