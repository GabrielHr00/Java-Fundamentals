import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String com = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());

        repeat(com, a);
    }

    private static void repeat(String com, int a){
        for(int i = 0; i < a; i++){
            System.out.print(com);
        }
    }
}
