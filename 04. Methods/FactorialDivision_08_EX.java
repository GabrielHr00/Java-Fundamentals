import java.util.Scanner;

public class FactorialDivision_08_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());

        Double resOne = fact(one);
        Double resTwo = fact(two);

        Double result = resOne/resTwo;
        System.out.printf("%.2f%n", result);
    }

    public static Double fact(int num){
        Double result = 1.0;

        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}
