import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;

        if(age < 0 || age > 122){
            System.out.println("Error!");
        }
        else {
            if(day.equals("Weekday")){
                if(age > 18 &&  age <= 64){
                    price = 18;
                }else if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                    price = 12;
                }
            }
            else if(day.equals("Weekend")){
                if(age > 18 &&  age <= 64){
                    price = 20;
                }
                else if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                    price = 15;
                }
            }
            else{
                if(age >= 0 && age <= 18){
                    price = 5;
                }
                else if(age > 18 && age <= 64){
                    price = 12;
                }
                else{
                    price = 10;
                }
            }
            System.out.println(price + "$");
            }
    }
}
