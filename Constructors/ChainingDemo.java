class Person {
    String name;
    int age;
    String country;

    // 1. Calls the second constructor with default values
    Person() {
        this("Unknown", 0, "Unknown"); // chaining
    }

    // 2. Calls the third constructor
    Person(String name, int age) {
        this(name, age, "Uganda"); // chaining again
    }

    // 3. Main constructor
    Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
}

public class ChainingDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John", 25);
        Person p3 = new Person("Mary", 30, "Kenya");

        System.out.println(p1.name + ", " + p1.age + ", " + p1.country);
        System.out.println(p2.name + ", " + p2.age + ", " + p2.country);
        System.out.println(p3.name + ", " + p3.age + ", " + p3.country);
    }
}

