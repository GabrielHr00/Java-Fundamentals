import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class LettersChangeNumbers_08_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        double sum = 0.0;
        //a - 97
        //A - 65

        for(var i : words){
            char first = i.charAt(0);
            char last = i.charAt(i.length() - 1);

            String inter = i.replace(Character.toString(first), "");
            double number = Double.parseDouble(inter.replace(Character.toString(last), ""));

            int firstPosition = 0;
            int secondPosition = 0;

            if(Character.isLowerCase(first)){
                firstPosition = first - 96;
                number *= firstPosition;
            }
            else if(Character.isUpperCase(first)){
                firstPosition = first - 64;
                number /= firstPosition;
            }

            if(Character.isLowerCase(last)){
                secondPosition = last - 96;
                number += secondPosition;
            }
            else if(Character.isUpperCase(last)){
                secondPosition = last - 64;
                number -= secondPosition;
            }

            sum += number;
        }

        System.out.printf("%.2f",sum);
    }
}
