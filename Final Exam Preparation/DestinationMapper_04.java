import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Pattern pattern = Pattern.compile("([\\/\\=])([A-Z][A-Za-z][A-Za-z]+)\\1");
        Matcher matcher = pattern.matcher(command);

        List<String> destinations = new ArrayList<>();
        int sum = 0;

        while(matcher.find()){
            destinations.add(matcher.group(2));
            sum += matcher.group(2).length();
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinations));
        System.out.printf("Travel Points: %d\n",sum);

    }
}
