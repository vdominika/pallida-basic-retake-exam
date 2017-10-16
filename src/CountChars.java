import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

public class CountChars {

            public static void main(String[] args) {
                try {
                    Path filePath = Paths.get("da_vinci_code.txt");
                    List<String> lines = Files.readAllLines(filePath);
                    System.out.println(lines.get(0));
                } catch (Exception e) {
                    System.out.println("This is not what you want to read");
                }
            }


 Map<String, Integer> countedLetters = countLetters("da_vinci_code.txt");
 System.out.println("0 occured " + countedLetters.get("0") + " times in the file.");
 System.out.println("1 occured " + countedLetters.get("1") + " times in the file.");
 System.out.println("x occured " + countedLetters.get("x") + " times in the file.");
    }
}