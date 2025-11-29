import java.util.ArrayList;

class Student{
    String name;
    int age;
    String student_Id;

    ArrayList<String> enrolled_courses = new ArrayList<>();


    Student(String name, int age, String student_Id){
        this.name = name;
        this.age = age;
        this.student_Id = student_Id;
    }

    public void enroll(String course_name){
        enrolled_courses.add(course_name);
        System.out.println("You have been enrolled in : " + course_name);
    }

    public void drop(String course_name){
        boolean exists = enrolled_courses.contains(course_name);
        if (exists == true){
            System.out.println("You have dropped : " + course_name);
            int index = enrolled_courses.indexOf(course_name);
            enrolled_courses.remove(index);
        } else{
            System.out.println("You are not enrolled in this course!");
        }
    }

    public void display_studentInfo(){
        System.out.println("Student name: " + this.name + "\nStudent age: " + this.age + "\nStudent ID: " + this.student_Id);
        System.out.println("Enrolled Courses");

        for (String c1: enrolled_courses){
            System.out.println(c1);
        }
    }
}

class Course{
    String course_name;
    String course_code;

    Course(String course_name, String course_code){
        this.course_name = course_name;
        this.course_code = course_code;
    }
}

public class Question{
    public static void main(String[] args){
        Student std1 = new Student("Charis Opol", 20, "S003");
        Student std2 = new Student("Cole Migisha", 21, "S004");

        Course C01 = new Course("OOP", "CS002");
        Course C02 = new Course("DAA", "CS102");

        std1.enroll("OOP");
        std1.enroll("DAA");
        std1.display_studentInfo();
        std2.enroll("OOP");
        std2.enroll("DAA");
        std2.display_studentInfo();
        std2.drop("DAA");
        std2.display_studentInfo();
    }
}