import java.util.*;
import java.util.stream.Collectors;

public class Digits_Letters_Other_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        StringBuilder alp = new StringBuilder();
        StringBuilder dig = new StringBuilder();
        StringBuilder sym = new StringBuilder();

        for(int i = 0; i< words.length(); i++){
            char current = words.charAt(i);
            if(Character.isAlphabetic(current)){
                alp.append(current);
            }else if(Character.isDigit(current)){
                dig.append(current);
            }
            else{
                sym.append(current);
            }
        }

        System.out.println(dig);
        System.out.println(alp);
        System.out.println(sym);
    }
}
