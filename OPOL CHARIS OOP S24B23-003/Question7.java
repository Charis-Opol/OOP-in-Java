// Creating class Employee with attributes name and salary.
class Employee {
    String name;
    double salary;

    // Constructor to initialize Employee object
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent){
        this.salary = this.salary + (this.salary * percent / 100);
        System.out.println(this.name + " is now receiving " + this.salary + " UGX");
    }
}

public class Question7 {
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee employee1 = new Employee("Chris", 2000000);
        Employee employee2 = new Employee("Peter", 3000000);

        // Raising salaries of the employees
        employee1.raiseSalary(50);
        employee2.raiseSalary(30);
    }
}
