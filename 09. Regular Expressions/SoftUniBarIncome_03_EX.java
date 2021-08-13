import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0.0;

        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$");

        while(!command.equals("end of shift")) {
            Matcher matcher = pattern.matcher(command);
            if(matcher.find()){
                String name = matcher.group("customer");
                String prod = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double inter = (price*count);
                System.out.printf("%s: %s - %.2f\n", name, prod, inter);
                sum += (price * count);
            }
            command = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
