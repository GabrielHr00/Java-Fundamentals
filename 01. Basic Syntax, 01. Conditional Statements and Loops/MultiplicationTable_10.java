import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= 10; i++){
            int sum = 0;
            sum = count * i;
            System.out.println(count + " X " + i + " = " + sum);
        }
    }
}
