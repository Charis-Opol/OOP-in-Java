import java.util.Scanner;

public class TestArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String names[] = new String[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Enter the name: ");
            names[i] = scan.nextLine();
        }

        for (String x : names){
            System.out.println(x);
        }
        scan.close();
    }
    
}
