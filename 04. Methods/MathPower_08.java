import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double high = Double.parseDouble(sc.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(a, high)));
    }

    private static double calculate(double a, double high){
        return Math.pow(a, high);
    }
}
