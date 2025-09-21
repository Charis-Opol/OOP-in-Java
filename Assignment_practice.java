import java.util.Scanner;

public class Assignment_practice{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = scan.nextLine();
		System.out.println("Enter your registration number:");
		String regno = scan.nextLine();	
		System.out.print("Name: " + name + "\n" + "Reg Number: " + regno);
		scan.close();	
	}
}