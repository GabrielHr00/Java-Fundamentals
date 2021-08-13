import java.text.Format;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("[, ]+")).sorted(String::compareTo).collect(Collectors.toList());

        Pattern health = Pattern.compile("([^\\d+\\-*.,\\/\\s+])");
        Pattern damage = Pattern.compile("(-?\\d+\\.?[0-9]*)");
        Pattern operation = Pattern.compile("([*/])");


        for(var i : list){
            int healthy = 0;
            double damagy = 0.0;

            Matcher matcher = health.matcher(i);

            while(matcher.find()){
                String me = matcher.group(1);
                healthy += me.charAt(0);
            }

            matcher = damage.matcher(i);

            while(matcher.find()){
                String me = matcher.group();
                damagy += Double.parseDouble(me);
            }

            matcher = operation.matcher(i);

            while(matcher.find()){
                if(matcher.group(1).equals("*")){
                    damagy *= 2;

                }
                else{
                    damagy /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", i, healthy, damagy);
        }
    }
}
