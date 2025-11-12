import java.util.ArrayList;

class Animal{
    private String name;
    
    Animal(String name){
        setname(name);
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public String sound(){
        return "All animals have sounds, even a " + this.name;
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    public String sound(){
        return "Woof Woof";
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    public String sound(){
        return "Meew Meew";
    }
}

class Cow extends Animal{
    Cow(String name){
        super(name);
    }

    @Override
    public String sound(){
        return "Mooh Mooh";
    }
}

public class AnimalSoundSimulator {
    public static void main(String[] args){
        ArrayList<Animal> animal_array = new ArrayList<>();

        Dog dog = new Dog("Zeus");
        animal_array.add(dog);
        Cat cat = new Cat("Puss");
        animal_array.add(cat);
        Cow cow = new Cow("Larry");
        animal_array.add(cow);

        for (Animal animal: animal_array) {
            System.out.println(animal.getname() + ": " + animal.sound());
        }
    }
}
