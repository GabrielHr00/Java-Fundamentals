import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<name>[A-Za-z][A-Za-z][A-Za-z]+)\\1\\1(?<name2>[A-Za-z][A-Za-z][A-Za-z]+)\\1");

        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        int count = 0;

        while(matcher.find()){
            String first = matcher.group("name");
            String second = matcher.group("name2");
            count++;

            StringBuilder reversed = new StringBuilder(second);
            reversed.reverse();

            if(reversed.toString().equals(first)){
                list.add(first + " <=> " + second);
            }
        }

        if(count != 0){
            System.out.println(count + " word pairs found!");
        }
        else{
            System.out.println("No word pairs found!");
        }

        if(!list.isEmpty()){
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", list));
        }
        else{
            System.out.println("No mirror words!");
        }
    }
}
