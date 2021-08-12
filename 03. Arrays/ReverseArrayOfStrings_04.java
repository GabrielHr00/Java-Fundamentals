import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] even = sc.nextLine().split("\\s+");
        for(int i = 0; i < even.length/2; i++){
            String help = even[i];

            even[i] = even[even.length - 1 - i];
            even[even.length - 1 - i] = help;
        }

        for(String s : even){
            System.out.print(s + " ");
        }
    }
}
