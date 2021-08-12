import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int counter = 0;
        int sum = 0;
        int produced = 0;

        while(start >= 100){
            produced = start - 26;
            sum += produced;
            counter++;
            start = start - 10;
        }

        if(sum >= 26){
            sum -= 26;
        }

        System.out.printf(counter + "%n" + sum);
    }
}
