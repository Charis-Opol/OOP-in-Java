

public class Boolean {
    public static void main(String[] args){
        int x = 10;
        int y = 9;
        System.out.println(x > y);  // returns true, because 10 is higher than 9
        System.out.println(x < y);  // returns false, because 10 is not less than 9
        System.out.println(x == y); // returns false, because 10 is not equal to 9
        System.out.println(x != y); // returns true, because 10 is not equal to 9
        System.out.println(x >= y); // returns true, because 10 is greater, or equal, to 9
        System.out.println(x <= y); // returns false, because 10 is neither less than nor equal to 9

        boolean isRaining = true;
        if (isRaining){
            System.out.println("Bring an umbrella!");
        }
        else{
            System.out.println("Enjoy your day!");
        }
    }
    
}
