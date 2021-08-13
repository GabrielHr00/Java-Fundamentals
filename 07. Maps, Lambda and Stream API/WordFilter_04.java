import java.util.*;
import java.util.stream.Collectors;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);

        for(var i : arr){
            System.out.println(i);
        }
    }
}
