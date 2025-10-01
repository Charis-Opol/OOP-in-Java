package Groupwork;

public class QuestionJ6 {
    public static void main(String[] args){
        int p = 5;
        int q = 8;
        boolean sunny = false;

        boolean result1 = (p < q) && !sunny;
        System.out.println("Result: " + result1);
        boolean result2 = q % 2 == 0 || p > 10;
        System.out.println("Result2: " + result2);
        boolean result3 = !(p == 5) && (q != 8);
        System.out.println("Result3: " + result3);
        boolean result4 = q / 4 > 1;
        System.out.println("Result4: " + result4);
    }
    
}
