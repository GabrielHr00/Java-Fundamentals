import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String com = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if(com.equals("add")){
            add(a,b);
        }
        else if(com.equals("multiply")){
            multiply(a,b);
        }
        else if(com.equals("subtract")){
            subtract(a,b);
        }
        else if(com.equals("divide")){
            divide(a,b);
        }
    }

    private static void add(int a, int b){
        System.out.println(a + b);
    }
    private static void multiply(int a, int b){
        System.out.println(a*b);
    }
    private static void subtract(int a, int b){
        System.out.println(a - b);
    }
    private static void divide(int a, int b){
        System.out.println(a / b);
    }
}
