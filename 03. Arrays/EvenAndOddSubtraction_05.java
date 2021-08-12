import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] even = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 0; i < even.length; i++){
            if(even[i] % 2 == 0){
                sumEven += even[i];
            }
            else{
                sumOdd += even[i];
            }
        }

        System.out.print(sumEven-sumOdd);
    }
}
