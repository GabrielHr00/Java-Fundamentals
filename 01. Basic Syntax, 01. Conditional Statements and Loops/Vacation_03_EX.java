import java.util.Scanner;

public class Vacation_03_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String groupName = sc.nextLine();
        String day = sc.nextLine();

        Double totalSum = 0.0;
        Double price = 0.0;

        if(groupName.equals("Students")){
            if(day.equals("Friday")){
                price = 8.45;
            }else if(day.equals("Saturday")){
                price = 9.80;
            }
            else {
                price = 10.46;
            }

            totalSum = price*people;
            if(people >= 30){
                totalSum = totalSum - 0.15*totalSum;
            }

        }
        else if(groupName.equals("Business")){
            if(day.equals("Friday")){
                price = 10.90;
            }else if(day.equals("Saturday")){
                price = 15.60;
            }
            else {
                price = 16.0;
            }

            totalSum = price*people;
            if(people >= 100){
                totalSum -= 10*price;
            }
        }
        else if(groupName.equals("Regular")){
            if(day.equals("Friday")){
                price = 15.0;
            }else if(day.equals("Saturday")){
                price = 20.0;
            }
            else {
                price = 22.50;
            }

            totalSum = price*people;
            if(people >= 10 && people <= 20){
                totalSum = totalSum - 0.05*totalSum;
            }
        }

        System.out.printf("Total price: %.2f", totalSum);
    }
}
