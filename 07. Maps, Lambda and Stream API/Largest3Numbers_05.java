import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((left, right) -> right.compareTo(left))
                .limit(3).forEach(e -> System.out.print(e + " "));
    }
}
