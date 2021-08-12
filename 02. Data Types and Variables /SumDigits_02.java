import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());

        int sum = 0;

        while(firstNumber != 0){
            sum += firstNumber%10;
            firstNumber /= 10;
        }

        System.out.println(sum);
    }
}
