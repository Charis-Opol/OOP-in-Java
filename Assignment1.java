import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Mangoes\n2. Pinapples\n3. Apples\n4. Grapes\n5. Watermelon");
        System.out.println("Hello, enter the number of the product you want: ");
        int input = scan.nextInt();

        switch (input) {
            case 1 -> System.out.println("Here is your mango!");
            case 2 ->System.out.println("Here is your pineapple!");
            case 3 -> System.out.println("Here is your apple!");
            case 4 -> System.out.println("Here is your grape!");
            case 5 -> System.out.println("Here is your watermelon!");
            default -> System.out.println("Sorry, we don't have");
        }
        scan.close();
    }
    
}
