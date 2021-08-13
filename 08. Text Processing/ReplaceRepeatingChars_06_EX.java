import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ReplaceRepeatingChars_06_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        char res = input.charAt(0);
        result.append(res);

        for (int i = 1; i < input.toCharArray().length; i++) {
            if(input.charAt(i) == result.charAt(result.length() - 1)){
                input.replace(input.charAt(i), ' ').trim();
            }
            else{
                result.append(input.charAt(i));
            }
        }

        System.out.println(result);
    }
}
