class Vehicle {
    // Private attributes
    private String regnum;
    private String model;
    private double speed;

    // Constructor
    Vehicle(String regnum, String model, double speed){
        setregnum(regnum);
        setmodel(model);
        setspeed(speed);
    }

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
        this.model = newmodel;
    }

    public void setspeed(double newspeed){
        this.speed = newspeed;
    }

    public void displayInfo(){
        System.out.print("The Registration number of this car is " + this.regnum + " the model is " + this.model + " and it's speed is " + this.speed);
    }

}

class Truck extends Vehicle{
    double loadCapacity;

    Truck(String regnum, String model, double speed, double loadCapacity){
        super(regnum, model, speed);
        this.loadCapacity = loadCapacity;
    }

    // Overriding function to display car details
    @Override
    public void displayInfo(){
         System.out.print("The Registration number of this car is " + getregnum() + " the model is " + getmodel() + " , it's speed is " + getspeed() + "km/hr and its load capacity is " + this.loadCapacity + " tonnes");
    }

}


public class Transport_company {
    public static void main(String[] agrs){
        // Creating the objects of both classes
        Vehicle sedan = new Vehicle("UAG 948F", "Honda Accord", 110);
        Truck semitruck = new Truck("UBA 657G", "Fuso", 85, 40.5);

        sedan.displayInfo();
        System.out.println("\n---------------------------------------------");
        semitruck.displayInfo();
    }
}

