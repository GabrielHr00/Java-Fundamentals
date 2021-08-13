import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> list = new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group());
        }

        System.out.println(String.join(", ", list));
    }
}
