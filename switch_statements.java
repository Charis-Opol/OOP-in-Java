public class switch_statements {
    public static void main(String[] args){
        int day = (int) (Math.random() * 7);
        switch (day){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }

        int day1 = 4;
        switch (day1){
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Looking forward to the weekend!");
        }

    }
    
}
