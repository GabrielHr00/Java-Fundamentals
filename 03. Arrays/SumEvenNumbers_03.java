import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] even = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;
        for(int i = 0; i < even.length; i++){
            if(even[i] % 2 == 0){
                sum += even[i];
            }
        }
        System.out.println(sum);
    }
}
