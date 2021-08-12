import java.util.Scanner;

public class PrintandSum_04_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int startNumber = Integer.parseInt(sc.nextLine());
        int endNumber = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i = startNumber; i <= endNumber; i++){
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
