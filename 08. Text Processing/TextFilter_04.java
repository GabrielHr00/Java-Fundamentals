import java.util.*;
import java.util.stream.Collectors;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String stringy = scanner.nextLine();

        for(var j : words){
            String star = toStar(j);
            stringy = stringy.replace(j, star);
        }
        System.out.println(stringy);
    }

    public static String toStar(String word){
        String st = "";
        for(int i = 0; i < word.length(); i++){
            st += "*";
        }
        return st;
    }
}
