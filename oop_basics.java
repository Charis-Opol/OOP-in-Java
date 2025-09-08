public class oop_basics {
    static class student {
        String Name;
        int Age;
        String College;
        String Major;
        String Year;
        double GPA;
        void study(){
            System.out.println("You should go to class");
        }
    }

    static class car {
        String Make;
        String Model;
        int Year;
        String Color;
        double Mileage;
        void start(){
            System.out.println("Vrooommm!");
        }
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.Name = "John Doe";
        student1.Age = 20;
        student1.College = "Makerere University";
        student1.Major = "Computer Science";
        student1.Year = "Sophomore";
        student1.GPA = 3.5;
        System.out.println("Name: " + student1.Name);
        System.out.println("Age: " + student1.Age);
        System.out.println("College: " + student1.College);
        System.out.println("Major: " + student1.Major);
        System.out.println("Year: " + student1.Year);
        System.out.println("GPA: " + student1.GPA);
        student1.study();


        car car1 = new car();
        car1.Make = "Toyota";
        car1.Model = "Corolla";
        car1.Year = 2020;
        car1.Color = "Red";
        car1.Mileage = 15000.5;
        System.out.println("Make: " + car1.Make);
        System.out.println("Model: " + car1.Model);
        System.out.println("Year: " + car1.Year);
        System.out.println("Color: " + car1.Color);
        System.out.println("Mileage: " + car1.Mileage);
        car1.start();
    }
}
