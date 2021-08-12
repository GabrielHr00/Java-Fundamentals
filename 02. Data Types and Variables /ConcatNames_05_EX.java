import java.util.Scanner;

public class ConcatNames_05_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String city = sc.nextLine();

        System.out.println(name1 + city + name2);
    }
}
