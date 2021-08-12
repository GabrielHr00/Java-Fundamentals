import java.util.Scanner;

public class ReversedChars_07_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char name1 = sc.nextLine().charAt(0);
        char name2 = sc.nextLine().charAt(0);
        char city = sc.nextLine().charAt(0);

        System.out.println("" + city + " " + name2 + " " + name1);
    }
}
