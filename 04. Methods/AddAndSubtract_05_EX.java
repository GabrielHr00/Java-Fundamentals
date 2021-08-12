import java.util.Scanner;

public class AddAndSubtract_05_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());
        int t = Integer.parseInt(sc.nextLine());
        int th = Integer.parseInt(sc.nextLine());

        System.out.println(DIGIT(one, t, th));
    }

    public static int DIGIT(int o, int t, int th){
        return (o + t) - th;
    }
}
