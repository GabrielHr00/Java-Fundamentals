import java.util.Scanner;

public class ArrayRotation_04_EX {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] number = input.split(" ");
        int count = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= count; i++){
            String first = number[0];
            for(int j = 0; j < number.length - 1; j++){
                number[j] = number[j+1];
            }
            number[number.length -1] = first;
        }
        System.out.println(String.join(" ", number));
    }
}
