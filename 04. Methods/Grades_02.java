import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n = Double.parseDouble(sc.nextLine());

        checkNumber(n);
    }

    private static void checkNumber(double number){
        if(number >= 2.00 && number <= 2.99){
            System.out.println("Fail");
        }
        else if(number >= 3.00 && number <= 3.49){
            System.out.println("Poor");
        }
        else if(number >= 3.50 && number <= 4.49){
            System.out.println("Good");
        }
        else if(number >= 4.50 && number <= 5.49){
            System.out.println("Very good");
        }
        else if(number >= 5.50 && number <= 6.00){
            System.out.println("Excellent");
        }
    }
}
