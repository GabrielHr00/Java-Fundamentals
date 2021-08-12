import java.util.Scanner;

public class Train_01_EX {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int i =1; i <= n; i++){
            int people = Integer.parseInt(scan.nextLine());
            sum += people;
            System.out.print(people + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
