import java.util.*;
import java.util.stream.Collectors;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String stringy = scanner.nextLine();

        while(stringy.contains(word)){
            stringy = stringy.replace(word, "");
        }
        System.out.println(stringy);
    }
}
