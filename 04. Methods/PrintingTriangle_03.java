import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printTop(n);
        printBottom(n);
    }

    private static void printTop(int number){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    private static void printBottom(int number){
        for(int i = number-1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
