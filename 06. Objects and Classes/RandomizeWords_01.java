import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");
        Random rnd = new Random();

        for(int i = 0; i < words.length; i++){
            int index = rnd.nextInt(words.length);

            String help = words[i];
            words[i] = words[index];
            words[index] = help;
        }

        for(var e : words){
            System.out.println(e);
        }
    }
}
