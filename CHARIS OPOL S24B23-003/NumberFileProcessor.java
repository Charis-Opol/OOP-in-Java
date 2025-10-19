import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberFileProcessor {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Reading Numbers from File: " + fileName + "\n");

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            
            // Read all numbers and store them in the list
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                numbers.add(number);
            }
            
            System.out.println("All numbers in the list: " + numbers);
            
            if (numbers.isEmpty()) {
                System.out.println("The file was empty. Cannot perform calculations.");
                return;
            }

            // Calculating the Average 
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double average = sum / numbers.size();
            System.out.printf("Average of the numbers: %.2f\n", average);

            // Find Highest and Lowest
            // Collections.min/max is an easy way to find min/max in an ArrayList
            int highest = Collections.max(numbers);
            int lowest = Collections.min(numbers);
            System.out.println("Highest number: " + highest);
            System.out.println("Lowest number: " + lowest);

            // Filter Out Even Numbers
            ArrayList<Integer> oddNumbers = new ArrayList<>();
            for (int num : numbers) {
                // If the remainder when divided by 2 is NOT 0, it's odd (not even)
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            System.out.println("5. Odd numbers (filtered out the evens): " + oddNumbers);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found! Make sure '" + fileName + "' is in the same folder as your Java code.");

        }
    }
}