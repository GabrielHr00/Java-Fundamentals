import java.util.Scanner;

public class Back_In_30_Minutes_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());


        minutes += 30;
        if(minutes >= 60){
            minutes -= 60;
            if(hours == 23){
                hours = 0;
            }
            else{hours++;}
        }

        if(minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else{System.out.printf("%d:%d", hours, minutes);}

    }
}
