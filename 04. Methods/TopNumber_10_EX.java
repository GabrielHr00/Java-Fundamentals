import java.util.Scanner;

public class TopNumber_10_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=1; i < n; i++){
            if(odd(i) && div(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean odd(int o){
        for(int i= 0; i < o; i++){
            int a = o % 10;
            if(a == 1 || a == 3 || a == 5 || a == 7 || a == 9){
                return true;
            }
            o = o/10;
        }
        return false;
    }

    public static boolean div(int o){
        int sum = 0;
        while(o != 0){
            sum += o%10;
            o /= 10;
        }
        if(sum % 8 == 0){
            return true;
        }
        return false;
    }
}
