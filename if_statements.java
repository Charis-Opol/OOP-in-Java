

public class if_statements {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x < y){
            System.out.println("x is less than y");
        }
        else{
            System.out.println("x is greater than y");
        }

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // Nested if statements
        int a = 25;
        int b = 15;

        if (b > 10) {
            System.out.println("b is greater than 10");

            if (a > 10) {
                System.out.println("a is also greater than 10");
            }
        }
    }}
    
