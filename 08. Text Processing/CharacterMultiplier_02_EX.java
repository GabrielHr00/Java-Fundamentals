import java.util.*;
import java.util.stream.Collectors;

public class CharacterMultiplier_02_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\s+");
        char[] first = array[0].toCharArray();
        char[] second = array[1].toCharArray();
        int size = second.length;
        int sum = 0;

        if(first.length < second.length){
            size = first.length;
        }

        for(int i = 0; i < size; i++){
            sum += (int) first[i] * second[i];
        }

        boolean foundf = false;
        boolean founds = false;
        if(first.length > second.length){
            foundf = true;
        }
        else{
            founds = true;
        }

        if(foundf){
            for(int i = size; i < first.length; i++){
                sum += first[i];
            }
        }
        else if(founds){
            for(int i = size; i < second.length; i++){
                sum += second[i];
            }
        }

        System.out.println(sum);
    }
}
