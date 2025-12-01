import java.util.ArrayList;

class Staff{
    private String staffId;
    private String name;
    private String department;
    private double salary;

    Staff(){
    }

    public void setstaffId(String staffId){
        this.staffId = staffId;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setdepartment(String department){
        this.department = department;
    }

    public void setsalary(double salary){
        this.salary = salary;
    }

    public String getstaffId(){
        return this.staffId;
    }

    public String getname(){
        return this.name;
    }

    public String getdepartment(){
        return this.department;
    }

    public double getsalary(){
        return this.salary;
    }

    public void displayinfo(){
        System.out.println("Staff Id: " + getstaffId());
        System.out.println("Staff name: " + getname());
        System.out.println("Department: " + getdepartment());
        System.out.println("Salary: " + getsalary());
    }
}

class Doctor extends Staff{
    private String specialization;

    public void setSpecializaton(String Specialization){
        this.specialization = Specialization;
    }

    Doctor(){}

    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Specialization: " + this.specialization);
    }   
}

public class Hospital_System {
    public static void main(String[] args){
        ArrayList<Staff> Staff = new ArrayList<>();

        Staff s1 = new Staff();
        s1.setstaffId("S001");
        s1.setname("Mike");
        s1.setdepartment("Pharmacy");
        s1.setsalary(200000);

        Staff s2 = new Staff();
        s2.setstaffId("S002");
        s2.setname("Todd");
        s2.setdepartment("Radiology");
        s2.setsalary(1500000);

        Doctor d1 = new Doctor();
        d1.setstaffId("S003");
        d1.setname("Peter");
        d1.setdepartment("Surgery");
        d1.setsalary(3500000);
        d1.setSpecializaton("Caridac");

        Staff.add(s1);
        Staff.add(s2);
        Staff.add(d1);

        for (Staff s : Staff) {
            s.displayinfo();
        }
    }
}
