// Create a class Person with attributes name and age.
class Person{
    String name;
    int age;

    // Constructor to initialize Person object
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method to greet another Person object
    public void greet(Person anotherPerson){
        System.out.println("Hello " + anotherPerson.name + " , I'm " + this.name + "!");
    }
}

public class Question8 {
    public static void main(String[] args) {
    // Creating two Person objects
    Person person1 = new Person("Peter", 24);
    Person person2 = new Person("Chris", 25);

    // Making the persons greet each other
    person1.greet(person2);
    person2.greet(person1);    
    }

}
