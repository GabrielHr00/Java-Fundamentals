import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06_EX {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int [] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean found = false;

        for(int i = 0; i < number.length; i++){
            int current = number[i];
            int leftsum = 0;
            int rightsum = 0;

            for(int left = 0; left < i; left++){
                leftsum += number[left];
            }

            for(int right = i+1; right < number.length; right++){
                rightsum += number[right];
            }

            if(leftsum == rightsum){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("no");
        }
    }
}
