import java.util.*;
import java.util.stream.Collectors;

public class CaesarCipher_04_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array = scanner.nextLine();
        StringBuilder build= new StringBuilder();

        for(var i : array.toCharArray()){
            char sym = (char)(i + 3);
            build.append(sym);
        }
        System.out.println(build);
    }
}
