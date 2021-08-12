import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        if(people % capacity == 0){
            System.out.println(people/capacity);
            return;
        }
        System.out.println((people/capacity) + 1);
    }
}
