import java.util.Scanner;

public class ConvertMetersToKilometers_01_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kilom = Integer.parseInt(sc.nextLine());

        Double result = (1.0*kilom)/1000;
        System.out.printf("%.2f%n", result);
    }
}
