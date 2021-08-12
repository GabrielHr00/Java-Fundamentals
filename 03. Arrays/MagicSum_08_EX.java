import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08_EX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int id = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < number.length; i++){
            int current = number[i];

            for(int j = i+1; j < number.length; j++){
                if((current + number[j]) == id){
                    System.out.println(current + " " + number[j]);
                    break;
                }
            }
        }
    }
}
