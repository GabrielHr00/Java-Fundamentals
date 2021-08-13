import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BigInteger cool = new BigInteger("1");

        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                cool = cool.multiply(new BigInteger(Character.toString(input.charAt(i))));
            }
        }

        Pattern pattern = Pattern.compile("(?<sep>\\:\\:|\\*\\*)(?<emoji>[A-Z][a-z][a-z]+)\\1");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        List<String> list = new ArrayList<>();

        while(matcher.find()){
            BigInteger sum = new BigInteger("0");
            String emoji = matcher.group("emoji");
            String sep = matcher.group("sep");

            count += 1;
            for(var i : emoji.toCharArray()){
                int n = i;
                sum = sum.add(new BigInteger(Integer.toString(n)));
            }

            if(sum.compareTo(cool) != -1){
                list.add(sep + emoji + sep);
            }
        }

        System.out.println("Cool threshold: " + cool);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        list.stream().forEach(e -> System.out.println(e));
    }
}
