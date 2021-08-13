import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([|#])(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1");

        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        int sum = 0;

        while(matcher.find()){
            String name = matcher.group("name");
            String date = matcher.group("date");
            String calories = matcher.group("calories");

            String newStr = "Item: " + name + ", Best before: " + date + ", Nutrition: " + calories;
            list.add(newStr);

            sum += Integer.parseInt(calories);
        }

        sum /= 2000;
        System.out.println("You have food to last you for: " + sum + " days!");
        list.stream().forEach(System.out::println);

    }
}
