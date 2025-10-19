// Create a class Rectangle with attributes length and width.
class Rectangle {
    double length;
    double width;

    // Constructor to initialize Rectangle object
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public double calculateArea(double lenght, double width){
        return (lenght * width);
    }
}

public class Question3 {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(10, 5);
        // Calculating and displaying area of the rectangle
        System.out.println("Area = " + rectangle.calculateArea(10, 5));
    }
}
