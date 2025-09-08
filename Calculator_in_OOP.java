public class Calculator_in_OOP {
    double add;
    double subtract;
    double multipy;
    double divide;

    public Calculator_in_OOP(double num1, double num2){
        add = num1 + num2;
        subtract = num1 - num2; 
        multipy = num1 * num2;
        divide = num1 / num2;
    }

    public static void main(String[] args) {
        Calculator_in_OOP calc = new Calculator_in_OOP(10, 5);
        System.out.println("Addition: " + calc.add);
        System.out.println("Subtraction: " + calc.subtract);
        System.out.println("Multiplication: " + calc.multipy);
        System.out.println("Division: " + calc.divide);
    }
}
