public class recursion {
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorialIterative(int n){
        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        } else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number  = 5; // Example number to calculate factorial
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        int iterativeResult = factorialIterative(number);
        System.out.println("Iterative Factorial of " + number + " is: " + iterativeResult);
        int fibNumber = 6; // Example number to calculate Fibonacci
        int fibResult = fibonacci(fibNumber);
        System.out.println("Fibonacci of " + fibNumber + " is: " + fibResult);
        int fibNumber2 = 8; // Another example number to calculate Fibonacci
        int fibResult2 = fibonacci(fibNumber2);
        System.out.println("Fibonacci of " + fibNumber2 + " is: " + fibResult2);
    }
    
}
