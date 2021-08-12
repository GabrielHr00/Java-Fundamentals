import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String op = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());

        System.out.printf("%.0f", calc(a,op,b));
    }

    private static double calc(int a, String op, int b){
        double result = 0.0;

        switch(op){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
        }
        return result;
    }
}
