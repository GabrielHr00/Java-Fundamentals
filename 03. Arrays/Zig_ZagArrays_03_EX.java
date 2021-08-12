import java.util.Scanner;

public class Zig_ZagArrays_03_EX {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for(int i=1; i <= n; i++){
            String input = scan.nextLine();
            int firstInt = Integer.parseInt(input.split(" ")[0]);
            int secondInt = Integer.parseInt(input.split(" ")[1]);

            if(i % 2 != 0){
                array1[i-1] = firstInt;
                array2[i-1] = secondInt;
            }
            else{
                array1[i-1] = secondInt;
                array2[i-1] = firstInt;
            }
        }

        for(int each : array1){
            System.out.print(each + " ");
        }

        System.out.println();

        for(int each : array2){
            System.out.print(each + " ");
        }
    }
}
