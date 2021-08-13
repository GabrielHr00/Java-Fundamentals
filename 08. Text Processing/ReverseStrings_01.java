import java.util.*;
import java.util.stream.Collectors;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sc = scanner.nextLine();

        while(!sc.equals("end")){
            StringBuilder reve = new StringBuilder();
            for(int i = sc.length() - 1; i >= 0; i--){
                reve.append(sc.charAt(i));
            }
            System.out.println(sc + " = " + reve.toString());
            sc = scanner.nextLine();
        }
    }
}
