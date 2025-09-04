public class for_loop {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            System.out.println(i);
        }

        System.out.println("Loop is finished");

        for (int countdown = 10; countdown > 0; countdown--){
            System.out.println(countdown);
        }

        System.out.println("Happy New Year!!");

        for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum = sum + i;
        }

        System.out.println("The sum is: " + sum);

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars){
            System.out.println(car);
        }
}

}

