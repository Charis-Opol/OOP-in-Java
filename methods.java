public class methods {
    static void myMethod(){
        System.out.println("I just got executed!");
    }

    static String myStringMethod(String fname){
        return (fname + "Opol");
    }

    static void myMethod1(String fname, int age) {
        System.out.println(fname + " is " + age);
  }

    static void check_age(int age){
        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int add(int x, int y){
        return x + y;
    }

    static public int plusMethod(int x, int y){
        return x + y;
    }

    static public double plusMethod(double x, double y){
        return x + y;
    }
    
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myStringMethod("Charlene ");
        System.out.println("Hello Ms. " + myStringMethod("Charlene "));
        myStringMethod("Liam ");
        System.out.println("Hello Mr. " + myStringMethod("Liam "));
        myStringMethod("Jenny ");
        System.out.println("Hello Ms. " + myStringMethod("Jenny "));
        myStringMethod("Anja ");
        System.out.println("Hello Ms. " + myStringMethod("Anja "));

        myMethod1("Liam", 5);
        myMethod1("Jenny", 8);
        myMethod1("Anja", 31);

        check_age(20);
        check_age(15);

        add(4, 5);
        System.out.println(add(4, 5));
        System.out.println(add(10, 5));
        System.out.println(add(25, 75));


        System.out.println(plusMethod(8, 5));
        System.out.println(plusMethod(4.3, 6.26));

    }
}
