import java.util.Scanner;

public class SmallestOfThreeNumbers_01_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.nextLine());
        int tw = Integer.parseInt(sc.nextLine());
        int th = Integer.parseInt(sc.nextLine());
        printSmallestNumber(one, tw, th);
    }

    public static void printSmallestNumber(int one, int two, int three){
        if(one < two && one < three){
            System.out.println(one);
        }else if( two < one && two < three){
            System.out.println(two);
        }else{
            System.out.println(three);
        }
    }
}
