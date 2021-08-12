import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        BigDecimal result = new BigDecimal(0);

        for(int i = 0; i < n; i++){
            BigDecimal currentNumber = new BigDecimal(sc.nextLine());
            result = result.add(currentNumber);
        }

        System.out.println(result);
    }
}
