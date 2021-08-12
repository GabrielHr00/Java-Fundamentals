import java.util.Scanner;

public class MultiplicationTable_20_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int count1 = Integer.parseInt(sc.nextLine());

        if(count1 <= 10){
            for(int i = count1; i <= 10; i++){
                int sum = 0;
                sum = count * i;
                System.out.println(count + " X " + i + " = " + sum);
            }
        }else{
            int sum = 0;
            sum = count * count1;
            System.out.println(count + " X " + count1 + " = " + sum);
        }
    }
}
