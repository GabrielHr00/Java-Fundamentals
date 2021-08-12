import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05_EX {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for(int i = 0; i < nums.length; i++){
            boolean found = true;
            int num = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(num <= nums[j]){
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.print(num + " ");
            }
        }
    }
}
