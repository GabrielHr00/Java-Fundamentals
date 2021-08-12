import java.util.Scanner;

public class VowelsCount_02_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        vowelsCount(s);
    }

    public static void vowelsCount(String s){
        int count = 0;

        for(int i = 0; i <= s.length()-1; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'O' || s.charAt(i) == 'I' || s.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
