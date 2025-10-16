// A simple class representing a Dog
class Dog {
    // Constuctor is the same name as the class name, no return type
    Dog() {
        System.out.println("A dog has been created!");
    }
}

public class PresentationDemo {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog(); // The output will be: A dog has been created!
    }
}