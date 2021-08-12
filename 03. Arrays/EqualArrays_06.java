import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] one = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] two = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean found = true;
        int sum = 0;

        for(int i = 0; i < two.length; i++){
            sum += one[i];
            if(one[i] != two[i]){
                found = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if(found){
            System.out.print("Arrays are identical. Sum: " + sum);
        }
    }
}
