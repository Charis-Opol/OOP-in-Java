import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        System.out.println("Welcome to the Automated Payroll Calculator!");
        Scanner Scanner = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String Name = Scanner.nextLine();
        System.out.println("Enter your TIN number: ");
        String TIN = Scanner.nextLine();
        System.out.println("Enter your gross income: ");
        double gross_income = Scanner.nextDouble();
        System.out.println("Confirm your details!");
        System.out.println("Name: " + Name);
        System.out.println("TIN: " + TIN);
        System.out.println("Gross Income: " + gross_income);
        
        // Calclations for URA tax

        double URA_tax = (gross_income * 0.3);
        System.out.println("Your URA tax is " + URA_tax);

        // Calculations for NSSF
        double employee_NSSF = (0.05 * gross_income);
        System.out.println("Your NSSF savings will be " + employee_NSSF);

        double company_NSSF = (0.1 * gross_income);
        System.out.println("Your company's NSSF contribution will be " + company_NSSF);

        // Payslip
        double NSSF_total = company_NSSF + employee_NSSF;
        double total_deductions = URA_tax + NSSF_total;
        double net_income = gross_income - total_deductions;
        System.out.println("Employee Payslip");
        System.out.println("Name: " + Name);
        System.out.println("TIN: " + TIN);
        System.out.println("Gross income: " + gross_income);
        System.out.println("NSSF contribution: " + NSSF_total);
        System.out.println("URA tax: " + URA_tax);
        System.out.println("Net income: " + net_income);
        Scanner.close();   
    }
}
