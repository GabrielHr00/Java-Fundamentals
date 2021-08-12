import java.util.Scanner;

public class SpecialNumbers_10_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i++){
            int sum = 0;
            int diff = i;
            while(diff != 0){
                int current = diff % 10;
                sum += current;
                diff = diff /= 10;
            }
            if(sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            }else{System.out.printf("%d -> False%n",i);}
        }
    }
}
