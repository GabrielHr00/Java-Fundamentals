import java.util.Scanner;

public class TriangleOfNumbers_08_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= number; i++){
            int j = i;
            while(j != 0){
                System.out.print(i + " ");
                j--;
            }
            System.out.println();
        }
    }
}
