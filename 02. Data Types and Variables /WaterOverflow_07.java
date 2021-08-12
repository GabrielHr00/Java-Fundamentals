import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int capacity = 255;
        int sum = 0;

        for(int i = 0; i < n; i++){
            int liters = Integer.parseInt(sc.nextLine());
            if(sum + liters > capacity){
                System.out.printf("Insufficient capacity!%n");
            }
            else{
                sum += liters;
            }
        }
        System.out.print(sum);
    }
}
