class Vehile {
    private String regnum;
    private String model;
    private double speed;

    public String getregnum(){
        return this.regnum;
    }

    public String getmodel(){
        return this.model;
    }

    public double getspeed(){
        return this.speed;
    }
    
    public void setregnum(String newregnum){
        this.regnum = newregnum;
    }

    public void setmodel(String newmodel){
        this.regnum = newmodel;
    }

    public void setspeed(double newspeed){
        this.regnum = newspeed;
    }

    public void displayInfo(){
        System.out.print("The Registration number of this car is " + this.regnum + " the model is " + this.model + " and it's speed is " + this.speed);
    }

}

class car extends Vehicle{

}


public class Transport_company {
    
}

public class Vehicle {
    // 1. Private Attributes
    private String regNumber;
    private String model;
    private int speed;

    // Constructor
    public Vehicle(String regNumber, String model, int speed) {
        this.regNumber = regNumber;
        this.model = model;
        this.speed = speed;
    }

    // 2. Getters
    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    // 2. Setters
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Error: Speed cannot be negative.");
        }
    }

    // 3. displayInfo() Method
    public void displayInfo() {
        System.out.println("--- 🚗 Vehicle Details ---");
        System.out.println("  Registration No.: " + this.regNumber);
        System.out.println("  Model: " + this.model);
        System.out.println("  Current Speed: " + this.speed + " km/h");
    }
}

public class Truck extends Vehicle {
    // 4. New Attribute
    private double loadCapacity;

    // Constructor
    public Truck(String regNumber, String model, int speed, double loadCapacity) {
        // Call to the parent class constructor
        super(regNumber, model, speed);
        this.loadCapacity = loadCapacity;
    }

    // Getter for loadCapacity
    public double getLoadCapacity() {
        return loadCapacity;
    }

    // Setter for loadCapacity
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            System.out.println("Error: Load capacity cannot be negative.");
        }
    }

    // 4. Overridden displayInfo() Method
    @Override // Optional but recommended annotation
    public void displayInfo() {
        System.out.println("--- 🚛 Truck Details ---");
        // Reuse parent class methods or directly access inherited fields (via getters)
        System.out.println("  Registration No.: " + this.getRegNumber());
        System.out.println("  Model: " + this.getModel());
        System.out.println("  Current Speed: " + this.getSpeed() + " km/h");
        System.out.println("  Max Load Capacity: " + this.loadCapacity + " tons");
    }
}
