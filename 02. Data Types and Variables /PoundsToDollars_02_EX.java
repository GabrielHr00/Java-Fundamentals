import java.util.Scanner;

public class PoundsToDollars_02_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pound = Double.parseDouble(sc.nextLine());

        double result = 1.31*pound;
        System.out.printf("%.3f%n", result);
    }
}
