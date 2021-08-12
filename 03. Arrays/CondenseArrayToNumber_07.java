import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] one = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while(one.length > 1){
            int[] newone = new int[one.length-1];

            for(int i = 0; i < one.length-1; i++){
                newone[i] = one[i] + one[i+1];
            }
            one = newone;
        }
        System.out.print(one[0]);
    }
}
