import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b([0-9][0-9])([\\/\\-\\.])([A-Z][a-z]{2})\\2([1-3][0-9]{3})\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            String day = matcher.group(1);
            String month = matcher.group(3);
            String year = matcher.group(4);
            System.out.printf("Day: %s, Month: %s, Year: %s\n",day, month, year);
        }
    }
}
