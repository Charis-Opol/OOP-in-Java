import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordCounter {
    public static void main(String[] args) {
        String fileName = "mobydick.txt";
        // HashSet automatically ignores duplicates, making it perfect for unique counts
        Set<String> uniqueWords = new HashSet<>();
        
        System.out.println("Looking for Unique Words in: " + fileName + "\n");

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            
            // Set the Scanner to use a delimiter that splits on non-letter characters
            fileScanner.useDelimiter("[^a-zA-Z']+"); 

            // Read all words
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase(); // Convert to lowercase
                uniqueWords.add(word); 
            }
            
            // Number of unqiue words found
            System.out.println("Total number of unique words found: " + uniqueWords.size());
            
            // Allow User Search
            Scanner wordScanner = new Scanner(System.in);
            String input;
            
            System.out.println("\nWord Search Tool:");
            
            // Loop allows the user to check multiple words
            while (true) {
                System.out.print("Enter a word to search (or 'quit' to exit): ");
                input = wordScanner.nextLine().toLowerCase();
                
                if (input.equals("quit")) {
                    break;
                }
                
                if (uniqueWords.contains(input)) {
                    System.out.println("The word '" + input + "' DOES appear in the text file.");
                } else {
                    System.out.println("The word '" + input + "' does NOT appear in the text file.");
                }
            }
            
            wordScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found! Make sure '" + fileName + "' is in the same folder as your Java code.");
        }
    }
}