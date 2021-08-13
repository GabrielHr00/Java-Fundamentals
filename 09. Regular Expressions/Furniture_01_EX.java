import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0.0;
        List<String> furnis = new ArrayList<>();

        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)\\!(?<count>\\d+)");

        while(!command.equals("Purchase")){
            Matcher matcher = pattern.matcher(command);
            if(matcher.find()){
                String furn = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                furnis.add(furn);
                sum += (price * count);
            }
            command = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        furnis.stream().forEach(System.out::println);
        System.out.print("Total money spend: ");
        System.out.printf("%.2f", sum);
    }
}
