import java.util.Scanner;

public class StrongNumber_06_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int result = number;
        int totalSum = 0;

        while(number != 0){
            int digit = number % 10;
            int sum = 1;
            for(int j = 1; j <= digit; j++){
                sum *= j;
            }
            number /= 10;
            totalSum += sum;
        }

        if(result == totalSum){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
