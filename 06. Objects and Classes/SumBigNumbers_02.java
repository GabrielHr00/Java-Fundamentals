import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger first = new BigInteger(sc.nextLine());
        BigInteger second = new BigInteger(sc.nextLine());

        BigInteger sum = first.add(second);

        System.out.println(sum);
    }
}
