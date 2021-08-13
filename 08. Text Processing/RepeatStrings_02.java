import java.util.*;
import java.util.stream.Collectors;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sc = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String[] newString = sc.split("\\s+");
        for(int i = 0; i < newString.length; i++){
            String get = newString[i];
            for(int j = 0; j < get.length(); j++){
                sb.append(get);
            }
        }
        System.out.println(sb);
    }
}
