import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("\\@(#+)(?<code>[A-Z][0-9A-Za-z]{4,}[A-Z])\\@(#+)");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String code = matcher.group("code");
                StringBuilder concat = new StringBuilder("");

                for(int j = 0; j < code.length(); j++){
                    if(Character.isDigit(code.charAt(j))){
                        concat.append(code.charAt(j));
                    }
                }

                if(concat.toString().equals("")){
                    concat = new StringBuilder("00");
                }
                System.out.println("Product group: " + concat);
            }
            else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
