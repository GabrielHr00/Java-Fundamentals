import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String biggestKegg = "";
        double maxVolume = 0.0;

        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            float radius = Float.parseFloat(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if(volume > maxVolume){
                maxVolume = volume;
                biggestKegg = name;
            }
        }

        System.out.print(biggestKegg);
    }
}
