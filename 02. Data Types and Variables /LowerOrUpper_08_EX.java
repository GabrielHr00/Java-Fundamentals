import java.util.Scanner;

public class LowerOrUpper_08_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char name1 = sc.nextLine().charAt(0);

        boolean upper = Character.isUpperCase(name1);

        if(upper == true){
            System.out.println("upper-case");
        }
        else{ System.out.println("lower-case");}
    }
}
