import java.util.Scanner;

public class VendingMachine_07_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        Double sum = 0.0;

        // if(Double.parseDouble(order) != 0.1 || Double.parseDouble(order) != 0.2 || Double.parseDouble(order) != 0.5 || Int.parseInteger(order) != 1 || Int.parseInteger(order) != 2){
        //     System.out.printf("Cannot accept %.2f", Double.parseDouble(order));
        // }
        // else{
        while(!order.equals("Start")){
            if(Double.parseDouble(order) == 0.1 || Double.parseDouble(order) == 0.2 || Double.parseDouble(order) == 0.5 || order.equals("1") || order.equals("2")){
                sum +=  Double.parseDouble(order);
            }
            else {
                System.out.printf("Cannot accept %.2f", Double.parseDouble(order));
                System.out.println();
            }
            order = sc.nextLine();
        }
        //}

        Double price = 0.0;
        order = sc.nextLine();

        while(!order.equals("End")){
            if(order.equals("Nuts") || order.equals("Water") || order.equals("Crisps") || order.equals("Soda") || order.equals("Coke")){
                if(order.equals("Nuts")){
                    price = 2.0;
                }
                else if(order.equals("Water")){
                    price = 0.7;
                }
                else if(order.equals("Crisps")){
                    price = 1.5;
                }
                else if(order.equals("Soda")){
                    price = 0.8;
                }
                else if(order.equals("Coke")){
                    price = 1.0;
                }

                if(price > sum){
                    System.out.println("Sorry, not enough money");
                }
                else{
                    sum -= price;
                    System.out.println("Purchased " + order);
                }
            }
            else{
                System.out.println("Invalid product");
            }
            order = sc.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
