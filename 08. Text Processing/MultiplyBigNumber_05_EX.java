import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class MultiplyBigNumber_05_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal first = new BigDecimal(scanner.nextLine());
        BigDecimal second = new BigDecimal(scanner.nextLine());

        BigDecimal result = first.multiply(second);
        System.out.println(result);

    }
}
