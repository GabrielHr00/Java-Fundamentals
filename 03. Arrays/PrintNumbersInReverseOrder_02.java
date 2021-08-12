import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] digits = new int[n];

        int num = Integer.parseInt(sc.nextLine());
        digits[0] = num;

        for(int i = 1; i < n; i++){
            num = Integer.parseInt(sc.nextLine());
            digits[i] = num;
        }

        for(int i = digits.length-1; i >= 0; i--){
            System.out.print(digits[i] + " ");
        }
    }
}
