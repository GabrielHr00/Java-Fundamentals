import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());

        BigInteger result = new BigInteger("1");
        BigInteger j = new BigInteger("1");

        for(int i = 1; i <= first; i++){
            result = result.multiply(j);
            j = j.add(new BigInteger("1"));
        }
        System.out.println(result);
    }
}
