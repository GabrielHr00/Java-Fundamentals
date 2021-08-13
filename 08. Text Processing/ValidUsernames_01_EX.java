import java.util.*;
import java.util.stream.Collectors;

public class ValidUsernames_01_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(", ");
        List<String> list = new ArrayList<>();

        for(var i : array){
            if(checkValid(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkValid(String i){
        if(i.length() < 3 || i.length() > 16){return false;}

        for(char ji : i.toCharArray()){
            if(Character.isDigit(ji) || Character.isAlphabetic(ji) || ji == '_' || ji == '-'){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
