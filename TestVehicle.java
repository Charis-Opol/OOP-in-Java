import java.io.*;

interface Vehicle {
    // All the public methods that the implementing class must override
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    // Speed up
    @Override
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    // Apply brakes
    @Override
    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + this.speed + " Gear: " + this.gear);
    }
} 

class Bike implements Vehicle {
    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    // Speed up
    @Override
    public void speedUp(int increment){
        this.speed = this.speed + increment;
    }

    // Apply brakes
    @Override
    public void applyBrakes(int decrement){
        this.speed = this.speed - decrement;
    }

    // Display bike's state
    public void printStates(){
        System.out.println("Speed: " + this.speed + " Gear: " + this.gear);
    }
}

class Car implements Vehicle {
    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }  

    // Speed up
    @Override
    public void speedUp(int increment){
        this.speed = this.speed + increment;
    }   

    // Apply brakes
    @Override
    public void applyBrakes(int decrement){
        this.speed = this.speed - decrement;
    }

    // Display car's state
    public void printStates(){
        System.out.println("Speed: " + this.speed + " Gear: " + this.gear);
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(2);
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();

        Car car = new Car();

        car.changeGear(3);
        car.speedUp(5);
        car.applyBrakes(2);

        System.out.println("Car present state :");
        car.printStates();
    }
}
