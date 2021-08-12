import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        for(int i = 0;; i++){
            if(Math.abs(count) % 2 != 0){
                System.out.println("Please write an even number.");
            }
            else if(Math.abs(count) % 2 == 0){
                System.out.println("The number is: " + Math.abs(count));
                break;
            }
            count = Integer.parseInt(sc.nextLine());
        }
    }
}
