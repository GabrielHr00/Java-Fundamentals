import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        checkNumber(n);
    }

    private static void checkNumber(int number){
        if(number > 0){
            System.out.println("The number " + number + " is positive.");
        }
        else if(number < 0){
            System.out.println("The number " + number + " is negative.");
        }
        else{
            System.out.println("The number " + number + " is zero.");
        }
    }
}
