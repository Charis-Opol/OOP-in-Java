class Car {
    String brand;
    String colour;

    Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }

    void drive(){
        System.out.println(" Car is " + brand + " and colour " + colour);
    }
}

public class Cars{
    public static void main(String[] args) {
        Car mycar = new Car("Ferrari", "Blue");
        mycar.drive();
    }
}
