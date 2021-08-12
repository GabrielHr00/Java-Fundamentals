import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String com = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());

        double price = 0.0;
        if(com.equals("water")){
            price = 1.00;
        }
        else if(com.equals("coffee")){
            price = 1.50;
        }
        else if(com.equals("coke")){
            price = 1.40;
        }
        else if(com.equals("snacks")){
            price = 2.00;;
        }
        add(a, price);
    }

    private static void add(int quantity, double price){
        System.out.printf("%.2f", price*quantity);
    }
}
