public class while_loop {
    public static void main(String[] args) {
        int i = 1;
        while (i < 6){
            System.out.println(i);
            i++;
        }
        System.out.println("Loop is finished");

        int countdown = 10;

        while (countdown > 0){
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        int j = 0;
        do { 
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}
