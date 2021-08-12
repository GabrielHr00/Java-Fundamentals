import java.math.BigInteger;
import java.util.Scanner;

public class TownInfo_04_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        BigInteger population = new BigInteger(sc.nextLine());
        double area = Double.parseDouble(sc.nextLine());

        System.out.printf("Town %s has population of %s and area %.0f square km.",city,population.toString(),area);
    }
}
