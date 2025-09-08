public class methods_in_oop {
    static class calculator {
        int add(int a, int b){
            return a + b;
        }

        int subtract(int a, int b){
            return a - b;
        }

        int multiply(int a, int b){
            return a * b;
        }

        int divide(int a, int b){
            return a / b;
        }
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        int sum = calc.add(5, 3);
        int difference = calc.subtract(10, 4);
        int product = calc.multiply(6, 7);
        int quotient = calc.divide(20, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
