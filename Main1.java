class Calculator1 {
	// Example method
	public int add(int a, int b) {
		return a + b;
	}
}

public class Main1 {
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		int result = calc.add(2, 3);
		System.out.println("Result: " + result);
	}
}