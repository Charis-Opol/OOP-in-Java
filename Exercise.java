import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> allWords = new ArrayList<String>();
        try (Scanner input = new Scanner(new File("C:\\Users\\chari\\Desktop\\OOP in Java\\Words.txt"))) {
            while (input.hasNextLine()){
                String word = input.nextLine();
                allWords.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }
        System.out.println(allWords);
        for (int i = 0; i < allWords.size(); i++){
            String word = allWords.get(i);
            if (word.endsWith("e")){
                allWords.remove(i);
                i--;
            }
        }
        System.out.println(allWords);
    }

}
