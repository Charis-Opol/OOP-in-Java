// Create a class Animal with attributes sound and numberOfLegs.
class Animal {
    String sound;
    int numberOfLegs;

    // Constructor to initialize Animal object
    Animal(String sound, int numberofLegs){
        this.sound = sound;
        this.numberOfLegs = numberofLegs;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Creating an Animal object
        Animal dog = new Animal("Barks", 4);

        // Displaying animal details
        System.out.println("This animal is a dog, it " + dog.sound + " and has " + dog.numberOfLegs + " legs!");
    }
}