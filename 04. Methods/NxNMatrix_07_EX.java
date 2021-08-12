import java.util.Scanner;

public class NxNMatrix_07_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < one; i++){
            DIGIT(one);
            System.out.println();
        }
    }

    public static void DIGIT(int o){
        for(int i =0; i < o; i++){
            System.out.print(o + " ");
        }
    }
}
