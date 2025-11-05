class Employee {
    private String empId;
    private String name;
    private int salary;

    Employee(String empId, String name, int salary){
        setempId(empId);
        setname(name);
        setsalary(salary);
    }

    public String getempId(){
        return this.empId;
    }

    public String getname(){
        return this.name;
    }

    public int getsalary(){
        return this.salary;
    }

    public void setempId(String empId){
        this.empId = empId;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setsalary(int salary){
        this.salary = salary;
    }

    public double calculatePay(){
        return this.salary;
    }
}

class ContractEmployee extends Employee{
    int contractDuration;

    ContractEmployee(String empId, String name, int salary, int contractDuration){
        super(empId, name, salary);
        this.contractDuration = contractDuration;
    }

    @Override
    public double calculatePay(){
        return this.getsalary() * 0.1;
    }

}

public class EmployeePayrollSystem {
    public static void main(String[] args){
        Employee emp = new Employee("E001", "Charis Opol", 5000000);
        ContractEmployee cEmp = new ContractEmployee("E002", "Angel Pary", 3000000, 6);

        System.out.println("Employee ID: " + emp.getempId() + " Name: " + emp.getname() + " Salary: " + emp.getsalary()+ "\n");
        System.out.println("Employee ID: " + cEmp.getempId() + " Name: " + cEmp.getname() + " Salary: " + cEmp.getsalary() + " Contract Duration: " + cEmp.contractDuration);
    }
}
