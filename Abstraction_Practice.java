// Abstract class
abstract class Animal {
    // Abstract method (The methpd doesn't have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

// Subclass (inherit from the animal)
class Pig extends Animal{
    public void animalSound(){
        // The body of animal sound in pig
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraction_Practice {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
