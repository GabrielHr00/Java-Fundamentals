import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String com = sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(com.equals("string")){
            System.out.println(stringy(a,b));
        }
        else if(com.equals("char")){
            System.out.println(chary(a.charAt(0),b.charAt(0)));
        }
        else{
            System.out.println(inty(Integer.parseInt(a),Integer.parseInt(b)));
        }
    }

    private static char chary(char a, char b){
        if(a > b){
            return a;
        }
        return b;
    }
    private static int inty(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    private static String stringy(String a, String b){
        if(a.compareTo(b) >= 0){
            return a;
        }
        return b;
    }
}
