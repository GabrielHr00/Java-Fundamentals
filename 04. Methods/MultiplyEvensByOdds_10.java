import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sumEven = sume(n);
        int sumOdd = sumo(n);
        System.out.println(sumEven*sumOdd);
    }

    private static int sumo(int n){
        int sum = 0;
        while(n != 0){
            if((n%10) % 2 != 0){
                sum += n%10;
            }
            n = n/10;
        }
        return sum;
    }
    private static int sume(int n){
        int sum = 0;
        while(n != 0){
            if((n%10) % 2 == 0){
                sum += n%10;
            }
            n = n/10;
        }
        return sum;
    }
}
