import java.util.*;

public class name2 {
        public static void main(String[] args) {
        System.out.println("Enter your first name: ");
        Scanner Scanner = new Scanner(System.in);
        String firstName = Scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = Scanner.nextLine();
        System.out.println("Enter your registration number: ");
        String regnum = Scanner.nextLine();

        System.out.println("Student Name: " + firstName + " " + surname);
        System.out.println("Student registration number: " + regnum);
        Scanner.close();
    }
}
