import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountChars {

            public static void main(String[] args) {
                try { // Required by Files.readAllLines(filePath);
                    // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
                    Path filePath = Paths.get("da_vinci_code.txt");
                    List<String> lines = Files.readAllLines(filePath);
                    System.out.println(lines.get(0)); // Prints the first line of the file
                } catch (Exception e) {
                    System.out.println("This is not what you want to read");
                }
            }
        }
        // Create a function that takes the filepath (e.g. "da_vinci_code.txt") as an input, reads the given file, and counts the occurences of 0, 1 and x characters in it.
        // The function should return a dictionary in which the searched characters are the keys and the number of their occurences are the values.
        // Use the uploaded da_vinci_code.txt file in this folder in the repo to test your program.


// Map<String, Integer> countedLetters = countLetters("da_vinci_code.txt");
// System.out.println("0 occured " + countedLetters.get("0") + " times in the file.");
// System.out.println("1 occured " + countedLetters.get("1") + " times in the file.");
// System.out.println("x occured " + countedLetters.get("x") + " times in the file.");
//    }
//}