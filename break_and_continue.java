public class break_and_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break; // Exit the loop when i is 4
            }
            System.out.println(i);
        }

        System.out.println("Loop is finished");

        for (int j = 1; j <= 10; j++) {
            if (j == 4 || j == 6) {
                continue; // Skip the rest of the loop when j is 4
            }
            System.out.println(j);
        }

        System.out.println("Loop is finished");
    }
    
}
