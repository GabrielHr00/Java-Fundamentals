import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for(int i = 1; i <= count; i++){
            int j = 2*i - 1;
            sum += j;
            System.out.println(j);
        }

        System.out.println("Sum: " + sum);
    }
}
