// Create a class Circle with an attribute radius.
class Circle {
    int radius;

    // Constructor to initialize Circle object
    Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double getArea(int radius){
        return (radius * radius * 22 / 7);
    }

    
}

public class Question4 {
    public static void main(String[] args) {
        // Creating two Circle objects
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(30);

        // Calculating and displaying area of the circles
        System.out.println("Area of Circle 1 with radius " + circle1.radius + " is " + circle1.getArea(10));
        System.out.println("Area of Circle 2 with radius " + circle2.radius + " is " + circle2.getArea(30));

    }
    
}
