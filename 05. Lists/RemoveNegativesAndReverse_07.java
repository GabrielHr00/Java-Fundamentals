import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int size = list.size();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 0){
                list.remove(i);
                i--;
            }
        }
        Collections.reverse(list);

        if(list.isEmpty()){
            System.out.println("empty");
            return;
        }
        list.forEach(e-> System.out.print(e + " "));
    }
}
