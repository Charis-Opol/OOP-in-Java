// Create a class Student with attributes name and age.
class Student {
    String name;
    int age;

    // Constructor to initialize Student object
    Student(){
        this.name = "Unknown";
        this.age = 0;
    }

    // Overloaded constructor to initialize Student object with specific name and age
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayInfo(){
        System.out.println("Student name: " + this.name + "\nStudent Age: " + this.age);
}
}

public class Question2 {
   public static void main(String[] args) {
         // Creating two Student objects
       Student student1 = new Student();
       Student student2 = new Student("Charis", 20);

         // Displaying student details
       student1.displayInfo();
       student2.displayInfo();
   } 
}
