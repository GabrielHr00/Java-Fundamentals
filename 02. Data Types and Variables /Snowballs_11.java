import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double maxVal = 0.0;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQual = 0;

        for(int i = 0; i < n; i++){
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow(snowballSnow/snowballTime, (double)snowballQuality);
            if(snowballValue > maxVal){
                maxVal = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQual = snowballQuality;
            }
        }

        System.out.print(maxSnow + " : " + maxTime + " = " + ((int)maxVal) + " (" + maxQual + ")");
    }
}
