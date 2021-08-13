import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractEmails_06_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z0-9]+[.\\-\\_]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z])+");
        Matcher matcher = pattern.matcher(scan);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
