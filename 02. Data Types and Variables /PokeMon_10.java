import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int power1 = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exFactor = Integer.parseInt(sc.nextLine());

        int power = power1;
        int count = 0;

        while(power > distance){
            power -= distance;
            if((1.0*power) == (0.5*power1)){
                if(exFactor > 0){
                    power = power/exFactor;
                }
            }
            ++count;
        }

        System.out.printf(power + "%n" + count);
    }
}
