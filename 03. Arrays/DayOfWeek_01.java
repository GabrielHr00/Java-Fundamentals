import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if(n >= 1 && n <= 7){
            System.out.println(names[n-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
