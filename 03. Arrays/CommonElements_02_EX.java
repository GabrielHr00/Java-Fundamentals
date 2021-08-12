import java.util.Scanner;

public class CommonElements_02_EX {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        String[] array1 = first.split(" ");
        String[] array2 = second.split(" ");

        for(String each : array2){
            for(String each2 : array1){
                if(each.equals(each2)){
                    System.out.print(each2 + " ");
                }
            }
        }
    }
}
